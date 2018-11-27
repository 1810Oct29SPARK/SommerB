package com.revature.weather;
import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		int array1[] = {1, 4, 2};
		int array2[]= {4, 5, 6};
		int array3[] = {10, 44, 32, 6};
		int array4[] = {1, 2, 4};
		
		System.out.println("this is the 1st method");

		Arrays.sort(array1);
		for (int i =0;i <array1.length;i++ ) {
			System.out.println(array1[i]);
		}
		
		System.out.println();
		System.out.println("this is the 2nd method");
		System.out.println(Arrays.asList(array2).contains(4));
		
		System.out.println();
		System.out.println("this is the 3rd method");
		System.out.println(Arrays.equals(array1, array4));
		
		System.out.println();
		System.out.println("this is the 4th method");
		System.out.println(Arrays.binarySearch(array3, 6));
		
		System.out.println();
		System.out.println("this is the 5th method");
		System.out.println(Arrays.toString(array3));
		
		System.out.println();
		System.out.println("this is the 6nd method");
		System.out.println(Arrays.hashCode(array1));
		
	}
}
