
import java.util.*;

class GFG {

	public static void removeDuplicates(int[] a)
	{
		HashSet<Integer> set
			= new HashSet<Integer>();

		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		System.out.print(set);
	}

	public static void main(String[] args)
	{
		int a[] = {5,2,6,8,6,7,1,1,1,1,1,1,1,1,1,1,111,1,1,1,1,1,2,2,22,2,2,2,2,2,22,2,2,2,222,5,2,8,1,14,447,744,1212,54,454,455,5877,44,5854,44,2144,1444,14454,5455,5555,559888,8,545444544,9885855,45,45,45,45,4554,54,54,54,5,5,6,54456,6,6,56,56,5,66,56,56,56,5,656,56,6,565,65,65};
	
		removeDuplicates(a);
	}
}
