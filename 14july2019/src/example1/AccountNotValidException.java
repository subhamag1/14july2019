package example1;

public class AccountNotValidException extends Throwable {
  private String message;
  
  public AccountNotValidException() {
	  
  }
  public AccountNotValidException(String message) {
	  this.setMessage(message);
  }
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
