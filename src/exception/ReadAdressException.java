package exception;

public class ReadAdressException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6749461126966553635L;
	/**
	 * @author Tao
	 * @date 2014/9/4
	 * @function ReadAdressException
	 */
	  private int code = 1001;
	  public ReadAdressException() {
	    super();
	  }
	  public ReadAdressException(String message, Throwable cause) {
	    super(message, cause);
	  }
	  public ReadAdressException(String message) {
	    super(message);
	  }
	  public ReadAdressException(Throwable cause) {
	    super(cause);
	  }
	  public int getCode() {
	    return code;
	  }
	  @Override
	  public String toString() {
	    return "code:"+code+super.toString();
	  }
	  @Override
	  public String getMessage() {
	    return "code:"+code+super.getMessage();
	  }
}
