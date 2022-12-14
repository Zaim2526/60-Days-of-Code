// java program to reverse a word
package gitcode;
import java.io.*;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
				
				String str= "zaim", nstr="";
				char ch;
				
			System.out.print("Original word: ");
			System.out.println("zaim"); //Example word
				
			for (int i=0; i<str.length(); i++)
			{
				ch= str.charAt(i); 
				nstr= ch+nstr; 
			}
			System.out.println("Reversed word: "+ nstr);
			}
		

		

	}
