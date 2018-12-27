package usageOfString;

import java.util.*;

public class CharacterOccurence {

	public static void main(String args[]){
	   	 Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
		    
			char ch[]= str1.toCharArray();
			
			for(int i=0;i<ch.length-1;i++){
				if((ch[i]>='a' && ch[i]<='z') || (ch[i] >='A' && ch[i]<='Z'))
					System.out.println(ch[i]+" is occured at "+ i);
			}
	}
}
