import java.util.*;

public class Main {

	private static Scanner scanner;
	private static List<Integer> input;

	public static void main(String[] args) {
		try {
			try {
				try {
					scanner = new Scanner(System.in);
				} catch (Exception e) {
					throw e;
				} finally {
					throw new ArbitraryException();
				}
			} catch (ArbitraryException e) {
				try {
					input = new ArrayList<>();
				} catch (Exception ex) {
					throw ex;
				} finally {
					throw new ArbitraryException();
				}
			}
		} catch (ArbitraryException e) {
			try {
				getInput();
			} catch (FinishedException ex) {
				//run TSP
			} catch (Exception ex) {
				throw ex;
			} finally {
				try {
					System.out.println("Exiting...");
				} catch (Exception e) {
					throw e;
				}
			}
		}
	}

	private static void getInput() throws FinishedException {
		try {
			try {
				try {
					try {
						System.out.println("Enter an X coordinate, or an unparseable integer to exit.");
					} catch (Exception e) {
						throw e;
					} finally {
						throw new ArbitraryException();
					}
				} catch (ArbitraryException e) {
					try {
						input.add(scanner.nextInt());
					} catch (NumberFormatException ex) {
						throw new FinishedException();
					} finally {
						throw new ArbitraryException();
					}
				}
			} catch (ArbitraryException e) {
				try {
					input.add(scanner.nextInt());
				} catch (NumberFormatException ex) {
					throw new FinishedException();
				} finally {
					throw new TryAgainException();
				}
			}
		} catch (TryAgainException e) {
			try {
				getInput();
			} catch (Exception ex) {
				throw ex;
			}
		}
	}

	/**
	 * This exception doesn't really mean anything, and only serves to throw an exception in
	 * the case that there is no exception which a statement can throw. It is the one part of
	 * this project allowing chronological order, and the only thing giving me sanity in this
	 * cold dark world.
	 */
	private static class ArbitraryException extends Exception {

		private ArbitraryException() {
			super();
		}
		
	}

	/**
	 * This exception class exists to represent recursion; it is thrown with the intention
	 * to notify the program that its statement should be run again before it is finished.
	 */
	private static class TryAgainException extends Exception {

		private TryAgainException() {
			super();
		}
		
	}

	/**
	 * This exception class represents the end of a sequence of recursion; when it is thrown,
	 * the program knows that the loop is complete.
	 */
	private static class FinishedException extends Exception {

		private FinishedException() {
			super();
		}
		
	}
	
}
