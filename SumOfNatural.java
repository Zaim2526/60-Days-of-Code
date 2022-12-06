// Java progra to implement conditional statement.
import java.util.*;
class SumOfNatural {
    public static void main(String[] args) {
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
       for(int i=1;i<=n;i++){
           sum=sum+i;
       }
       System.out.print("sum of n natural number is: "+ sum);
    }
}
