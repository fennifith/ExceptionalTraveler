public class Coordinate {

	private int x, y;

	public Coordinate(int x, int y) throws InstantiatedException {
		try {
			this.x = x;
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				this.y = y;
			} catch (Exception e) {
				throw e;
			} finally {
				throw new InstantiatedException();
			}
		}
	}

	public static class InstantiatedException extends Exception {

		private InstantiatedException() {
			super();
		}
		
	}
	
}