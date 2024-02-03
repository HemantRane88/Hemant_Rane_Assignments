//To find entered number is prime or not.
package Assignment1;
import java.util.Scanner;
public class Prime_No
{
	public static void main(String args[])
	{
		int no,count=0;
		System.out.println("Enter any number   ");//3
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for(int i=1;i<=no;i++)//no=3 1<=3 2<=3 3<=3
		{

			if(no%i==0)//3%1=0 3%2=1 False 3%3=0
			{
				count++;//1 2
			}
		} 
		if(count==2)
		{

			System.out.println("Entered number is prime & it is divisible by 1 & itself");
		}
		else
		{
			System.out.println("Entered number is not prime");
		}
	}

}
