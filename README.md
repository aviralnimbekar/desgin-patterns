# Design Patterns

A repository for learning and implementing different design patterns in Java. Each pattern is implemented with a practical code example.

## Table of Contents

- [How to Run the Code](#how-to-run-the-code)
- [Strategy Pattern](#strategy-pattern)
- [State Pattern](#state-pattern)

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

---

## State Pattern

Use the State pattern when an object's behavior changes based on its internal state, and you want to avoid large conditional statements that check the state. It's a good fit when you have an object that can be in multiple states, and each state has different behavior for the same operations — each state can be extracted into its own class implementing a common interface, and the object delegates behavior to its current state object.

### Our Example

Demonstrates the State pattern using a gumball vending machine. A `State` interface defines state-specific behaviors (`insertQuarter()`, `ejectQuarter()`, `turnCrank()`, `dispense()`, `refill()`), which are implemented by concrete state classes (`NoQuarterState`, `HasQuarterState`, `SoldState`, `SoldOutState`, `WinningState`). The `GumballMachineV2` context class holds a reference to the current state and delegates all actions to it. As actions occur, states transition the machine to other states, eliminating complex conditionals and making it easy to add new states.
