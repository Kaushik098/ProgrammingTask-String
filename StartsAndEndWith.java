package usageOfString;

import java.util.*;

public class StartsAndEndWith {
     public static void main(String args[]){
    	 Scanner sc = new Scanner(System.in);
    	 String str1 = sc.nextLine();
    	 
    	 if(str1.startsWith("Expectation"))
    		  System.out.print(true);
    	 else 
    		 System.out.print("String is not starting with compared word");
    	 
    	 if(str1.endsWith("Poison"))
    		  System.out.print(true);
    	 else
    		 System.out.print("String is not ending with compared word");
    	 
     }
}
