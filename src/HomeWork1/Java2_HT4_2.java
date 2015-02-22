package HomeWork1;

import java.io.*;
import java.util.Arrays;
public class Java2_HT4_2 {

	public static void main(String[] args) {
		String path = "e:/tmp";
		String search = "mail";
		File dir = new File(path);
      find(dir, search);
	}
	static void find (File name, String str){
		File [] list = name.listFiles();
	     for (File x:list){
	    	 if (x.getName().contains(str))
	    		 System.out.println(x+" Found!");
	    	if (x.isDirectory())
	           find(x, str);
	    	/* else
	    		 System.out.println(x+" it's not directory"); */
	     }
	}
}