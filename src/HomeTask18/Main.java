package HomeTask18;

import java.io.*;
import java.util.*;

public class Main {

	private final static int PERSON_QUANTITY = 3;
	private final static int CHILDREN_QUANTITY = 2;
	//private final static String PATH =  "C:/Users/Java_1_(Mon ana Wed)/tmp/personlist.xml";
	private final static String PATH =  "./src/HomeTask18/personlist.xml";
	
	public static void main(String[] args) {
		PersonSerializator procPerson = new PersonSerializator();
		String str = "";
		try{
           FileWriter fw = new FileWriter(PATH, true);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write("<personlist>");
           for (int i = 0; i < PERSON_QUANTITY; i ++){
        	    bw.write(procPerson.serializePerson(procPerson.generateRandomPerson()));
           }
           Person personWithChildren = new Person("", "", 0);
           personWithChildren = procPerson.generateRandomPerson();
           personWithChildren.setChildren(procPerson.generateListOfPerson(CHILDREN_QUANTITY));
           bw.write(procPerson.serializePerson(personWithChildren));
           bw.write("</personlist>");
           bw.close();
		}
		catch(Exception e) {
			System.out.println("Cannot create file, Error with msg: "+e.getMessage());
		}
		
		try{
			FileReader fr = new FileReader(PATH);
			BufferedReader br = new BufferedReader(fr);
			str = br.readLine();
			PersonDeserializator xmlToPerson = new PersonDeserializator();
//            String [] tmp = str.split("<person><name>");
//            for (int i = 0; i < tmp.length; i ++){
//            	System.out.println(tmp[i]);
//            	if (i != 0) System.out.println(new Main().readValueBetweenTags(tmp[i]));
//            }
			xmlToPerson.deSerialize(str);
		}
		catch(Exception e){
			System.out.println("Cannot read from file, Error with msg: "+e.getMessage());
		}
		

	}
}
