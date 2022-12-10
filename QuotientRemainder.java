package gitcode;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DIVIDEND:");
		int dividend = sc.nextInt();
		System.out.println("ENTER THE DIVISOR:");
        int divisor = sc.nextInt();
        
        
        int quotient = dividend / divisor;
        int remainder=dividend %  divisor;
        
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = "+ remainder);
	}

}
