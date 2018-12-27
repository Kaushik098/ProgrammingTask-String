package usageOfString;

import java.util.*;

public class ReplaceSubstring {

	 public static void main(String args[]){
		  Scanner sc = new Scanner(System.in);
		  String str1 = sc.nextLine();
		  String str2 = sc.next();
		 
		  String str3 = str1.substring(10, 18);
		  if(str3.equals(str2))
			   str1.replace(str2, "alright");
		  
		  System.out.print(str3 +" is changed to alright");
	 }
}
