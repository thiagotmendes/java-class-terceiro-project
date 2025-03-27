# Credit Card Shopping Application

This project was created as part of a Java learning challenge, aimed at managing purchases made using a credit card. The user provides an initial credit limit, adds several purchases (products), and at the end, the system displays the purchases sorted by value and the remaining credit balance.

---

## Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Project Structure](#project-structure)
4. [How to Run](#how-to-run)
5. [Usage Walkthrough](#usage-walkthrough)
6. [Simplified Example](#simplified-example)
7. [Possible Improvements](#possible-improvements)
8. [Technologies Used](#technologies-used)
9. [Contributing](#contributing)

---

## Overview

The application allows the user to:

- Set a credit card limit (balance).
- Add purchases (product name and value).
- Sort purchases by value (ascending order).
- Display the remaining balance at the end.

The program also notifies the user when a purchase exceeds the available balance.

---

## Features

### 1. Set Credit Limit
The user inputs a value (e.g., `1000`) as the available credit.

### 2. Add Products (Purchases)
- Input the product name.
- Input the product value.
- The system checks if the remaining balance is sufficient before confirming the purchase.

### 3. Display Purchases and Balance
- Shows all successful purchases.
- Lists purchases in ascending order based on value.
- Displays the remaining credit balance.

### 4. Exit Application
Ends the program execution.

---

## Project Structure

### `Product`
Represents a purchase with:
```java
private String productName;
private double productValue;
```
Includes getters, setters, and a `toString()` method.

### `Credcard`
Represents the credit card:
```java
private double totalCredCardValue;
```
Contains methods for setting and getting the card balance.

### `Menu`
Handles the user interface:
- Displays menu options.
- Accepts user input using `Scanner`.
- Adds `Product` objects to a `List<Product>`.
- Checks balance before approving a purchase.
- Displays purchases and remaining balance.

### `Main`
Application entry point. It calls the `printMenu()` method from the `Menu` class.

---

## How to Run

1. Clone or download this repository.
2. Open the project in your preferred Java IDE (IntelliJ, Eclipse, VS Code, etc.).
3. Compile and run the `Main` class.
4. Interact with the terminal to use the menu.

---

## Usage Walkthrough

Upon launching the program, you'll see:

```
Operations
1 - Enter credit limit
2 - Add product
3 - Transfer value (view total)
4 - Exit
```

### Option 1 – Set credit limit
User inputs the initial credit available.

### Option 2 – Add product
- Enter product name (e.g., "Shoes").
- Enter product value (e.g., `150`).
- If sufficient balance is available, the product is added, and its value is deducted.
- If not, the program displays "Insufficient balance!".

### Option 3 – View total purchase value
Optional logic to see the sum of purchases.

### Option 4 – Exit the program
Ends the application.

---

## Simplified Example

### Example 1:

- **Enter credit limit:** `1000`
- **Add Product:**
    - Name: "Shoes"
    - Value: `150`
- Remaining balance: `850`

- **Add Product:**
    - Name: "Shirt"
    - Value: `50`
- Remaining balance: `800`

- **Exit (Option 4)**

**Output:**
```
PURCHASES MADE:
Shirt - 50.0
Shoes - 150.0

Remaining card balance: 800.0
```

### Example 2:

- **Enter credit limit:** `500`
- **Add Product:**
    - Name: "Wardrobe"
    - Value: `600`

**Output:**
```
Insufficient balance!
```

---

## Possible Improvements

- Implement sorting of purchases using `Comparator<Product>` or `Comparable<Product>`.
- Add input validation (e.g., prevent negative values or empty product names).
- Add exception handling for non-numeric inputs.
- Add features to remove or edit purchases.

---

## Technologies Used

- Java 8+
- Java Collections (List, ArrayList)
- Scanner for console input
- Object-Oriented Programming (OOP)
- Control structures (while, switch-case)

---

## Contributing

This project was developed for study purposes. If you'd like to contribute:

1. Fork the repository.
2. Create a feature branch:  
   `git checkout -b feature/my-feature`
3. Commit your changes:  
   `git commit -m "Add my feature"`
4. Push to your fork:  
   `git push origin feature/my-feature`
5. Open a pull request for review.

---

**Author:** *Your Name Here*  
**License:** MIT or other license of your choice

