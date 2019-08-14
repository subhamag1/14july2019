package example1;
import java.io.Serializable;

public class Account implements Serializable {
   
	private String accountnumber;
	private Double amount;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Account(String accountnumber, Double amount) {
		super();
		this.accountnumber = accountnumber;
		this.amount = amount;
	}


	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Account createNewAccount(String accountNumber,double amount) throws AccountNotValidException{
		
		this.accountnumber=accountNumber;
		this.amount=amount;
		if(amount < 10000) {
			throw new AccountNotValidException("Not a valid Amount Account Cant be Created");
		}
	
	
	
	return new Account(accountNumber,amount);

}
}
