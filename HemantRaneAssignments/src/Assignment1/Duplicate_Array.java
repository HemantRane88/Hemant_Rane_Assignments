//Program to find duplicate number in an array.
package Assignment1;
public class Duplicate_Array 
{
	public static void main(String[]args)
	{
		int arr[]= {10,20,30,30,40};
		//String arr[]= {"ab","ac","ac","ab","ad"};
		int size=arr.length;
		System.out.println("Entered elements size are: "+size);//5
		//Searches for duplicate element
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("position of duplicate element: "+i);
					System.out.println("Duplicate elements in given array: "+arr[j]);
				}
			}
		}
	}

}
