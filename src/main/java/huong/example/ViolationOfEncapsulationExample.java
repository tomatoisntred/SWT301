package huong.example;

class User {
    private final String name;
    private final int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main to test
    public static void main(String[] args) {
        User user = new User("Huong", 20);
        user.display();
    }
}
