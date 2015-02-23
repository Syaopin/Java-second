package HomeTask18;

import java.util.*;

public class Person {
private String name;
private String lastName;
private int age;
private List<Person> children;

public Person(String name, String lastName, int age){
	this.name = name;
	this.lastName = lastName;
	this.age = age;
}

public List<Person> getChildren() {
	return children;
}

public void setChildren(List<Person> children) {
	this.children = children;
}

@Override
public String toString() {
	return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age
			+ ", children=" + children + "]";
}

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
}