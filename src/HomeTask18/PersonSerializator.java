package HomeTask18;

import java.util.*;
import java.util.Random;

public class PersonSerializator {
	public String createRandomName() {
		StringBuilder name = new StringBuilder();
		Random rn = new Random();
		for (int i = 0; i < rn.nextInt(10) + 5; i++) {
			name.append((char) (rn.nextInt(25) + 97));
		}
        return name.toString();
	}
	public Person generateRandomPerson(){
		return new Person(createRandomName(), createRandomName(), new Random().nextInt(100));
	}
	public List<Person> generateListOfChildren(int childrenQuantity){
		List<Person> childrenList = new ArrayList<Person>();
		for (int i = 0; i < childrenQuantity; i ++){
			childrenList.add(generateRandomPerson());
		}
		return childrenList;
	}
	public String serializePerson(Person person){
		StringBuilder result = new StringBuilder();
		//result.append("<person>\n<name>"+person.getName()+"</name>\n<lastname>"+person.getLastName()+"</lastname>\n<age>"+person.getAge()+"</age>\n</person>\n");
		if (person.getChildren()!=null){
			result.append("<person><name>"+person.getName()+"</name><lastname>"+person.getLastName()+"</lastname><age>"+person.getAge()+"</age>");
			result.append("<children>");
			for (int i = 0; i < person.getChildren().size(); i ++){
			   result.append("<person><name>"+person.getChildren().get(i).getName()+"</name><lastname>"+person.getChildren().get(i).getLastName()+"</lastname><age>"+person.getChildren().get(i).getAge()+"</age></person>");
			} 
			result.append("</children></person>");
			
		}
		else{
		   result.append("<person><name>"+person.getName()+"</name><lastname>"+person.getLastName()+"</lastname><age>"+person.getAge()+"</age></person>");
		}
		return result.toString();
	}
	public String serializePersonWithUpperCase(Person person){
		StringBuilder result = new StringBuilder();
		if (person.getChildren()!=null){
			result.append("<person><name>"+person.getName().toUpperCase()+"</name><lastname>"+person.getLastName()+"</lastname><age>"+person.getAge()+"</age>");
			result.append("<children>");
			for (int i = 0; i < person.getChildren().size(); i ++){
			   result.append("<person><name>"+person.getChildren().get(i).getName().toUpperCase()+"</name><lastname>"+person.getChildren().get(i).getLastName()+"</lastname><age>"+person.getChildren().get(i).getAge()+"</age></person>");
			} 
			result.append("</children></person>");
			
		}
		else{
		   result.append("<person><name>"+person.getName().toUpperCase()+"</name><lastname>"+person.getLastName()+"</lastname><age>"+person.getAge()+"</age></person>");
		}
		return result.toString();
	}
}