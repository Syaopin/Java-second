package HomeTask14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelBook {
	//private ArrayList<Entry> m;
	Map <Person, Integer> contacts;

	public TelBook() {
		//m = new ArrayList<Entry>();
		contacts = new HashMap <Person, Integer>();
	}

	public void addEntry(Person s, int n) { // add new record to TelBook
		//m.add(new Entry(s, n));
		contacts.put(s, n);
	}

	public Integer findNum(String s) { // find number in TelBook by name
		Person p = new Person(); 
		boolean check = false;
       for (Map.Entry<Person, Integer> contact: contacts.entrySet()){
	      if (contact.getKey().getName().equals(s))
	       {
		     p = contact.getKey();
		     check = true;
	       }
         }
		if (check)
          return contacts.get(p);
		else
			return 0;
	}

	public void removeEntryByName(String s) { // remove entry from TelBook by Name
		Person p = new Person(); 
		boolean check = false;
       for (Map.Entry<Person, Integer> contact: contacts.entrySet()){
	      if (contact.getKey().getName().equals(s))
	       {
		     p = contact.getKey();
		     check = true;
	       }
         }
      if (check)
      { contacts.remove(p);
        System.out.println("Removing entry ..."+s);
        System.out.println("Removed Successfully!");
      } 
      else
       System.out.println("There is no entry with such name");
	}

	public void clearTelBook() { // clear TelBook
		System.out.println("Clearing...");
		//m.clear();
		contacts.clear();
		System.out.println("Cleared");
	}
	public void addSpouseRelations(String a, String b){
		Person spouse1 = new Person();
		Person spouse2 = new Person();
		boolean check1 = false;
		boolean check2 = false;
	     for (Map.Entry<Person, Integer> contact: contacts.entrySet()){
	 	      if (contact.getKey().getName().equals(a))
	 	       {
	 		     spouse1 = contact.getKey();
	 		     check1 = true;
	 	       }
	 	     if (contact.getKey().getName().equals(b))
	 	       {
	 		     spouse2 = contact.getKey();
	 		     check2 = true;
	 	       }
	          }
	     if (check1&&check2){
	    	   spouse1.setSpouse(spouse2);
	    	   spouse2.setSpouse(spouse1);
	    	   System.out.println("Information about spouses added");
	     }
	     else{
	    	  if(!check1) System.out.println("Didn't find "+a+"in telephone book");
	    	  if (!check2) System.out.println("Didn't find "+b+"in telephone book");
	     }
	}
public void addChildrenInfo(String a, String b, String c){
	Person parent = new Person();
	Person child1 = new Person();
	Person child2 = new Person();
	Person [] children = new Person[2]; 
	boolean check1 = false;
	boolean check2 = false;
	boolean check3 = false;
     for (Map.Entry<Person, Integer> contact: contacts.entrySet()){
 	      if (contact.getKey().getName().equals(a))
 	       {
 		     parent = contact.getKey();
 		     check1 = true;
 	       }
 	     if (contact.getKey().getName().equals(b))
 	       {
 		     child1 = contact.getKey();
 		     check2 = true;
 	       }
 	     if (contact.getKey().getName().equals(c))
	       {
		     child2 = contact.getKey();
		     check3 = true;
	       }
          
       }
     children[0] = child1;
     children[1] = child2;
     if (check1&&check2&&check3){
       parent.setChildren(children);
    	   System.out.println("Information about children added");
     }
     else{
    	  if(!check1) System.out.println("Didn't find "+a+"in telephone book");
    	  if (!check2) System.out.println("Didn't find "+b+"in telephone book");
    	  if (!check3) System.out.println("Didn't find "+c+"in telephone book");
     }	
}
public void compareEquality(String a, String b){
	Person person1 = new Person();
	Person person2 = new Person();
	boolean check = false;
    for (Map.Entry<Person, Integer> contact: contacts.entrySet()){
	      if (contact.getKey().getName().equals(a)&&!check)
	       {
	    	  person1 = contact.getKey();
	    	  check = true;
	       }
	     if (contact.getKey().getName().equals(b))
	       {
	    	 person2 = contact.getKey();
	       }
        }
    if (person1.equals(person2)) 
    	   System.out.println("Entries of "+person1+" and "+person2+" are equal");
    else
    	  System.out.println("Entries of"+person1+" and "+person2+" are NOT equal");
    
    	if (person1.hashCode()==person2.hashCode())
    		System.out.println("Hashcodes are equal: "+person1.hashCode()+" and "+person2.hashCode());
      else
      	  System.out.println("Hashcodes are NOT equal: "+person1.hashCode()+" and "+person2.hashCode());
}
	public String toString() {
	StringBuffer sb = new StringBuffer();	
     for (Map.Entry<Person, Integer> contact : contacts.entrySet()){
    	 sb.append(contact.getKey());
    	 sb.append("-----------");
    	 sb.append(contact.getValue());
    	 sb.append("\n");
     }
		return "TelBook \n" + sb;
	}

	static public void drawMenu() {
		System.out.println("============= Choose action ==========================");
		System.out.println("============= 1. Show telephone book =================");
		System.out.println("============= 2. Add an entry ========================");
		System.out.println("============= 3. Find number by name =================");
		System.out.println("============= 4. Remove entry by name ================");
		System.out.println("============= 5. Clear telephone book ================");
		System.out.println("============= 6. Add spouse relations ================");
		System.out.println("============= 7. Add children info ===================");
		System.out.println("============= 8. Check Equality  =====================");
		System.out.println("============= 0. Exit ================================");
	}

	public void chooseMenu() {
		drawMenu();
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (!input.equals("0")) {
			input = sc.nextLine();
			Person p = new Person();
			switch (input) {
			case "1":
				System.out.println(this);
				drawMenu();
				break;
			case "2":
				
				System.out.println("Input name: ");
				p.setName(sc.nextLine());
				System.out.println("Input last name");
				p.setLastName(sc.nextLine());
				System.out.println("Input age");
				p.setAge(Integer.parseInt(sc.nextLine()));
				System.out.println("Input number");
				
				
			try {
				int tmp = Integer.parseInt(sc.nextLine());
				this.addEntry(p, tmp);
				} catch (NumberFormatException e) {
					System.out.println("Incorrect number format");
				}
				drawMenu();
				break;
			case "3":
				System.out.println("Input name: ");
				input = sc.nextLine();
                 Integer res = this.findNum(input);
				
				if (res != 0) {
					System.out.println("Number of " + input + " is: "
							+ res);
				} else
					System.out.println("There is no such name!");
				drawMenu();
				break;
			case "4":
				System.out.println("Input name: ");
				input = sc.nextLine();
				this.removeEntryByName(input);
				drawMenu();
				break;
			case "5":
				this.clearTelBook();
				drawMenu();
				break;
			case "6":
				System.out.println("Input name of first spouse: ");
				input = sc.nextLine();
				System.out.println("Input name of second spouse: ");
				String input1 = sc.nextLine();
				this.addSpouseRelations(input,input1);
				drawMenu();
				break;
			case "7":
				System.out.println("Input name of person which children info must be changed: ");
				input = sc.nextLine();
				System.out.println("Input name of first child: ");
				input1 = sc.nextLine();
				System.out.println("Input name of second child: ");
				String input2 = sc.nextLine();
				this.addChildrenInfo(input,input1,input2);
				drawMenu();
				break;
			case "8":
				System.out.println("Input name of first person to compare: ");
				input = sc.nextLine();
				System.out.println("Input name of second person to compare: ");
				input1 = sc.nextLine();
				this.compareEquality(input, input1);
				drawMenu();
				break;
			case "0":
				System.out.println("Bye! ");
				break;
			default:
				System.out.println("You entered wrong number");
			}
		}

	}
}