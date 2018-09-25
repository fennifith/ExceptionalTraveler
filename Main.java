import java.util.*;

public class Main {

	private static Scanner scanner;
	private static List<Integer> inputX;
	private static List<Integer> inputY;

	public static void main(String[] args) {
		try {
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
						inputX = new ArrayList<>();
					} catch (Exception ex) {
						throw ex;
					} finally {
						throw new ArbitraryException();
					}
				} finally {
					throw new ArbitraryException();
				}
			} catch (ArbitraryException e) {
				try {
					inputY = new ArrayList<>();
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
				} catch (Exception exc) {
					throw exc;
				}
			}
		}
	}

	private static void getInput() throws FinishedException {
		try {
			try {
				try {
					throw new ArbitraryException();
				} catch (Exception e) {
					throw e;
				} finally {
					try {
						System.out.print("Enter an X coordinate, or an unparseable integer to exit: ");
					} catch (Exception ex) {
						throw ex;
					} finally {
						try {
							inputX.add(Integer.parseInt(scanner.nextLine()));
						} catch (NumberFormatException e) {
							throw new FinishedException();
						}
					}
				}
			} catch (ArbitraryException e) {
				try {
					try {
						throw new ArbitraryException();
					} catch (Exception ex) {
						throw ex;
					} finally {
						try {
							System.out.print("Enter the Y coordinate: ");
						} catch (Exception exc) {
							throw exc;
						} finally {
							try {
								inputY.add(Integer.parseInt(scanner.nextLine()));
							} catch (NumberFormatException exce) {
								throw new FinishedException();
							}
						}
					}
				} catch (ArbitraryException ex) {
					throw new TryAgainException();
				}
			}
		} catch (TryAgainException e) {
			try {
				getInput();
			} catch (FinishedException ex) {
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
