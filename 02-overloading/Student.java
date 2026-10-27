class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student first = new Student();
        Student second = new Student(101, "Rahul");
        first.display();
        System.out.println();
        second.display();
    }
}

