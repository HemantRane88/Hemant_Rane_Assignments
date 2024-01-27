//Program to find largest number in an array.
package Assignment1;
public class Largest_No_Array 
{
	public static void main(String[]args)
	{
		int a[]= {10,30,60,33,45,89,78};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max elemet are:"+max);
	}

}
