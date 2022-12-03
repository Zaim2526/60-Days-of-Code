import java.util.*;

public class continueBreak28 {

	public static void main(String[] args) {
	
   
		// continue
		System.out.println("Continue Statement:");
		for(int i=0 ; i<=10 ;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//break
		System.out.println("Break statement:");
		for(int i=0 ; i<=10 ;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
