package HomeWork11;


public class QueueTest {
	
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		System.out.println(q);
		String[] lg = {"Algol", "Basic", "Ada", "Java", "C#", "Lisp"};
		for(String t : lg)
			q.enqueue(t);
		System.out.println(q);
		
//		final int sz = q.size() - 1;
//		while(!q.front().equals("Lisp"))
//			q.enqueue(q.dequeue());
//		
//		System.out.println(q);
		
		//How many items in Queue have letter a/A ?
		int ca = 0;
		for(int i = 0; i < q.size(); i++){
			String item = q.dequeue();
			if (item.toLowerCase().contains("a"))
				ca++;
			q.enqueue(item);
		}
		System.out.println("items with A/a = " + ca);
		
//		System.out.println("front=" + q.front());
//		
//		while(!q.isEmpty())
//			System.out.println("deleted = " + q.dequeue());
//		System.out.println(q);
		
		Queue<Integer> qi = new Queue<Integer>();
		for(int i = 1; i <= 10; i++)
			qi.enqueue(i); //int -> Integer
		
		System.out.println(qi);
		//avg of all items in qi
		double sum = 0;
		for(int i = 0; i < qi.size(); i++){
			int tmp = qi.dequeue();
			sum += tmp;
			qi.enqueue(tmp);
		}
		System.out.println("avg = " + (sum / qi.size()));
	}

}
