# Subtraction Feature Design

**Date:** 2026-07-16  
**Feature:** Add subtraction functionality to HelloWorld.java  
**Scope:** Single static method with hard-coded values

## Overview

Add a separate `subtract()` method to HelloWorld that performs subtraction on hard-coded integer values and displays the result in the format `{num1}-{num2}={result}`.

## Requirements

- **Input:** Hard-coded integers (10 and 5)
- **Output Format:** `10-5=5`
- **Integration:** Separate method, callable from main or independently
- **Existing Code:** "Hello, World!" output remains unchanged

## Architecture

### Current State
- Single `HelloWorld` class with `main()` method
- Prints "Hello, World!"

### Proposed Changes
- Add new static method `subtract()` to HelloWorld class
- Method contains hard-coded values (num1=10, num2=5)
- Performs integer subtraction
- Prints result in specified format
- Optional: call from `main()` to demonstrate functionality

### Component: subtract() Method
- **Input:** Hard-coded integers (10, 5)
- **Process:** Perform subtraction arithmetic
- **Output:** System.out.println with format `{num1}-{num2}={result}`
- **Dependencies:** None (standard Java)

## Implementation

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        subtract();  // Call the subtraction method
    }
    
    public static void subtract() {
        int num1 = 10;
        int num2 = 5;
        int result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
    }
}
```

## Testing

- Compile: `javac HelloWorld.java`
- Run: `java HelloWorld`
- Expected output:
  ```
  Hello, World!
  10-5=5
  ```

## Success Criteria

- ✓ `subtract()` method exists and is callable
- ✓ Output matches format `10-5=5`
- ✓ Program compiles without errors
- ✓ Program runs and produces expected output
- ✓ Existing "Hello, World!" output is preserved
