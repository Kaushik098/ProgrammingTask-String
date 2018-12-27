package usageOfString;

import java.util.*;
public class LastOccuranceOfSubstring {
	
	public static void main(String args[]){
	   	 Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			
			String str[] = str1.split(" ");
			
			String s_last = str[str.length-1];
			int length = s_last.length();
			System.out.print(s_last.charAt(length-1));
			
	}
}
