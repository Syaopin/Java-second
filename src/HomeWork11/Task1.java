package HomeWork11;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("----------------------Task 1--------------------");
    QBasedStack<String> qbs = new QBasedStack<String>();
    System.out.println(qbs.toString());
    String[]lst = {"a", "b", "c", "d", "e"};
    for (String s: lst)
    	    qbs.push(s);
    System.out.println(qbs.toString());
    System.out.println("Peek an element: "+qbs.peek());
    System.out.println(qbs.toString());
    
    System.out.println("Pop an element: "+qbs.pop());
    System.out.println(qbs.toString());
    
    while(!qbs.isEmpty())
    {
    	System.out.println("Pop an element: "+qbs.pop());
    }
    System.out.println(qbs.toString());
	}
}
