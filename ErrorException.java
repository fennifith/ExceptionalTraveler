/**
 * Thrown if executing a method or loop results in some kind of error
 * or inconsistency that should otherwise not happen. This is the one part
 * of this program in which exceptions are actually used for their intended
 * purpose.
 */
public class ErrorException extends Exception {

	public ErrorException() {
		super();
	}
	
}
 