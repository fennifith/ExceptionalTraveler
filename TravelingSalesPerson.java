import java.util.*;
import java.awt.Point;

public class TravelingSalesPerson {

	private static int size;
	private static List<Point> points;
	private static List<Point> path;
	private static Point nearest;
	private static double nearestDistance;
	private static Point nearest2;
	private static double nearestDistance2;
	private static double totalDistance;

	/**
	 * Runs the traveling sales person algorithm and prints the results in the console.
	 * 
	 * @param points	The points to calculate the order of.
	 */
	public static void run(List<Point> points) throws FinishedException {	
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
					try {
						size = points.size();
					} catch (Exception ex) {
						throw ex;
					} finally {
						throw new ArbitraryException();
					}
				}
			}
		} catch (ArbitraryException e) {
			try {
				nearest2 = points.get(0);
			} catch (Exception ex) {
				throw ex;
			} finally {
				try {
					getNearest(nearest2, 0);
				} catch (FinishedException ex) {
					try {
						points.remove(nearest2);
					} catch (Exception exc) {
						throw exc;
					} finally {
						try {
							path.add(nearest2);
						} catch (Exception exc) {
							throw exc;
						} finally {
							try {
								points.remove(nearest);
							} catch (Exception exc) {
								throw exc;
							} finally {
								try {
									path.add(nearest);
								} catch (Exception exc) {
									throw exc;
								} finally {
									try {
										totalDistance += nearestDistance;
									} catch (Exception exc) {
										throw exc;
									} finally {
										try {
											getPath(nearest2, nearest);
										} catch (FinishedException exc) {
											try {
												totalDistance += Math.sqrt(Math.pow(nearest.getX() - nearest2.getX(), 2) + Math.pow(nearest.getY() - nearest2.getY(), 2));
											} catch (Exception exce) {
												throw exce;
											} finally {
												try {
													path = path.subList(0, size);
												} catch (Exception exce) {
													throw exce;
												} finally {
													try {
														System.out.println("\nPoints calculated! Total distance: " + totalDistance + " units.");
													} catch (Exception exce) {
														throw exce;
													} finally {
														try {
															printPath(0);
														} catch (FinishedException exce) {
															throw exce;
														}
													}
												}
											}
										} catch (ErrorException exc) {
											throw new FinishedException();
										}
									}
								}
							}
						}
					}
				} catch (ErrorException ex) {
					try {
						System.out.println("Error: not enough points");
					} catch (Exception exc) {
						throw exc;
					} finally {
						throw new FinishedException();
					}
				}
			}
		}
	}
	
	/**
	 * Applies the double neighbor heuristic and adds the closest points to the path. The first
	 * two points should be calculated first before calling this method.
	 * 
	 * @param p1		The "right" point.
	 * @param p2		The "left" point.
	 */
	private static void getPath(Point p1, Point p2) throws FinishedException, ErrorException {
		try {
			try {
				try {
					throw new ArbitraryException();
				} catch (ArbitraryException e) {
					throw e;
				} finally {
					try {
						int shouldNotBeZero = 1 / points.size();
					} catch (ArithmeticException e) {
						throw new FinishedException();
					}
				}
			} catch (ArbitraryException e) {
				try {
					getNearest(p1, 0);
				} catch (FinishedException ex) {
					try {
						nearest2 = nearest;
					} catch (Exception exc) {
						throw exc;
					} finally {
						try {
							nearestDistance2 = nearestDistance;
						} catch (Exception exc) {
							throw exc;
						} finally {
							try {
								getNearest(p2, 0);
							} catch (FinishedException exc) {
								try {
									try {
										throw new ArbitraryException();
									} catch (ArbitraryException exce) {
										throw exce;
									} finally {
										try { // assert which distance is smaller
											int shouldNotBeZero = 1 / (int) Math.floor(nearestDistance / nearestDistance2);
										} catch (ArithmeticException exce) {
											throw exce;
										}
									}
								} catch (ArbitraryException exce) { // "nearestDistance2" is smaller
									try {
										p1 = nearest2;
									} catch (Exception excep) {
										throw excep;
									} finally {
										try {
											points.remove(p1);
										} catch (Exception excep) {
											throw excep;
										} finally {
											try {
												path.add(0, p1);
											} catch (Exception excep) {
												throw excep;
											} finally {
												try {
													totalDistance += nearestDistance2;
												} catch (Exception excep) {
													throw excep;
												} finally {
													throw new TryAgainException();
												}
											}
										}
									}
								} catch (ArithmeticException exce) { // "nearestDistance" is smaller
									try {
										p2 = nearest;
									} catch (Exception excep) {
										throw excep;
									} finally {
										try {
											points.remove(p2);
										} catch (Exception excep) {
											throw excep;
										} finally {
											try {
												path.add(p2);
											} catch (Exception excep) {
												throw excep;
											} finally {
												try {
													totalDistance += nearestDistance;
												} catch (Exception excep) {
													throw excep;
												} finally {
													throw new TryAgainException();
												}
											}
										}
									}
								}
							} catch (ErrorException exc) {
								try {
									try {
										throw new ArbitraryException();
									} catch (ArbitraryException exce) {
										throw exce;
									} finally {
										nearest = points.get(0);
									}
								} catch (IndexOutOfBoundsException exce) {
									throw exc;
								} catch (ArbitraryException exce) {
									try {
										points.remove(nearest);
									} catch (Exception excep) {
										throw excep;
									} finally {
										try {
											path.add(nearest);
										} catch (Exception excep) {
											throw excep;
										} finally {
											throw new FinishedException();
										}
									}
								}
							}
						}
					}
				} catch (ErrorException ex) {
					try {
						try {
							throw new ArbitraryException();
						} catch (ArbitraryException exc) {
							throw exc;
						} finally {
							nearest = points.get(0);
						}
					} catch (IndexOutOfBoundsException exc) {
						throw ex;
					} catch (ArbitraryException exc) {
						try {
							points.remove(nearest);
						} catch (Exception exce) {
							throw exce;
						} finally {
							try {
								path.add(nearest);
							} catch (Exception exce) {
								throw exce;
							} finally {
								throw new FinishedException();
							}
						}
					}
				}			
			}
		} catch (TryAgainException e) {
			try {
				getPath(p1, p2);
			} catch (FinishedException ex) {
				throw ex;
			}
		}
	}

	/**
	 * Finds the point nearest to a given parameter...
	 * 
	 * @param p 		The point to compare other points to.
	 * @param i 		The current (or start) index of the iteration.
	 */
	private static void getNearest(Point p, int i) throws FinishedException, ErrorException {
		try {
			try {
				try {
					throw new ArbitraryException();
				} catch (ArbitraryException e) {
					throw e;
				} finally {
					int shouldBeZero = 1 / i;
				}
			} catch (ArithmeticException e) {
				try {
					nearest = null;
				} catch (Exception ex) {
					throw ex;
				} finally {
					throw new ArbitraryException();
				}
			}
		} catch (ArbitraryException e) {
			try {
				Point next = null;
				try {
					try {
						throw new ArbitraryException();
					} catch (ArbitraryException ex) {
						throw ex;
					} finally {
						try {
							next = points.get(i);
						} catch (IndexOutOfBoundsException ex) {
							throw new FinishedException();
						}
					}
				} catch (ArbitraryException ex) {
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
					} catch (ArbitraryException exc) {			
						Double nextDistance = null;
						try {
							try {
								throw new ArbitraryException();
							} catch (ArbitraryException exce) {
								throw exce;
							} finally {
								try {
									nextDistance = Math.sqrt(Math.pow(p.getX() - next.getX(), 2) + Math.pow(p.getY() - next.getY(), 2));
								} catch (Exception exce) {
									throw new TryAgainException();
								}
							}
						} catch (ArbitraryException exce) {
							try {
								try {
									throw new ArbitraryException();
								} catch (ArbitraryException excep) {
									throw excep;
								} finally {
									try {
										try {
											throw new ErrorException();
										} catch (ErrorException excep) {
											throw excep;
										} finally {
											try {
												int mightBeZero = 1 / (int) Math.floor(nearestDistance);
											} catch (ArithmeticException excep) {
												throw new ArbitraryException();
											}
										}
									} catch (ErrorException excep) {
										try {
											int shouldNotBeZero = 1 / (int) Math.floor(nearestDistance / nextDistance);
										} catch (ArithmeticException except) {
											throw new TryAgainException();
										}
									}
								}
							} catch (ArbitraryException excep) {
								try {
									nearestDistance = nextDistance;
								} catch (Exception except) {
									throw except;
								} finally {
									try {
										nearest = next;
									} catch (Exception except) {
										throw except;
									} finally {
										throw new TryAgainException();
									}
								}
							}
						}
					}
				}
			} catch (TryAgainException ex) {
				try {
					getNearest(p, i + 1);
				} catch (FinishedException exc) {
					throw exc;
				}
			} catch (FinishedException ex) {
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
	}
	
	/**
	 * Prints all of the "path" points in the console.
	 * 
	 * @param i		The index of the current iteration.
	 */
	private static void printPath(int i) throws FinishedException {
		try {
			Point point = null;
			try {
				try {
					throw new ArbitraryException();
				} catch (ArbitraryException e) {
					throw e;
				} finally {
					try {
						point = path.get(i);
					} catch (IndexOutOfBoundsException e) {
						throw new FinishedException();
					}
				}
			} catch (ArbitraryException e) {
				try {
					System.out.println("Point " + i + ": (" + point.getX() + ", " + point.getY() + ")");
				} catch (Exception ex) {
					throw ex;
				} finally {
					throw new TryAgainException();
				}
			}
		} catch (TryAgainException e) {
			try {
				printPath(i + 1);
			} catch (FinishedException ex) {
				throw ex;
			}
		}
	}

	public static void main(String[] args) {
		try {
			run(new ArrayList<>(Arrays.asList(
				new Point(6, 1), 
				new Point(4, 3), 
				new Point(3, 4),
				new Point(2, 2), 
				new Point(1, 6)
			)));
		} catch (FinishedException e) {
		}
	}
	
}
