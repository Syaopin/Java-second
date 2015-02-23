package HomeTask18;

import java.util.*;

public class PersonDeserializator {
	
private final static String PERSON_TAG = "<person>";
private final static String NAME_TAG = "<name>";
private final static String LASTNAME_TAG = "<lastname>";
private final static String AGE_TAG = "<age>";
private final static String CHILDREN_TAG = "<children>";
private String stringFromXML;


public String getStringFromXML() {
	return stringFromXML;
}

public void setStringFromXML(String stringFromXML) {
	this.stringFromXML = stringFromXML;
}

public Person deSerialize(String xml){
	
	Person person = new Person("","", 0);
	Person child = new Person("","", 0);
	List<Person> childrenList = new ArrayList<Person>();
	StringBuilder str = new StringBuilder(xml);
	
	extractFromTags(str, person);
	if (str.indexOf("<chi", 0) == 0){
		while(str.indexOf("</chi", 0) != 0){
		  extractFromTags(str, child);
		  str = str.delete(0, PERSON_TAG.length()+1);
		  childrenList.add(child);
		}
		str = str.delete(0, CHILDREN_TAG.length()+1);
		person.setChildren(childrenList);
	}
	
	str = str.delete(0, PERSON_TAG.length()+1);
	stringFromXML = str.toString();
	return person;
}

  public void extractFromTags(StringBuilder str, Person person){
	person.setName(str.substring(str.indexOf(NAME_TAG, 0)+NAME_TAG.length(), str.indexOf("</", 0)));
	str = str.delete(0, str.indexOf("</", 0)+NAME_TAG.length()+1);
	person.setLastName(str.substring(LASTNAME_TAG.length(), str.indexOf("</", 0)));
	str = str.delete(0, str.indexOf("</", 0)+LASTNAME_TAG.length()+1);
	person.setAge(Integer.parseInt(str.substring(AGE_TAG.length(), str.indexOf("</", 0))));
	str = str.delete(0, str.indexOf("</", 0)+AGE_TAG.length()+1);
  }

}