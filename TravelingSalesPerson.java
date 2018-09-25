import java.util.*;
import java.awt.Point;

public class TravelingSalesPerson {

	private static List<Point> points;
	private static Point nearest;

	public static void run(List<Integer> x, List<Integer> y) {
		try {
			try {
				points = new ArrayList<>();
			} catch (Exception e) {
				throw e;
			} finally {
				throw new ArbitraryException();
			}
		} catch (ArbitraryException e) {
			try {
				getCoordinates(x, y);
			} catch (FinishedException ex) {
			
			}
		}
	}

	private static void getCoordinates(List<Integer> x, List<Integer> y) throws FinishedException {
		try {
			try {
				throw new TryAgainException();
			} catch (Exception e) {
				throw e;
			} finally {
				try {
					points.add(new Point(x.get(0), y.get(0)));
				} catch (Exception e) {
					throw e;
				}
			}
		} catch (TryAgainException e) {
			try {
				getCoordinates(x, y);
			} catch (IndexOutOfBoundsException ex) {
				throw new FinishedException();
			}
		}
	}

	private static void getNearest(int i, double distance) {
		
	}

	public static void main(String[] args) {
		run(Arrays.asList(0, 3, 1, 5, 4, 2), Arrays.asList(0, 3, 1, 5, 4, 2));
	}
	
}
