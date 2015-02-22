package HomeWork9;

import java.util.Arrays;

public class Stack<E> {
	private int top;
	private E[] m;

	public Stack() {
		m = (E[]) new Object[10];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int size() {
		return top;
	}

	private void reCreate() {
		m = Arrays.copyOf(m, m.length * 2);
	}

	public void push(E e) {
		if (top == m.length)
			reCreate();
		m[top] = e;
		top++;
	}

	public E pop() {
		if (isEmpty())
			throw new RuntimeException();
		E toReturn = m[top - 1];
		m[top - 1] = null;
		top--;
		return toReturn;
	}

	public E peek() {
		if (isEmpty())
			throw new RuntimeException();
		return m[top - 1];
	}

	@Override
	public String toString() {
		return "Stack [size=" + top + ", " + Arrays.toString(m) + "]";
	}

}
