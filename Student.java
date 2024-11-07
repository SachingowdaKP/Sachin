package anps9531;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		try (var a = new Scanner(System.in)) {
			int Kan=0,Eng=0,Hin=0,Ss=0,Math= 0,Sci=0,sum;
			double sum1;
		    Kan=a.nextInt();
		    Eng=a.nextInt();
		    Hin=a.nextInt();
		    Ss=a.nextInt();
		    Math=a.nextInt();
		    Sci=a.nextInt();
			sum=Kan+Eng+Hin+Ss+Math+Sci;
			System.out.println(sum);
			sum1=sum/625.0*100;	
			System.out.println(sum1);
			if(sum1>=85 && sum1<=100) {
				System.out.println("STUDENT IS DISTINCTION");
			}
			else if(sum1>=60 && sum1<=84) {
					System.out.println("STUDENT IS FIRST CLASS");
				}
			else if(sum1>35 && sum1<=59) 
			{
					System.out.println("STUDENT IS SECOND CLASS");
				}
			else 
			   {
			 		System.out.println("STUDENT IS FAIL");
				}
		}
	}

}
