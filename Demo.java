package anps9531;

class Dog {
	String name;
	String breed;
	int cost;
    }
public class Demo{
	public static void main(String[]args) {
		Dog d=new Dog();
		d.name="jocky;";
		d.breed="cohedog;";
		d.cost=35000;	
		System.out.println("name  ="+d.name);
		System.out.println("breed ="+d.breed);
		System.out.println("cost  ="+d.cost);
	}
}
