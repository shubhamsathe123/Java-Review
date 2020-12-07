
package Palindrome;
//Scanner class is inside the util package,thats why taking java.util package
import java.util.Scanner;

public class PalindromePgm 
{
	//program execution starts from main thread or main method
  public static void main(String[] args) 
  {
	//scanner class is taking for the user input purpose
	    Scanner s=new Scanner(System.in);
		System.out.println("enter no ");
		int no=s.nextInt();
		
       //initialized rev with 0 as it is required in while loop
		int rev=0;
		/*I have store the variable no into another variable temp for the future purpose, as 
		it is required to check the revere number and given number both are same only */
		int temp=no;
		
		/*while loop executes upto the number is not equal to 0,
		once number is 0 it automatically terminates*/
		while(no!=0)
		{
			//by taking rem variable,using modulo operator we can find the reminder 
			int rem=no%10;
			//formulae for getting the first number
			rev=(rev*10)+rem;
			//for getting the number again
			no=no/10;
		}
		
		/*as if reveres number is equal to given number 
		then only number is palindrome */
		if(temp==rev)
		{
			System.out.println(temp +"is palindrome");
			
		}
		else
		{
			System.out.println(temp +"is not palindrome");
		}	
  }
}
