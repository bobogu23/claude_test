# Java Record Demo Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Create an educational demo that showcases Java record features including basic records, custom methods, compact constructors, and multiple components.

**Architecture:** Single `RecordDemo.java` file containing four record definitions (Person, Circle, Product, Address) with a main method that demonstrates each record's capabilities including auto-generated methods, custom methods, compact constructor validation, and immutability.

**Tech Stack:** Java 21 (JDK 21)

## Global Constraints

- Compile and run with: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac` and `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java`
- Target Java 21+ features (records, compact constructors)
- Single file structure for ease of learning
- No external dependencies

---

### Task 1: Create RecordDemo.java with Basic Record (Person)

**Files:**
- Create: `RecordDemo.java`

**Interfaces:**
- Produces: `Person` record with `name` (String) and `age` (int) fields; auto-generated accessor methods `name()`, `age()`, `equals()`, `hashCode()`, `toString()`

- [ ] **Step 1: Create RecordDemo.java with Person record**

```java
public class RecordDemo {
    // Basic record - demonstrates auto-generated constructor, accessors, equals, hashCode, toString
    record Person(String name, int age) {}

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
    }
}
```

- [ ] **Step 2: Compile the file**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac RecordDemo.java`

Expected: No errors, `RecordDemo.class` created

- [ ] **Step 3: Run the demo**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java RecordDemo`

Expected: Output shows Person record with auto-generated toString, accessor methods, and equals/hashCode behavior

- [ ] **Step 4: Commit**

```bash
git add RecordDemo.java
git commit -m "feat: add basic Person record example"
```

---

### Task 2: Add Circle Record with Custom Method

**Files:**
- Modify: `RecordDemo.java`

**Interfaces:**
- Consumes: `RecordDemo` class from Task 1
- Produces: `Circle` record with `radius` (double) field; custom method `area()` that returns `double`

- [ ] **Step 1: Add Circle record to RecordDemo.java**

Add after the `Person` record definition:

```java
    // Record with custom method - demonstrates adding behavior to records
    record Circle(double radius) {
        public double area() {
            return Math.PI * radius * radius;
        }
    }
```

- [ ] **Step 2: Add Circle demonstration to main method**

Add before the closing brace of main method:

```java
        // Record with Custom Method Example
        System.out.println("2. Record with Custom Method (Circle):");
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        
        System.out.println("circle1: " + circle1);
        System.out.println("circle1.radius(): " + circle1.radius());
        System.out.println("circle1.area(): " + circle1.area());
        System.out.println("circle1.equals(circle2): " + circle1.equals(circle2));
        System.out.println();
```

- [ ] **Step 3: Compile and run**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac RecordDemo.java`

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java RecordDemo`

Expected: Output shows both Person and Circle examples with Circle demonstrating custom method `area()`

- [ ] **Step 4: Commit**

```bash
git add RecordDemo.java
git commit -m "feat: add Circle record with custom area() method"
```

---

### Task 3: Add Product Record with Compact Constructor

**Files:**
- Modify: `RecordDemo.java`

**Interfaces:**
- Consumes: `RecordDemo` class from Task 2
- Produces: `Product` record with `name` (String) and `price` (double) fields; compact constructor that validates price > 0

- [ ] **Step 1: Add Product record with compact constructor**

Add after the `Circle` record definition:

```java
    // Record with compact constructor - demonstrates validation in constructor
    record Product(String name, double price) {
        public Product {
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be positive");
            }
        }
    }
```

- [ ] **Step 2: Add Product demonstration to main method**

Add before the closing brace of main method:

```java
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
```

- [ ] **Step 3: Compile and run**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac RecordDemo.java`

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java RecordDemo`

Expected: Output shows Person, Circle, and Product examples with Product demonstrating validation and exception handling

- [ ] **Step 4: Commit**

```bash
git add RecordDemo.java
git commit -m "feat: add Product record with compact constructor validation"
```

---

### Task 4: Add Address Record with Multiple Components

**Files:**
- Modify: `RecordDemo.java`

**Interfaces:**
- Consumes: `RecordDemo` class from Task 3
- Produces: `Address` record with `street` (String), `city` (String), and `zipCode` (String) fields

- [ ] **Step 1: Add Address record**

Add after the `Product` record definition:

```java
    // Record with multiple components - demonstrates records with several fields
    record Address(String street, String city, String zipCode) {}
```

- [ ] **Step 2: Add Address demonstration to main method**

Add before the closing brace of main method:

```java
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
```

- [ ] **Step 2: Compile and run**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac RecordDemo.java`

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java RecordDemo`

Expected: Complete output showing all four record types demonstrating their features

- [ ] **Step 3: Verify immutability**

Verify that attempting to modify a record field (like `person1.name = "Eve"`) would result in a compilation error. You can test this by trying to add such a line and seeing the error.

- [ ] **Step 4: Commit**

```bash
git add RecordDemo.java
git commit -m "feat: add Address record and complete demo with immutability note"
```

---

## Summary

This plan creates a comprehensive educational demo of Java records in a single file, progressing from basic records to advanced features:

1. **Person** - Auto-generated methods (accessors, equals, hashCode, toString)
2. **Circle** - Custom methods within records
3. **Product** - Compact constructor with validation
4. **Address** - Multiple components with generated methods
5. **Main demo** - Shows all features and immutability guarantee
