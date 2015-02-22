package HomeWork11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.*;


import HomeWork9.Stack;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("------------Task 2------------");
		Stack<String> st = new Stack<String>();
		try{
		FileReader fr = new FileReader("./src/HomeWork9/Test.html");  //Test.html with OK tags, Test2.html - with NOT Ok tags
		BufferedReader br = new BufferedReader(fr);
		String line;
			
		while((line = br.readLine()) != null){
			System.out.println(line);
			 Pattern pat = Pattern.compile("</?[a-z]+[1-6]?\\s?[^>]*>");
			 Matcher m = pat.matcher(line);
			 while(m.find())  //while matcher finds next group
				System.out.println("group=" + m.group().replaceAll("[<,</,>]", ""));  //show group
		  }
		}
		catch(Exception e){
			 System.out.println("Error with message: "+e.getMessage());
		}
	}

}
