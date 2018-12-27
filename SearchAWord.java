package usageOfString;

import java.util.*;

public class SearchAWord {

	public static void main(String args[]) {
		 
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String search_str = sc.next();
		String str [] = str1.split(" ");
		int flag = 0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(search_str)){
				 System.out.print("Word exists");
				 flag=1;
				 break;
				
			}
		}
		if(flag == 0)
			System.out.print("Word doesn't exists");
	}
}
