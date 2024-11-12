package com.day1;
import java.util.Scanner;
public class OneDimensionalArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the age:");
			a[i]=s.nextInt();
		}
	}

}
