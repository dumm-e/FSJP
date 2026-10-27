class Student {
    String name = "Rahul";
    int age = 18;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}

