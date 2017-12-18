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
public class MergeSort
{

	public static void main(String[] args)
	{
		int [] numbers1  = new int [] {0,2,1,3};
		System.out.println("Before Sort");
		for(int c = 0; c< numbers1.length; c++)
		{
			System.out.print(numbers1[c] + " ");
		}
		System.out.println("\n");
		mergeSort(numbers1);
		
		
	}
	
	public static void mergeSort(int [] a)
	{
		int comparision = 0;
		
		for(int c = 1; c<=a.length/2; c *= 2)
		{
			for(int j = c; j < a.length; j += c * 2)
			{
				int startL = 0;
				int startR = 0;
				int index = 0;
				int [] temp = new int[c*2];
				
				while(startL < c && startR < c)
				{				
					if(a [startL + (j - c)] < a[startR + j])
					{
						temp[index++] = a[(j - c) + startL++]; 
					}
					else
					{
						temp[index++] = a[j + startR++];
					}
					comparision++;
				}
				while(startL< c)
				{
					temp[index++] = a[(j - c) + startL++];
				}
				while(startR < c)
				{
					temp[index++] = a[j + startR++];;
				}
				
				int pTracking = (j - c);
				
				for(int y = 0; y < temp.length; y++)
				{					
					a[pTracking++] = temp[y];
					
				}
				
				
			}
		}
		System.out.println("After Sorted");
		for(int c = 0; c< a.length; c++)
		{
			System.out.print(a[c] + " ");
		}
		System.out.println("\n");
		System.out.println("Number of comparision: " + comparision);
	}
	
}
