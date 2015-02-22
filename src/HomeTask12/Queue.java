package HomeTask12;
public class Queue<E> {
	private E []m;
	private int start = 0, end = 0;//counters that always grow 
	
	public int size() { return end - start; }
	public boolean isEmpty() { return end == start; }
	
	public Queue() { 	m = (E[]) new Object[5]; 	}
	
	//============ service method ================
	private int calcIndex(int x) { return x % m.length; }
		
	private void recreate() {
		E []n = (E[]) new Object[m.length * 2];
		for(int i = start, j = 0; i < end; i++, j++){
			n[j] = m[calcIndex(i)];
		}
		int sz = size();
		start = 0;
		end = sz;
		m = n;
	}
	
	private void checkIfEmpty(){
		if (isEmpty())
			throw new RuntimeException("queue is empty !"); 
	}
	//=============================
	public void enqueue(E e){
		if (size() == m.length)
			recreate();
		
		m[calcIndex(end)] = e;
		end++;
	}
	
	public E dequeue(){
		checkIfEmpty(); // if queue is empty => generate an exception
		
		E toReturn = m[calcIndex(start)];
		m[calcIndex(start)] = null;
		start++;
		return toReturn;
	}
	
	public E front(){
		checkIfEmpty(); // if queue is empty => generate an exception
		
		return m[calcIndex(start)];
	}
	
	public String toString() {
		String toReturn = "";
		for(int i = start; i < end; i++) {
			toReturn += m[calcIndex(i)].toString() + ",";
		}
		return "Queue[" + toReturn + "]sz=" + size();
	}
}
