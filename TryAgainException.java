/**
 * This exception doesn't really mean anything, and only serves to throw an exception in
 * the case that there is no exception which a statement can throw. It is the one part of
 * this project allowing chronological order, and the only thing giving me sanity in this
 * cold dark world.
 */
public class TryAgainException extends Exception {

	public TryAgainException() {
		super();
	}
	
}
 