package metlife

import org.springframework.dao.DataIntegrityViolationException

class MetlifeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
	
        params.max = Math.min(max ?: 10, 100)
        [metlifeInstanceList: Metlife.list(params), metlifeInstanceTotal: Metlife.count()]
    }

    def create() {
        [metlifeInstance: new Metlife(params)]
    }

    def save() {
        def metlifeInstance = new Metlife(params)
        if (!metlifeInstance.save(flush: true)) {
            render(view: "create", model: [metlifeInstance: metlifeInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'metlife.label', default: 'Metlife'), metlifeInstance.id])
        redirect(action: "show", id: metlifeInstance.id)
    }

    def show(Long id) {
		
		
        def metlifeInstance = Metlife.get(id)
        if (!metlifeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'metlife.label', default: 'Metlife'), id])
            redirect(action: "list")
            return
        }

        [metlifeInstance: metlifeInstance]
    }

    def edit(Long id) {
        def metlifeInstance = Metlife.get(id)
        if (!metlifeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'metlife.label', default: 'Metlife'), id])
            redirect(action: "list")
            return
        }

        [metlifeInstance: metlifeInstance]
    }

    def update(Long id, Long version) {
        def metlifeInstance = Metlife.get(id)
        if (!metlifeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'metlife.label', default: 'Metlife'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (metlifeInstance.version > version) {
                metlifeInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'metlife.label', default: 'Metlife')] as Object[],
                          "Another user has updated this Metlife while you were editing")
                render(view: "edit", model: [metlifeInstance: metlifeInstance])
                return
            }
        }

        metlifeInstance.properties = params

        if (!metlifeInstance.save(flush: true)) {
            render(view: "edit", model: [metlifeInstance: metlifeInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'metlife.label', default: 'Metlife'), metlifeInstance.id])
        redirect(action: "show", id: metlifeInstance.id)
    }

    def delete(Long id) {
        def metlifeInstance = Metlife.get(id)
        if (!metlifeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'metlife.label', default: 'Metlife'), id])
            redirect(action: "list")
            return
        }

        try {
            metlifeInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'metlife.label', default: 'Metlife'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'metlife.label', default: 'Metlife'), id])
            redirect(action: "show", id: id)
        }
    }
}
