package com.day1;
import java.util.Scanner;
public class ThreeDimensionArray {

	public static void main(String[] args) {
		int age[][][]=new int[2][3][5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=age.length-1;i++)
		{
			for(int j=0;j<=age[i].length-1;j++) 
			{
				{
					for(int k =0; k<age[i][j].length-1;k++) 
					{
					System.out.println("enter the age of student from school"+ i +"classroom "+ j + "Student"+ k);
					age[i][j][k]=s.nextInt();
					}
				}
			}
		}
	}

}
