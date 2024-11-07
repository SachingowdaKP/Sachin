package anps9531;

public class Students implements java.io.Serializable {
	private String name;
	private int id;
	private String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public static void main(String[]args) {
		Students a=new Students();
		a.setName("SACHIN");
		a.setId(122);
		System.out.println(a.getName());
		System.out.println(a.getId());

	}

}
