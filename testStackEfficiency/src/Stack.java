
public interface Stack<E> {
	/**
	 * Inserts an element at the top of the stack
	 * @param element The element to insert
	 */
	public void push(E element);
	
	/**
	 * Removes the top element from the stack
	 * @requires {@code !isEmpty()}
	 */
	public void pop();
	
	/**
	 * Inspect the element at the top of the stack
	 * @return The element at the top of the stack
	 * @requires {@code !isEmpty()}
	 */
	public E peek();
	
	/**
	 * Returns whether the stack is empty or not
	 * @return The stack is empty (true/false)
	 */
	public boolean isEmpty();
}
