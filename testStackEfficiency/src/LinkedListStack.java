/**
 * Implementation of the stack ADT using a singly linked list.
 * Implementation originally created by João Pedro Guerreiro Neto.
 * @author Nuno Dias
 * 
 * @param <E> Type of the stack
 */
public class LinkedListStack<E> implements Stack<E> {
	//inner class: node
	private class Node<E>{
		E item;			// item stored in the node
		Node<E> next;	// pointer that points to the next node in the stack
		
		private Node(E item, Node<E> next) {
			this.item = item; this.next = next;
		}
	}
	
	//the element in the top of the stack
	Node<E> first;
	
	/**
	 * Creates an empty stack;
	 */
	public LinkedListStack() {
		first = null;
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#push(Object)
	 */
	public void push(E item) {
		Node<E> oldFirst = first;
		first = new Node<E>(item, oldFirst);
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#pop()
	 */
	public void pop() {
		first = first.next;
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#isEmpty()
	 */
	public boolean isEmpty() {
		return first == null;
	}
	
	/**
	 * (non-Javadoc)
	 * @see Stack#peek()
	 */
	public E peek() {
		return first.item;
	}
}
