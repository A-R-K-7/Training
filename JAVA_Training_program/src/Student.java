public class Student {
    String name;
    int age;
    String address;
    int rollNo;

    Student(String name, int age, String address, int rollNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Roll No: "+rollNo);
    }

    public void makeNoise() {
        System.out.println("I am a "+name);
    }
    public void Study() {
        System.out.println(name+" is studying");
    } 

    public static void main(String[] args) {
        Student s1 = new Student("Akshay", 20, "New York", 1);
        Student s2 = new Student("Reddy", 21, "California", 2);
        s1.display();
        s2.display();
        s1.makeNoise();
        s2.makeNoise();
    }
}
