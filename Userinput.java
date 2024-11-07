package anps9531;
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the first number:");
		float b=a.nextFloat();
		System.out.println("Enter the second number:");
		float c=a.nextFloat();
		System.out.println("The sum odf the b and c:");
		float d=b+c;
		System.out.println(d);
		a.close();

	}

}
