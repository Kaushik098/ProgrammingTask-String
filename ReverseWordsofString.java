package usageOfString;

import java.util.*;
public class ReverseWordsofString {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str [] = str1.split(" ");
		
		for(int i=0;i<str.length;i++){
			StringBuffer s = new StringBuffer();
			s.append(str[i]);
			System.out.print(s.reverse()+" ");
		}
	}
}
