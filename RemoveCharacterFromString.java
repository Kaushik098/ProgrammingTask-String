package usageOfString;

import java.util.*;

public class RemoveCharacterFromString {
    public static void main(String args[]){
    	Scanner sc= new Scanner(System.in);
    	String str1 = sc.next();
    	char ch = sc.next().charAt(0);
    	
    	String str2 = str1.replace("a", "");
    	
    	System.out.println("String before changes is :"+ str1);
    	System.out.println("String after changes is :"+ str2);

    }
}
