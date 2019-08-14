package example1;

public class Tester {

	public static void main(String[] args) {
		Account account = new Account();
		try {
			account.createNewAccount("Sb101", 23000);
		} catch (AccountNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
