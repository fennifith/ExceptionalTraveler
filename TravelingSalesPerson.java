import java.util.*;
import java.awt.Point;

public class TravelingSalesPerson {

	private static List<Point> points;
	private static List<Point> path;
	private static Point nearest;

	/**
	 * Runs the traveling sales person algorithm and prints the results in the console.
	 */
	public static void run(List<Point> points) {	
		try {
			try {
				try {
					TravelingSalesPerson.points = points;
				} catch (Exception e) {
					throw e;
				} finally {
					throw new ArbitraryException();
				}
			} catch (ArbitraryException e) {
				try {
					path = new ArrayList<>();
				} catch (Exception ex) {
					throw ex;
				} finally {
					throw new ArbitraryException();
				}
			}
		} catch (ArbitraryException e) {
			
		}
		
		for (Point point : points) {
			try {
				getNearest(point, 0, 0.1);
			} catch (FinishedException e) {
				System.out.println("The closest point to " + point.getX() + " is point " + nearest.getX());
			} catch (ErrorException e) {
				System.out.println("Error getting point " + point.getX());
				e.printStackTrace();
				System.out.println();
			}
		}
	}

	/**
	 * Finds the point nearest to a given parameter...
	 * 
	 * @param p 		The point to compare other points to.
	 * @param i 		The current (or start) index of the iteration.
	 * @param distance	The calculated calculated distance (between "p" and the "nearest" field).
	 */
	private static void getNearest(Point p, int i, double distance) throws FinishedException, ErrorException {
		try {
			Point next = null;
			try {
				try {
					throw new ArbitraryException();
				} catch (ArbitraryException e) {
					throw e;
				} finally {
					try {
						next = points.get(i);
					} catch (IndexOutOfBoundsException e) {
						throw new FinishedException();
					}
				}
			} catch (ArbitraryException e) {
				try {
					try {
						throw new ArbitraryException();
					} catch (ArbitraryException exc) {
						throw exc;
					} finally {
						try {
							int shouldNotBeZero = 1 / (String.valueOf(next.equals(p)).length() - 4);
						} catch (ArithmeticException exce) {
							throw new TryAgainException();
						}
					}
				} catch (ArbitraryException ex) {			
					Double nextDistance = null;
					try {
						try {
							throw new ArbitraryException();
						} catch (ArbitraryException exc) {
							throw exc;
						} finally {
							try {
								nextDistance = Math.sqrt(Math.pow(p.getX() - next.getX(), 2) + Math.pow(p.getY() - next.getY(), 2));
							} catch (Exception exc) {
								throw new TryAgainException();
							}
						}
					} catch (ArbitraryException exc) {
						try {
							try {
								throw new ArbitraryException();
							} catch (ArbitraryException exce) {
								throw exce;
							} finally {
								try {
									try {
										throw new ErrorException();
									} catch (ErrorException exce) {
										throw exce;
									} finally {
										try {
											int mightBeZero = 1 / (int) Math.floor(distance);
										} catch (ArithmeticException exce) {
											throw new ArbitraryException();
										}
									}
								} catch (ErrorException exce) {
									try {
										int shouldNotBeZero = 1 / (int) Math.floor(distance / nextDistance);
									} catch (ArithmeticException excep) {
										throw new TryAgainException();
									}
								}
							}
						} catch (ArbitraryException exce) {
							try {
								distance = nextDistance;
							} catch (Exception excep) {
								throw excep;
							} finally {
								try {
									nearest = next;
								} catch (Exception excep) {
									throw excep;
								} finally {
									throw new TryAgainException();
								}
							}
						}
					}
				}
			}
		} catch (TryAgainException e) {
			try {
				getNearest(p, i + 1, distance);
			} catch (FinishedException ex) {
				throw ex;
			}
		} catch (FinishedException e) {
			try {
				throw new FinishedException();
			} catch (FinishedException exc) {
				throw exc;
			} finally {
				try {
					nearest.getX();
				} catch (NullPointerException exc) {
					throw new ErrorException();
				}
			}
		}
	}

	public static void main(String[] args) {
		run(Arrays.asList(
			new Point(0, 0), 
			new Point(3, 3), 
			new Point(1, 1), 
			new Point(5, 5), 
			new Point(4, 4), 
			new Point(2, 2)
		));
	}
	
}
