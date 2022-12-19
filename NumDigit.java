//Count Number of Digits in an Integer using while loop.
import java.util.*;
public class NumDigit {

  public static void main(String[] args) {
      System.out.println("Enter the number: ");
Scanner sc = new Scanner (System.in);
int num = sc.nextInt();
    int count = 0;

    while (num != 0) {
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}
