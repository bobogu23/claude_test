# Subtraction Feature Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Add a separate `subtract()` method to HelloWorld.java that performs hard-coded subtraction (10 - 5) with output format `{num1}-{num2}={result}`, while preserving existing "Hello, World!" functionality.

**Architecture:** Add a new static method `subtract()` to the HelloWorld class. The method will contain hard-coded integer values, perform the subtraction operation, and print the result in the specified format. The method will be called from `main()` alongside the existing greeting output.

**Tech Stack:** Java 21 (JDK 21.0.11)

## Global Constraints

- Java Version: JDK 21 (path: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk`)
- Compiler: `javac` from JDK 21
- Runtime: `java` from JDK 21
- Output format for subtraction: `{num1}-{num2}={result}` (no spaces)
- Existing "Hello, World!" output must remain unchanged

---

### Task 1: Implement subtract() method in HelloWorld

**Files:**
- Modify: `HelloWorld.java` (add new method, update main() to call it)

**Interfaces:**
- Produces: `subtract()` static method that prints `10-5=5` to stdout

**Steps:**

- [ ] **Step 1: Open HelloWorld.java and add subtract() method**

Open the file and add the new method before the closing brace of the class:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        subtract();
    }
    
    public static void subtract() {
        int num1 = 10;
        int num2 = 5;
        int result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
    }
}
```

The complete file should look exactly like above.

- [ ] **Step 2: Compile the Java file**

Run:
```bash
/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac HelloWorld.java
```

Expected: No errors, `HelloWorld.class` file is created.

- [ ] **Step 3: Run the compiled program**

Run:
```bash
/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java HelloWorld
```

Expected output:
```
Hello, World!
10-5=5
```

- [ ] **Step 4: Verify output format**

Check that:
- Line 1 is exactly `Hello, World!`
- Line 2 is exactly `10-5=5` (no spaces around operators)
- No other output is present

- [ ] **Step 5: Commit the changes**

```bash
git add HelloWorld.java
git commit -m "feat: add subtract() method with hard-coded values (10 - 5)"
```

---

## Verification Checklist

- ✓ `subtract()` method exists as a static method in HelloWorld class
- ✓ Method contains hard-coded values: `num1 = 10`, `num2 = 5`
- ✓ Subtraction is performed: `result = num1 - num2`
- ✓ Output format is `10-5=5` (no spaces)
- ✓ Method is called from `main()`
- ✓ "Hello, World!" output is preserved
- ✓ Program compiles without errors
- ✓ Program runs and produces expected output
