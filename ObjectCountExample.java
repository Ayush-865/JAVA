class MyClass {
    private static int objectCount = 0;

    public MyClass() {
        objectCount++; // Increment the count when a new object is created
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

public class ObjectCountExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        int count = MyClass.getObjectCount();
        System.out.println("Number of objects created: " + count);
    }
}
