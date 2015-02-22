package HomeTask18;

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
	public Person[] generateListOfPerson(int childrenQuantity){
		Person [] personList = new Person[childrenQuantity];
		for (int i = 0; i < childrenQuantity; i ++){
			personList[i] = generateRandomPerson();
		}
		return personList;
	}
	public String serializePerson(Person person){
		StringBuilder result = new StringBuilder();
		//result.append("<person>\n<name>"+person.getName()+"</name>\n<lastname>"+person.getLastName()+"</lastname>\n<age>"+person.getAge()+"</age>\n</person>\n");
		if (person.getChildren()!=null){
			result.append("<person><name>"+person.getName()+"</name><lastname>"+person.getLastName()+"</lastname><age>"+person.getAge()+"</age>");
			result.append("<children>");
			for (int i = 0; i < person.getChildren().length; i ++){
			   result.append("<person><name>"+person.getChildren()[i].getName()+"</name><lastname>"+person.getChildren()[i].getLastName()+"</lastname><age>"+person.getChildren()[i].getAge()+"</age></person>");
			} 
			result.append("</children></person>");
			
		}
		else{
		   result.append("<person><name>"+person.getName()+"</name><lastname>"+person.getLastName()+"</lastname><age>"+person.getAge()+"</age></person>");
		}
		return result.toString();
	}
}
