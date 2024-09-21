package week1Assignement;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 2, 4, 6, 8, 12, 45 };
		int arr2[] = { 2, 6, 34, 56, 8 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) //run loop for Array1
			for (int j = 0; j < arr2.length; j++) //run loop for Array2
			{
				if (arr1[i] == arr2[j])  //condition check if value are same in any of the array
				{
					System.out.print(arr1[i]+", ");
				}

			}
	}

}
