/**
 * Program that tests the efficiency of two different implementations of the Stack ADT
 * @author Ren Amamiya
 *
 */
public class testingEfficiency {
	
	public static void main(String[] args) {
		Stack<Integer> stack1 = new ArrayStack<Integer>();
		Stack<Integer> stack2 = new LinkedListStack<Integer>();
		double avg1 = 0, avg2 = 0;
		
		Stopwatch stp = new Stopwatch();
		for(int i = 0; i < 5000; i++) {
			stp.reset();
			for(int j = 0; j < 100; j++)
				stack1.push(j);
			avg1 += stp.elapsedTimeSecs();
			stack1.popAll();
		}
		
		avg1 /= 100;
		
		for(int i = 0; i < 5000; i++) {
			stp.reset();
			for(int j = 0; j < 100; j++)
				stack2.push(j);
			avg2 += stp.elapsedTimeSecs();
			stack2.popAll();
		}
		
		avg2 /= 100;
		
		if(avg2 > avg1)
			System.out.printf("The ArrayStack implementation is the more efficient one%nArrayStack Avg: %fs vs. LinkedListStack Avg: %fs%n", avg1, avg2);
		else
			System.out.printf("The LinkedListStack implementation is the more efficient one%nArrayStack Avg: %fs vs. LinkedListStack Avg: %fs%n", avg1, avg2);
	}
}
