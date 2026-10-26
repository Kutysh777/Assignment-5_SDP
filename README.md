# Assignment 5 Strategy Pattern

## About My Project

I used the Strategy pattern for a football coach. The coach can change the team's tactic during the program. My example uses ten outfield players. Each tactic calculates how many players focus on attack. The other players focus on defense. This is a simple model for showing the design pattern, not a real football formation.

## Project Structure

```text
SDP_Assignment5_Strategy_Football
|-- README.md
|-- .gitignore
|-- src
    |-- FootballTactic.java
    |-- AttackingTactic.java
    |-- DefensiveTactic.java
    |-- BalancedTactic.java
    |-- Coach.java
    |-- Main.java
```

## Strategy Components

| Role | Class | What It Does |
| --- | --- | --- |
| Strategy | FootballTactic | Declares the common calculation method. |
| Concrete Strategy | AttackingTactic | Assigns 70% of outfield players to attack. |
| Concrete Strategy | DefensiveTactic | Assigns 30% of outfield players to attack. |
| Concrete Strategy | BalancedTactic | Assigns half of outfield players to attack. |
| Context | Coach | Stores a tactic and uses it to show a plan. |
| Client | Main | Chooses a tactic and changes it during the program. |

## How It Works

Main creates a Coach with BalancedTactic. Then it calls setTactic() to choose AttackingTactic and DefensiveTactic at runtime. Coach calls the same attackingPlayers() method each time. It does not check the tactic type with if or switch. For ten outfield players, the tactics return five, seven, and three attacking players. Coach calculates the remaining defensive players.

## Clean Code Principles

1. **Meaningful Names:** Names such as AttackingTactic and attackingPlayers() explain what the code does.
2. **Single Responsibility:** Each tactic has one calculation. Coach stores and uses the selected tactic.
3. **Polymorphism:** Coach calls FootballTactic. It does not use if or switch to select an algorithm.
4. **Open/Closed Principle:** I can add a new tactic class without changing Coach or the existing tactics.
5. **Small Methods:** Each method has one short and clear job.

## How to Run

Use JDK 8 or later. In the project folder, run:

```text
javac -d out src/*.java
java -cp out Main
```

In IntelliJ IDEA, open the project folder and run Main.java.

## Expected Output

```text
Attack: 5, Defense: 5
Attack: 7, Defense: 3
Attack: 3, Defense: 7
```

## Short Explanation for Defense

Strategy lets me change an algorithm at runtime. FootballTactic is the common interface. My three tactics calculate different numbers of attacking players. Coach is the context and uses the selected tactic. Main changes the tactic with setTactic().
