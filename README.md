# Java Low-Level Design (LLD) Projects

This repository contains clean and modular Low-Level Design (LLD) implementations of popular system design questions in Java (without using Spring). These examples are built to demonstrate core design principles like SOLID, OOP, and design patterns.

---

## 📌 Projects Included

### 1. 💳 Credit Card Recommendation Engine
- **Objective**: Recommend the best credit card based on user profile and spending habits.
- **Features**:
  - Rules based on salary, age, CIBIL score, category preference
  - Easily extendable engine for more rules and card types
- **Design Patterns**: Strategy, Factory

### 2. 🏦 Loan System
- **Objective**: Manage loan requests, approvals, and payments.
- **Features**:
  - Create Loan
  - Calculate EMI
  - Track repayment schedule
  - Loan approval logic
- **Design Principles**: Encapsulation, Modular responsibilities

### 3. 🐍 Snake and Ladder Game
- **Objective**: Build a turn-based game for 2+ players.
- **Features**:
  - Board with configurable snakes and ladders
  - Dice rolls and player movements
  - Win condition and dynamic player turns
- **Focus**: OOP and game state handling

### 4. 💸 UPI Payment Gateway
- **Objective**: Build a UPI-style payment gateway simulation.
- **Features**:
  - Support for UPI, Wallet, and Credit Card payments
  - Track payment status (`INITIATED`, `SUCCESS`, `FAILED`)
  - In-memory store of payment history
- **Design Patterns**: Interface-based abstraction for payment methods

---

## 🔧 Technologies Used
- Java 17+
- No external libraries
- Command-line applications
- Object-Oriented Design

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/java-lld-projects.git](https://github.com/Guru-21/LLD_Questions)
   cd Prep
