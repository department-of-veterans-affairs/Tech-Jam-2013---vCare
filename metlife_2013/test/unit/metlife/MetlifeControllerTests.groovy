package metlife



import org.junit.*
import grails.test.mixin.*

@TestFor(MetlifeController)
@Mock(Metlife)
class MetlifeControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/metlife/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.metlifeInstanceList.size() == 0
        assert model.metlifeInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.metlifeInstance != null
    }

    void testSave() {
        controller.save()

        assert model.metlifeInstance != null
        assert view == '/metlife/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/metlife/show/1'
        assert controller.flash.message != null
        assert Metlife.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/metlife/list'

        populateValidParams(params)
        def metlife = new Metlife(params)

        assert metlife.save() != null

        params.id = metlife.id

        def model = controller.show()

        assert model.metlifeInstance == metlife
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/metlife/list'

        populateValidParams(params)
        def metlife = new Metlife(params)

        assert metlife.save() != null

        params.id = metlife.id

        def model = controller.edit()

        assert model.metlifeInstance == metlife
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/metlife/list'

        response.reset()

        populateValidParams(params)
        def metlife = new Metlife(params)

        assert metlife.save() != null

        // test invalid parameters in update
        params.id = metlife.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/metlife/edit"
        assert model.metlifeInstance != null

        metlife.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/metlife/show/$metlife.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        metlife.clearErrors()

        populateValidParams(params)
        params.id = metlife.id
        params.version = -1
        controller.update()

        assert view == "/metlife/edit"
        assert model.metlifeInstance != null
        assert model.metlifeInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/metlife/list'

        response.reset()

        populateValidParams(params)
        def metlife = new Metlife(params)

        assert metlife.save() != null
        assert Metlife.count() == 1

        params.id = metlife.id

        controller.delete()

        assert Metlife.count() == 0
        assert Metlife.get(metlife.id) == null
        assert response.redirectedUrl == '/metlife/list'
    }
}
