public class TryCatch
{
   public static void main(String []args)
    {
       	 int a=10,b=0,c;
	System.out.println("hello 1");
   	try
	{
	c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
          	{
	System.out.println(e);
	}
	System.out.println("hello 2 ");
	System.out.println("hello 3");
     }
}
