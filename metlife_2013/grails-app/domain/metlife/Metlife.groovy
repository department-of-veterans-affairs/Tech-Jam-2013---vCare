package metlife

class Metlife {

	static mapping = {
		table 'test'
		// version is set to false, because this isn't available by default for legacy databases
		version false
		// In case a sequence is needed, changed the identity generator for the following code:
	        id column:'ID'
			name column:'name'
			address column:'address'
   }
	
	
	Long id
	String name
	String address
	
    static constraints = {
    }
}



