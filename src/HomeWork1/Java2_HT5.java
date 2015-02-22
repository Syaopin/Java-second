package HomeWork1;

import java.io.File;
import java.util.Arrays;

public class Java2_HT5 {

	public static void main(String[] args) {
		File dir = new File("/USers/nataden/Music");
        
		System.out.println("Max: "+maxFile(dir));		

	}
static long max = 0;
static long maxFile(File dir){	
	File [] list = dir.listFiles();
	for (File f: list){
		System.out.println(f.toString()+" size: "+f.length());
		if (f.length() > max)
			max = f.length(); 
	    if (f.isDirectory()){
	    	    maxFile(f);
	    }
	}
return max;
}
}
