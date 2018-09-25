/**
 * This exception class represents the end of a sequence of recursion; when it is thrown,
 * the program knows that the loop is complete.
 */
public class FinishedException extends Exception {

	public FinishedException() {
		super();
	}
	
}
 