package com.day1;
import java.util.Scanner;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int age[][]=new int[2][5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=age.length-1;i++)
		{
			for(int j=0;j<=age[i].length-1;j++) 
			{
				System.out.println("Enter the age of class" + i +"Student" +j);
				age[i][j]=s.nextInt();		
			}
			System.out.println("The ages are :");
		    for( i = 0; i<=age.length-1;i++)//classroom
		    {
		    	for(int j = 0;j<=age[i].length-1;j++)//students
		    	{
		    		System.out.println(age[i][j]); 		
		    	}
		    }
	   }
	}
}
