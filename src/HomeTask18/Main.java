package HomeTask18;

import java.io.*;
import java.util.*;

public class Main {

	private final static int PERSON_QUANTITY = 3;
	private final static int CHILDREN_QUANTITY = 2;
	//private final static String PATH =  "C:/Users/Java_1_(Mon ana Wed)/tmp/personlist.xml";
      private final static String PATH =  "./src/HomeTask18/personlist.xml";
      private final static String PATH_UC =  "./src/HomeTask18/personlistUpperCase.xml";

	public static void main(String[] args) {
		PersonSerializator procPerson = new PersonSerializator();
		//String str = "";
		try{
           FileWriter fw = new FileWriter(PATH, true);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write("<personlist>");
           for (int i = 0; i < PERSON_QUANTITY; i ++){
        	    bw.write(procPerson.serializePerson(procPerson.generateRandomPerson()));
           }
           Person personWithChildren = new Person("", "", 0);   //create one person with 2 children
           personWithChildren = procPerson.generateRandomPerson();
           personWithChildren.setChildren(procPerson.generateListOfChildren(CHILDREN_QUANTITY));
           bw.write(procPerson.serializePerson(personWithChildren));
           bw.write("</personlist>");
           bw.close();
		}
		catch(Exception e) {
			System.out.println("Cannot create file, Error with msg: "+e.getMessage());
		}
		
		try{
			PersonDeserializator xmlToPerson = new PersonDeserializator();
			List<Person> listOfPersonsfromXML = new ArrayList<Person>();
			FileReader fr = new FileReader(PATH);
			BufferedReader br = new BufferedReader(fr);
			xmlToPerson.setStringFromXML(br.readLine()); 
			while(xmlToPerson.getStringFromXML().indexOf("</personlist>", 0)!=0){
			    listOfPersonsfromXML.add(xmlToPerson.deSerialize(xmlToPerson.getStringFromXML()));
			}

			System.out.println(listOfPersonsfromXML);
	        FileWriter fw = new FileWriter(PATH_UC, true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write("<personlist>");
			for (int i = 0; i < listOfPersonsfromXML.size(); i ++){
				bw.write(procPerson.serializePersonWithUpperCase(listOfPersonsfromXML.get(i)));
			}
	        bw.write("</personlist>");
	        bw.close();
			br.close();
		}
		catch(Exception e){
			System.out.println("Cannot read from file, Error with msg: "+e.getMessage());
		}
		

	}
}