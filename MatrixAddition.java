// Java Program to add two Matrix.

public class MatrixAddition{  
public static void main(String args[]){  
 
    int a[][]={{1,5,4},{2,4,8},{3,4,4}};    
    int b[][]={{1,6,4},{1,2,3},{1,9,4}};    
  
    int c[][]=new int[3][3];  
    
    for(int i=0;i<3;i++){    
         for(int j=0;j<3;j++){    
          c[i][j]=a[i][j]+b[i][j];    
          System.out.print(c[i][j]+" ");    
          }    
    System.out.println();    
   }    
  } 
}  
