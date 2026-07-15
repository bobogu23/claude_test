public class RecordDemo {
    // Basic record - demonstrates auto-generated constructor, accessors, equals, hashCode, toString
    record Person(String name, int age) {}

    // Record with custom method - demonstrates adding behavior to records
    record Circle(double radius) {
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    // Record with compact constructor - demonstrates validation in constructor
    record Product(String name, double price) {
        public Product {
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be positive");
            }
        }
    }

    // Record with multiple components - demonstrates records with several fields
    record Address(String street, String city, String zipCode) {}

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

        // Record with Compact Constructor Example
        System.out.println("3. Record with Compact Constructor (Product):");
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Laptop", 999.99);

        System.out.println("product1: " + product1);
        System.out.println("product1.name(): " + product1.name());
        System.out.println("product1.price(): " + product1.price());
        System.out.println("product1.equals(product2): " + product1.equals(product2));

        try {
            Product invalidProduct = new Product("Invalid", -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
        System.out.println();

        // Record with Multiple Components Example
        System.out.println("4. Record with Multiple Components (Address):");
        Address address1 = new Address("123 Main St", "Springfield", "12345");
        Address address2 = new Address("123 Main St", "Springfield", "12345");
        Address address3 = new Address("456 Oak Ave", "Portland", "67890");

        System.out.println("address1: " + address1);
        System.out.println("address1.street(): " + address1.street());
        System.out.println("address1.city(): " + address1.city());
        System.out.println("address1.zipCode(): " + address1.zipCode());
        System.out.println("address1.equals(address2): " + address1.equals(address2));
        System.out.println("address1.equals(address3): " + address1.equals(address3));
        System.out.println();

        System.out.println("=== Records are Immutable ===");
        System.out.println("Records cannot be modified after creation (no setters)");
    }
}
