public class RecordDemo {
    // Basic record - demonstrates auto-generated constructor, accessors, equals, hashCode, toString
    record Person(String name, int age) {}

    // Record with custom method - demonstrates adding behavior to records
    record Circle(double radius) {
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Java Records Demo ===\n");

        // Basic Record Example
        System.out.println("1. Basic Record (Person):");
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println("person1: " + person1);
        System.out.println("person1.name(): " + person1.name());
        System.out.println("person1.age(): " + person1.age());
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1.hashCode() == person2.hashCode(): " + (person1.hashCode() == person2.hashCode()));
        System.out.println();

        // Record with Custom Method Example
        System.out.println("2. Record with Custom Method (Circle):");
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);

        System.out.println("circle1: " + circle1);
        System.out.println("circle1.radius(): " + circle1.radius());
        System.out.println("circle1.area(): " + circle1.area());
        System.out.println("circle1.equals(circle2): " + circle1.equals(circle2));
        System.out.println();
    }
}
