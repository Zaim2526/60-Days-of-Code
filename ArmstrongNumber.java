package gitcode;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		        int  originalNumber, remainder, result = 0;

		        originalNumber = n;

		        while (originalNumber != 0)
		        {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, 3);
		            originalNumber /= 10;
		        }

		        if(result == n)
		            System.out.println(n + " is an Armstrong number.");
		        else
		            System.out.println(n + " is not an Armstrong number.");
		    }
		}
	
