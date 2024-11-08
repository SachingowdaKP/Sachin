package com.day1;

import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
			Scanner a=new Scanner (System.in);
			System.out.println("Enter the value of a:");
			int s=a.nextInt();
			System.out.println("Enter the value of b:");
			int r=a.nextInt();
			try {
			System.out.println(s/r);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}

	}

}
