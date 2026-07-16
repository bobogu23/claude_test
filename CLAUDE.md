# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Environment

- **Java Version**: JDK 21
- **JDK Path**: `/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk`
- **macOS Development**: Using native JDK for macOS

## Build and Run Commands

### Compile
```bash
/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac <filename>.java
```

### Run
```bash
/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java <ClassName>
```

### Compile and Run (example)
```bash
/Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/javac HelloWorld.java && /Users/gushunbin/Downloads/software/jdk-21.0.11.jdk/Contents/Home/bin/java HelloWorld
```

## Project Structure

This is a simple Java project for learning and testing. Currently contains:
- `HelloWorld.java` - Basic Java application entry point

For future development, organize additional classes in a `src/` directory and compiled `.class` files in a `bin/` or `target/` directory.
