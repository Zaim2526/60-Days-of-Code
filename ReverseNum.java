// Java Program to reverse a number using while loop.

import java.util.*;
class ReverseNum {
  public static void main(String[] args) {
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int reversed = 0;
    
    System.out.println("Original Number: " + num);

    while(num != 0) {
    
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
