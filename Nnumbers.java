import java.util.Scanner;
public class Nnumbers 
	 {
	  private static Scanner s;
		public static void main(String[] args)
	     {
	        int n,i=1,sum=0;
	        s = new Scanner(System.in);
	        System.out.print("Enter Number :");
	        n=s.nextInt();
	        do
	         {
	                 sum=sum+i;
	                 i +=1;
	         }   
	        while(i<=n);
	        System.out.print("Sum of First " + n + " Numbers = "+sum);
	     }
}