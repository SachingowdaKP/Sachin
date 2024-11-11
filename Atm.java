package com.day1;
import java.util.Scanner;
class InsufficentBalanceException extends RuntimeException
{
	
}
public class Atm 
{

	public static void main(String[] args)
	{
		
		Scanner obj=new Scanner(System.in);
		int balance=2000;
		System.out.println("withdraw the amount");
		int amount=obj.nextInt();
		if(balance>=amount) 
		{
				System.out.println("Withdraw successful");
			}else
			{
				try 
				{
					InsufficentBalanceException a=new InsufficentBalanceException();
					throw a;
				}catch(InsufficentBalanceException e) {
					System.out.println("you entered insufficent amount");
				
			 }
			
		 }
		

	}

}
