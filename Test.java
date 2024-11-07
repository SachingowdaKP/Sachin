package anps9531;

public class Test {
	void registerStudent(Students s)
	{
		System.out.println(s.getName());
		System.out.println(s.getId());
	}

	public static void main(String[] args) {
		Students s=new Students();
		s.setName("Sachin");
		System.out.println(s.getName());
		s.setId(122);
		System.out.println(s.getId());
	}

}
