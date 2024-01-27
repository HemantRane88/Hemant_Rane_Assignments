//Write a program to print below star pattern
package Assignment1;

public class StarPattern 
{
	public static void main(String[]args)
	{
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
