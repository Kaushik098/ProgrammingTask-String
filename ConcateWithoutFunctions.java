package usageOfString;

import java.util.*;

public class ConcateWithoutFunctions {

	public static void main(String args[]){
		 
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next(), str2 = sc.next();
		
		String concate_string = str1+" "+str2;
		
		System.out.print(concate_string);
	}
}
