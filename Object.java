class Objects {
    private static int count = 0; // Static variable to count the number of objects

    public Objects() {
        count++; // Increment count when a new object is created
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Object{
    public static void main(String[] args) {
        Objects obj1 = new Objects();
        Objects obj2 = new Objects();
        Objects obj3 = new Objects();

        Objects.displayCount(); // Display the count using the static method
    }
}
