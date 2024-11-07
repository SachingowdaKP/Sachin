package anps9531;

class CreditCard
{
	int CardNo=12345;
	int Pin=2823;
}
class Hacker extends CreditCard
{
	void ViewDetails()
	{
		System.out.println("Card Number : "  +  CardNo);
		System.out.println("Pin Number  : "  +  Pin);
	}
	void changesDetails()
	{
		CardNo=67890;
	    Pin=1767;
	    System.out.println("AFTER CHANGING "); 
	    System.out.println("Card Number : "  +  CardNo);
		System.out.println("Pin Number  : "  +  Pin);
	}
}
public class IntExam {

	public static void main(String[] args) {
		Hacker a=new Hacker();
		a.ViewDetails();
		a.changesDetails();		
	}

}
/*package labassiment;

import labassiment.Bike;
import labassiment.Car;
import labassiment.Main;

class Main {
    
    String make;
    String model;
    int year;
    int maximumSpeed;

    
    public Main(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Main {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overriding the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Main {
    // Constructor for Bike
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overriding the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class main{
    public static void main(String[] args) {
        // Instantiating Car and Bike objects
        Car car = new Car("Toyota", "Camry", 2022, 180);
        Bike bike = new Bike("Honda", "CBR600RR", 2021, 240);

        // Printing Car attributes and invoking drive method
        System.out.println("Car Details:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Maximum Speed: " + car.maximumSpeed + " km/h");
        car.drive();

        // Printing Bike attributes and invoking drive method
        System.out.println("\nBike Details:");
        System.out.println("Make: " + bike.make);
        System.out.println("Model: " + bike.model);
        System.out.println("Year: " + bike.year);
        System.out.println("Maximum Speed: " + bike.maximumSpeed + " km/h");
        bike.drive();
    }
}*/

