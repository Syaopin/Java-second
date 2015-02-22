package HomeTask14;

import java.util.Arrays;

public class Person {
private String name;
private String lastName;
private int age;
private Person spouse;
private Person [] children;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person getSpouse() {
	return spouse;
}
public void setSpouse(Person spouse) {
	this.spouse = spouse;
}
public Person[] getChildren() {
	return children;
}
public void setChildren(Person[] children) {
	this.children = children;
}
public Person(){
	
}
@Override
public String toString() {
	if(spouse == null){
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age
				+ ", spouse=" + spouse + ", children=" + Arrays.toString(children)
				+ "]";	
	} 
	else 
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age
			+ ", spouse=" + spouse.name + ", children=" + Arrays.toString(children)
			+ "]";
}



}
