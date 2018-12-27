package usageOfString;

import java.util.*;

public class CharArrayToString {
	public static void main(String args[]){
   	 Scanner sc = new Scanner(System.in);
     char ch[] = new char[10];
     String str="";
     
     for(int i=0;i<ch.length;i++){
    	  ch[i] = sc.next().charAt(0);
          str+=ch[i]; 
      }
     
     System.out.print(str);
	}
}
