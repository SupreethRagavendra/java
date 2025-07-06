class Student {
    String name="rahul";
    int age = 20;

//    // Constructor
//    Student(String name, int age) {
//        this.name = name; // this refers to the current object
//        this.age = age;
//    }

    // Method to display values
    void display() {
        name ="ravi";
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to create object and call display
    public static void main(String[] args) {
        // Creating an object
        Student s1 = new Student();

        // Calling the display method
        s1.display();
    }
}
