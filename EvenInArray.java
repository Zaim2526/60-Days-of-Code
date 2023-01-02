// Java Program to print even number from an array.

import java.util.*;
public class EvenInArray{  
public static void main(String args[]){  

int a[]={1,2,5,6,3,2,7,10,16,73};  

System.out.println("Even Numbers:");  
      for(int i=0;i<a.length;i++){  
          if(a[i]%2==0){  
       System.out.print(a[i]+" ");  
         }  
     }  
  }
    
}  
