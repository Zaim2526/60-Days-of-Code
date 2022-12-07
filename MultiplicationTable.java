// Java code to perform multiplication table.
import java.util.*;
class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enterthe number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
