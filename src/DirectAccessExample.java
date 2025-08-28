class Dog {
    public String name;
    public int age;
}

public class DirectAccessExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";  // directly setting
        d.age = 3;

        System.out.println(d.name + " is " + d.age + " years old.");
    }
}
