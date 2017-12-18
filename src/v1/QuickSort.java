package v1;

/*
 * Purpose: Data Structure and Algorithms Lab 10
 * Status: Complete and thoroughly tested
 * Last update: 04/12/2017
 * Submitted:  04/13/2017
 * Comment: test suite and sample run attached
 * @author: Thien Do
 * @version: 04/12/2017
 */
public class QuickSort
{
	static int comparision  = 0;
	public static void main(String[] args)
	{
		int [] numbers1  = new int [] {0,2,1,3};
		System.out.println("Before Sort");
		for(int c = 0; c< numbers1.length; c++)
		{
			System.out.print(numbers1[c] + " ");
		}
		System.out.println("\n");
		
		quickSort(numbers1, 0 , numbers1.length - 1);
		
		System.out.println("After Sort");
		for(int c = 0; c< numbers1.length; c++)
		{
			System.out.print(numbers1[c] + " ");
		}
		System.out.println("\n");
		System.out.println("Number of comparision: " + comparision);
		
	}

	public static void quickSort(int [] a, int low, int high)
	{
		int c = low;
		int i = high;
		int temp;
		int pValue = a[(low + high)/2];
		
		while (c <= i)
		{
			while(a[c] < pValue)
			{
				c++;
			}
			while(a[i] > pValue)
			{
				i--;
			}
			if (c <= i)
			{
				temp = a[c];
				a[c] = a[i];
				a[i] = temp;
				c++;
				i--;
			}
			comparision++;
		}
		
		if(low < i)
		{
			quickSort(a, low, i);
		}
		if (c < high)
		{
			quickSort(a, c, high);
		}
	}
	
}

