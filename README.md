# 🎮 Number Guessing Game in Java

Welcome to the **Number Guessing Game**, a simple Java console-based game where the player tries to guess a randomly generated number between 1 and 100.

---

## 📌 Features

- Random number is generated between 1 and 100
- Player has **unlimited attempts** to guess the correct number
- Hints provided whether the guess is too high or too low
- Score is awarded based on how quickly the player guesses:
  - 🟢 **Score 100**: Correct in ≤ 3 attempts
  - 🟡 **Score 90**: 4–5 attempts
  - 🟠 **Score 80**: 6–9 attempts
  - 🔴 **Score 70**: ≥ 10 attempts

---

## 🧾 How It Works

1. The game starts with a welcome message.
2. The player is asked to guess a number between 1 and 100.
3. After each guess, a hint is given (too high or too low).
4. When the correct number is guessed:
   - The game ends.
   - A score is displayed based on the number of attempts.

---

## 🛠️ How to Run the Program

### Prerequisites:
- Java JDK installed on your machine
- A code editor like **VS Code**, **IntelliJ**, or simply **Command Line**

### Steps:
1. Save the code in a file named `NumberGuessingGame.java`
2. Open a terminal in the file’s directory.
3. Compile the code:
   ```bash
   javac NumberGuessingGame.java
