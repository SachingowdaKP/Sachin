package labassiment;
class Student18 {
    // Instance variables
    String name;
    int age;
    String department;

    // Default constructor
    public Student18() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with two parameters: name and age
    public Student18(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Constructor with three parameters: name, age, and department
    public Student18(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Using the default constructor
        Student18 student1 = new Student18();
        student1.displayInfo();

        // Using the constructor with name and age
        Student18 student2 = new Student18("Alice", 22);
        student2.displayInfo();

        // Using the constructor with name, age, and department
        Student18 student3 = new Student18("Bob", 24, "Computer Science");
        student3.displayInfo();
    }
}

