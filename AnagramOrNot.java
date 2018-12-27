package usageOfString;

import java.util.*;
public class AnagramOrNot {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1  = sc.next();
		String str2 = sc.next();
		
		char ch1 [] = str1.toCharArray();
		char ch2 [] = str2.toCharArray();
		
		if(ch1.length == ch2.length){
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		
		int flag =0;
		
		for(int i=0;i<ch1.length;i++){
			  if(ch1[i] != ch2[i]){
				  System.out.print("Strings are not anagram");
				  flag = 1;
				  break;
			  }
	    	}
		   if(flag == 0)
			    System.out.print("Strings are anagram");
		}
		else{
			 System.out.print("Strings are not anagram");
		}
		
	}
}
