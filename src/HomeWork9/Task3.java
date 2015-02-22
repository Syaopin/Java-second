package HomeWork9;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		 String []su = {"іванов", "янко", "есаулов",  "сирота", "їжак",
				    "єрмаков", "тягнирядно", "остапенко", "антонов"};
				 //Arrays.sort(su);
		 System.out.println("------------Task 3------------");
				 System.out.println("Before sorting: "+Arrays.toString(su));
				 
    String a = "а,б,в,г,ґ,д,е,є,ж,з,и,і,ї,й,к,л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,щ,ь,ю,я";
    System.out.println("Alphabet: "+a);
    String tmp = "";
  for (int i = 0; i < su.length - 1; i ++){
	  int flag = 0;
	  for (int j = 0; j < su.length - 1 - i; j ++){
	  if (a.indexOf(su[j].charAt(0)) > a.indexOf(su[j+1].charAt(0)))
		  {
		  tmp = su[j];
	      su[j] = su[j+1];
	      su[j+1] = tmp;
	      flag = 1;
		  }
      }
	  if (flag == 0) break;
  }
  System.out.println("After sorting: "+Arrays.toString(su));
 }
}
