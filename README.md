# Design Patterns

A repository for learning and implementing different design patterns in Java. Each pattern is implemented with a practical code example.

## Table of Contents

- [How to Run the Code](#how-to-run-the-code)
- [Strategy Pattern](#strategy-pattern)

---

## How to Run the Code

### Prerequisites

- **Java 21** or later
- **IntelliJ IDEA** (recommended) — the project is set up as an IntelliJ module with no external build tools

### Running

1. Open the project in IntelliJ IDEA.
2. Navigate to the main class of the pattern you want to run (e.g., `src/strategypattern/main/StrategyPatternMain.java`).
3. Run the `main` method.

Alternatively, compile and run from the terminal:

```bash
javac -d out src/strategypattern/**/*.java
java -cp out strategypattern.main.StrategyPatternMain
```

---

## Strategy Pattern

Use the Strategy pattern when you have multiple algorithms or behaviors that a class could use, and you want to choose or swap them at runtime without modifying the class itself. It's a good fit when you see conditional logic (e.g., `if`/`else` or `switch`) selecting between different variants of the same behavior — each variant can be extracted into its own strategy class behind a common interface.

### Our Example

Demonstrates the Strategy pattern using a vehicle driving example. A `DrivingStrategy` interface defines interchangeable driving behaviors (`NormalSpeedStrategy`, `SportsSpeedStrategy`), which are injected into `Vehicle` subclasses (`NormalVehicle`, `SportsVehicle`, `OffRoadVehicle`) via constructor. This allows the same vehicle type to use different driving strategies without changing its code.
