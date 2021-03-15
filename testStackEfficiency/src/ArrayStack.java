/**
 * Implementation of the stack ADT using a growing array.
 * Implementation originally created by João Pedro Guerreiro Neto.
 * @author Nuno Dias
 *
 * @param <E> Type of the stack
 */
public class ArrayStack<E> implements Stack<E> {
	
	//default array capacity
	private static final int DEFAULT_CAPACITY = 8;
	
	//Generic array used to implement the stack
	private E[] theStack;
	
	//index for the top of the stack. -1 for an empty stack
	private int top;
	
	/**
	 * Creates an empty stack.
	 */
	public ArrayStack() {
		theStack = (E[]) new Object[DEFAULT_CAPACITY];
		top = -1;
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#push(Object)
	 */
	public void push(E e) {
		if(size() == theStack.length)
			grow();
		top++;
		theStack[top] = e;
	}
	
	/**
	 * Aux. function: used to increase the capacity of the array holding
	 * the Stack once it runs out of space to store values
	 */
	private void grow() {
		E[] newStack = (E[]) new Object[theStack.length * 2];
		
		for(int i = 0; i < theStack.length; i++)
			newStack[i] = theStack[i];
		
		theStack = newStack;
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#pop()
	 */
	public void pop() {
		theStack[top] = null;
				//don't hold a reference to an object when
		top--;  //it's no longer needed
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#peek()
	 */
	public E peek() {
		return theStack[top];
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#isEmpty()
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	// :)
	
	/**
	 * Aux function: instead of the current max capacity of the Stack,
	 * checks how many values are stored in the stack
	 * @return How many non-null values are stored in the stack
	 */
	private int size() {
		int i = 0;
		while(i < theStack.length && theStack[i] != null)
			i++;
		
		return i;
	}
}
