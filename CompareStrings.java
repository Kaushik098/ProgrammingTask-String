package usageOfString;

import java.util.*;
public class CompareStrings {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		//compareto()
		   int var = str1.compareTo(str2);
		   System.out.print(var);
		   
		//equals
		   if(str1.equals(str2))
			   System.out.print("Given strings are equal");
		   else
			   System.out.print(str1+ ""+ str2+ ""+" is not equal");
		
	}
}
