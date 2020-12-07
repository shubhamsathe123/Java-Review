package Prime;
//Scanner class is inside the util package,thats why taking java.util package
import java.util.Scanner;

public class PrimeNumber 
{
	//program execution starts from main thread or method
	public static void main(String[] args) 
	{
		/*initialize count variable 0 for the counting of the factors
		as for checking the number is prime or not  finding the factors of the number is very 
		important */
		int count=0;
		
		//scanner class is taking for the user input purpose
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int no=s.nextInt();
		
		/*by iterating the for loop from one to that number ,I have just checking the how many factors 
		that number have */
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		
		//as prime number have only 2 factors i.e 1 and that particular number only
		//so by using if statement I have check that ,either number have 2 factors or more
		if(count==2)
		{
			//if factors are 2 then only number is prime
			System.out.println(no+ " is prime");
		}
		else
		{
			System.out.println(no +"is not prime");
		}
		
	}

}
