package userendpoints.restapi.exceptions;

public class BadRequestException extends RuntimeException{

	
public BadRequestException(String msg) {
	super(msg);
}

public BadRequestException(String msg, Throwable cause) {
	super(msg, cause);
}


}
