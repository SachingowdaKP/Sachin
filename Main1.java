package labassiment;

//Base class Vehicle
class Vehicle1 {
 void start() {
     System.out.println("Vehicle started.");
 }
}

//Subclass Car
class Car1 extends Vehicle1 {
 @Override
 void start() {
     System.out.println("Car started.");
 }
}

//Subclass Motorcycle
class Motorcycle extends Vehicle1 {
 @Override
 void start() {
     System.out.println("Motorcycle started.");
 }
}

//Class Garage
class Garage {
 void serviceVehicle(Vehicle1 vehicle) {
     vehicle.start();
     System.out.println("Vehicle serviced.");
 }
}

//Main class
public class Main1 {
    public Main1(String make, String model, int year, int maximumSpeed) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car1 car = new Car1();
        Motorcycle motorcycle = new Motorcycle();

        // Create instance of Garage
        Garage garage = new Garage();

        // Service the Car and Motorcycle
        garage.serviceVehicle(car);
        garage.serviceVehicle(motorcycle);
    }
}

