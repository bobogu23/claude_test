# Addition Feature Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Add two-number addition functionality to HelloWorld.java with formatted output `{num1}+{num2}={result}`.

**Architecture:** Add two static methods to HelloWorld: `add(int, int)` for calculation and `formatAddition(int, int, int)` for string formatting. Update `main()` to demonstrate both methods.

**Tech Stack:** Java 21 (JDK 21.0.11)

## Global Constraints

- Java Version: JDK 21
- JDK Path: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk`
- Output format must be exactly: `{num1}+{num2}={result}`
- Both methods must be static
- No external dependencies

---

### Task 1: Add `add()` Method

**Files:**
- Modify: `HelloWorld.java`

**Interfaces:**
- Produces: `public static int add(int num1, int num2)` — returns the sum of num1 and num2

- [ ] **Step 1: Open HelloWorld.java and locate the class body**

Current file:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- [ ] **Step 2: Add the `add()` method before `main()`**

Insert this method after the class declaration and before `main()`:
```java
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
```

Result:
```java
public class HelloWorld {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- [ ] **Step 3: Compile to verify syntax is correct**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac HelloWorld.java`
Expected: No output (successful compilation)

- [ ] **Step 4: Commit**

```bash
git add HelloWorld.java
git commit -m "feat: add static add() method for integer addition"
```

---

### Task 2: Add `formatAddition()` Method

**Files:**
- Modify: `HelloWorld.java`

**Interfaces:**
- Consumes: `public static int add(int num1, int num2)` (from Task 1)
- Produces: `public static String formatAddition(int num1, int num2, int result)` — returns formatted string

- [ ] **Step 1: Add the `formatAddition()` method after the `add()` method**

Insert this method between `add()` and `main()`:
```java
    public static String formatAddition(int num1, int num2, int result) {
        return String.format("%d+%d=%d", num1, num2, result);
    }
```

Result:
```java
public class HelloWorld {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String formatAddition(int num1, int num2, int result) {
        return String.format("%d+%d=%d", num1, num2, result);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- [ ] **Step 2: Compile to verify syntax is correct**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac HelloWorld.java`
Expected: No output (successful compilation)

- [ ] **Step 3: Commit**

```bash
git add HelloWorld.java
git commit -m "feat: add static formatAddition() method for output formatting"
```

---

### Task 3: Update `main()` to Use New Methods

**Files:**
- Modify: `HelloWorld.java`

**Interfaces:**
- Consumes: 
  - `public static int add(int num1, int num2)` (from Task 1)
  - `public static String formatAddition(int num1, int num2, int result)` (from Task 2)

- [ ] **Step 1: Replace the `main()` method body**

Change from:
```java
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
```

To:
```java
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(formatAddition(5, 3, result));
    }
```

Final HelloWorld.java:
```java
public class HelloWorld {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String formatAddition(int num1, int num2, int result) {
        return String.format("%d+%d=%d", num1, num2, result);
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(formatAddition(5, 3, result));
    }
}
```

- [ ] **Step 2: Compile the program**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac HelloWorld.java`
Expected: No output (successful compilation)

- [ ] **Step 3: Run the program to verify output**

Run: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java HelloWorld`
Expected output: `5+3=8`

- [ ] **Step 4: Commit**

```bash
git add HelloWorld.java
git commit -m "feat: update main() to demonstrate addition feature with formatted output"
```

---

## Self-Review Checklist

**Spec Coverage:**
- ✅ Task 1: Implements `add(int num1, int num2)` method (spec requirement)
- ✅ Task 2: Implements `formatAddition(int num1, int num2, int result)` method with `{num1}+{num2}={result}` format (spec requirement)
- ✅ Task 3: Updates `main()` to call both methods and print formatted output (spec requirement)

**Placeholder Scan:**
- ✅ No "TBD", "TODO", or incomplete sections
- ✅ All code is complete and shown
- ✅ All commands are exact with expected output

**Type Consistency:**
- ✅ `add()` signature: `public static int add(int num1, int num2)` — consistent across all tasks
- ✅ `formatAddition()` signature: `public static String formatAddition(int num1, int num2, int result)` — consistent across all tasks

**Execution Requirements:**
- ✅ Each task has clear compilation and verification steps
- ✅ Each task ends with a commit
- ✅ Tasks are ordered with proper dependencies

---
