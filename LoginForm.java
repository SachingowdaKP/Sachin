package com.day1;
class InvalidPasswordException extends RuntimeException
{
	
}
public class LoginForm {

	public static void main(String[] args) {
		
		String id="Admin";
		int password=1234;
		if(id.equals("Admin"))
		{
			if(password==12345)
			{
				System.out.println("Login successful");
				
			}else
			{
				try 
				{
				InvalidPasswordException obj=new InvalidPasswordException();
				throw obj;
				}
				catch(InvalidPasswordException e) 
				{
					System.out.println("Invalid password entered!");
				}
			}
		}
		
	}

}
