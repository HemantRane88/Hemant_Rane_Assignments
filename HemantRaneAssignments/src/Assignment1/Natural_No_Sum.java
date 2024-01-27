//Write a program to calculate the sum of first 10 digit number.
package Assignment1;
import java.util.Scanner;
public class Natural_No_Sum 
{
	public static void main(String args[])
	{
		/*int no=10,sum=0;
		for(int i=0;i<=no;i++)
		{
			sum=sum+i;
			//System.out.println("Sum of first 10 natural No is"+no);
		}
		System.out.println("Sum of first 10 natural No is "+sum);*/


		/*int num = 10, i = 1, sum = 0;
		//executes until the condition returns true
		while(i <= num)
		{
		//adding the value of i into sum variable
		sum = sum + i;
		//increments the value of i by 1
		i++;
		}
		//prints the sum
		System.out.println("Sum of First 100 Natural Numbers is = " + sum);*/


		int num, i, sum = 0;
		//object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Sum from: ");
		//takes an integer as input
		i = sc.nextInt();
		System.out.print("Sum up to: ");
		//takes an integer as input
		num = sc.nextInt();
		while(i <= num)
		{
		//adding the value of i into sum variable
		sum = sum + i;
		//increments the value of i by 1
		i++;
		}
		//prints the sum
		System.out.println("Sum of Natural Numbers = " + sum);
	}//0.0 1.1 2.3 3.6

}
