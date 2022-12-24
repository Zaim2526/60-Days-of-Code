//Java Program to Display Even Numbers till limit.
import java.util.*;
class DisplayEven {
    public static void main(String[] args) {
  
  Scanner sc = new Scanner (System.in);
  System.out.println(" Enter the limit: ");
  int number= sc.nextInt();
  int i=2;
System.out.println(" Even number are : ");
  while (i<=number)
  {
      System.out.println(i+ " ");
      i=i+2;
  }
  
    }
    
}
