// java code for alphabet ractangle pattern.
import java.util.*;

public class AlphabetRectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char alphabet='a';

		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				System.out.print(" "+alphabet+" ");
				alphabet++;
			}
			System.out.println();

		}
	}
}
