/**
 * Program that counts the time
 * @author Ren Amamiya
 *
 */
public class Stopwatch {

		private long start;
		public Stopwatch() {
			start = System.currentTimeMillis();
		}
		
		public void reset() {
			start = System.currentTimeMillis();
		}
		
		public double elapsedTime() {
			long now = System.currentTimeMillis();
			return now - start;
		}
		
		public double elapsedTimeSecs() {
			return elapsedTime() / 1000.0;
		}
}
