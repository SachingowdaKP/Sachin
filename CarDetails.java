package anps9531;

class Car{
	private String name;
	private int mileage;
	private int cost;

	public void setData(String name,int mileage,int cost) {
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class CarDetails {
	public static void main(String[]args) {
		Car c=new Car();
		c.setData("Maruthi suzuki",20,300000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getCost());
		
	}
}
