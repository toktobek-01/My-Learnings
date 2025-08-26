class Student {
    // private fields
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();

        // Use setter methods to set values
        student.setName("Alice");
        student.setAge(20);

        // Use getter methods to get values
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
