package HomeWork11;

public class QBasedStack <E> {
	Queue <E> m;
public QBasedStack(){
    m = new Queue<E>();
} 
public boolean isEmpty(){
	return m.isEmpty();
}
public void push (E e){
	Queue <E> tmp = new Queue <E>();
	tmp.enqueue(e);
	while(!m.isEmpty()){
		tmp.enqueue(m.dequeue());
	}
	m = tmp;
}
public E pop(){
	return m.dequeue();
}
public E peek(){
	E toReturn = m.dequeue();
	this.push(toReturn);
	return toReturn;
}
public int size(){
	return m.size();
}

public String toString() {
	return "QBasedStack [m=" + m + "]";
}

}
