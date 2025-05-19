public class Admin extends Account{

	// A private string specified only with the Admin
	private String AuthCode;

	public Admin(int _id, String _name, String _code){
		id = _id;
		name = _name;
		AuthCode = _code;
	}
}

