package gitcode;

import java.util.*;

public class TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		int maxNum=0;
		
		maxNum=a>b? a: b ;
		
		System.out.println("Max in a and b is: " +maxNum);
	}

}
