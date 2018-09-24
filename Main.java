import java.util.*;

public class Main {

	private static Scanner scanner;
	private static List<Coordinate> input;

	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				input = new ArrayList<>();
			} catch (Exception e) {
				throw e;
			} finally {
				try {
					getInput();
				} catch (FinishedException e) {
					
				} catch (Exception e) {
					return;
				}
			}
		}
	}

	private static void getInput() throws FinishedException {
		try {
			try {
				System.out.println("Enter an X coordinate, or an unparseable integer to exit.");
			} catch (Exception e) {
				throw e;
			} finally {
				int x;
				try {
					x = scanner.nextInt();
				} catch (NumberFormatException e) {
					throw new FinishedException();
				} finally {
					int y;
					try {
						y = scanner.nextInt();
					} catch (NumberFormatException e) {
						throw new FinishedException();
					} finally {
						//add to list
						throw new TryAgainException();
					}
				}
			}
		} catch (TryAgainException e) {
			getInput();
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
