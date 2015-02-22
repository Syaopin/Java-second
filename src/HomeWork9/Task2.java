package HomeWork9;
import java.io.*;
import java.util.Arrays;
public class Task2 {

	public static void main(String[] args) {
		System.out.println("------------Task 2------------");
		Stack<String> st = new Stack<String>();
		try{
		FileReader fr = new FileReader("./src/HomeWork9/Test.html");  //Test.html with OK tags, Test2.html - with NOT Ok tags
		BufferedReader br = new BufferedReader(fr);
		String line;
		StringBuffer open = new StringBuffer(); //to store open tags like <>
		StringBuffer close = new StringBuffer(); //to store close tags like </>
		int flag = 0;
			
		while((line = br.readLine()) != null){
			System.out.println(line);
			char []c = line.toCharArray();
			for (int i = 0; i < c.length; i++){
				if (c[i] == '<')   //means beginning of tag
					{
					flag = 1;    //flag means to start write tag name to temp variable "open" or "close"
				    continue;
					}
				if (flag == 1){
					if (c[i]=='/') {    //it means that this is tag for closing, so we change flag to start write name of tag to "close" variable
						flag = 2;
						continue;
					}
					if ((c[i]!='>')&&(c[i]!=' ')){  //writing to "open" variable for opening tags
						open.append(c[i]);
					}
					else {
						flag = 0;
						st.push(open.toString());
						open.delete(0, open.length()); //clear temp variable
					}
				}
				if (flag == 2){
					if ((c[i]!='>')&&(c[i]!=' ')){ //writing to "close" variable for closing tags
						close.append(c[i]);
					}
					else {
						flag = 0;
						//st.push(close.toString());
						if ((st.peek().equals(close.toString()))&&(!st.isEmpty())){ //if top of stack is equal to "close" content and stack is not empty
							st.pop();   //remove top element
							close.delete(0, close.length()); //clear temp variable
						}
						else {   //means that tags are wrong, quit main cycle
							break;
						}
					}
				}
				
			}
		}
		}
		catch(Exception e){
			 System.out.println("Error with message: "+e.getMessage());
		}
		if (st.isEmpty()){
			System.out.println("Tags are OK!");
		}
		else {
			System.out.println("Tags are NOT OK!");
		}
		System.out.println(st);
	}

}
