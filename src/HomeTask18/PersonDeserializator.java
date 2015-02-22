package HomeTask18;

public class PersonDeserializator {
private final static String NAME_TAG = "<name>";
private final static String LASTNAME_TAG = "<lastname>";
private final static String AGE_TAG = "<age>";
public Person deSerialize(String xml){
	Person person = new Person("","", 0);
	StringBuilder str = new StringBuilder(xml);
	extractFromTags(str, person);
	if (str.indexOf("<chi", 0) == 0){
		
	}
	System.out.println(person);
	System.out.println(str);

	
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
