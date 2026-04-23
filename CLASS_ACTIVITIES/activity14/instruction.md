# Activity 14: Advanced Tournament Management System

## Objective
Apply knowledge of **Interfaces** (Multiple implementation, Default/Static methods), **Generics**, and standard Java interfaces (**Comparable** and **Cloneable**) to build a flexible tournament tracking system.

## Scenario
You are developing a system to manage sports tournaments. The system must be able to handle different types of competitors (e.g., individual Athletes or Teams) and provide tools for ranking and duplicating profiles.

## Tasks

### 1. The Generic Wrapper: `Tournament<T>`
Create a generic class `Tournament<T>` that can hold a list of participants.
*   It should have a field `ArrayList<T> participants`.
*   Include a method `addParticipant(T participant)`.
*   Include a method `showAll()` that prints the details of every participant.

### 2. The Contract: `Competitor` Interface
Create an interface named `Competitor`.
*   **Abstract Method:** `void playMatch()`.
*   **Default Method:** `reportStatus()` - prints a generic message: "[Status] Competitor is ready for the next round."
*   **Static Method:** `isValidScore(int score)` - returns `true` if the score is between 0 and 100.

### 3. The Concrete Class: `Athlete`
Create a class `Athlete` that implements `Competitor`, `Comparable<Athlete>`, and `Cloneable`.
*   **Fields:** `String name`, `int score`, and `ArrayList<String> trophies` (a list of Strings representing trophy names).
*   **Requirements:**
    *   **Multiple Implementation:** Must implement all required methods from the interfaces.
    *   **Comparable:** Implement `compareTo` to sort athletes by **score (descending)**. If scores are tied, sort by **name (alphabetical)**.
    *   **Cloneable (Deep Copy):** Override `clone()` to perform a **Deep Copy**. Ensure that if you add a trophy to the clone, it does NOT appear in the original athlete's list.

### 4. The Driver: `TournamentDemo`
Create a `main` method to demonstrate your system:
1.  Create a `Tournament<Athlete>` object.
2.  Add at least 3 athletes with different scores.
3.  Sort the athletes using `Collections.sort()` or `Arrays.sort()`.
4.  Demonstrate the **Deep Copy** by cloning one athlete, adding a trophy to the clone, and showing that the original athlete remains unchanged.
5.  Test the `static` and `default` methods from the `Competitor` interface.

## Submission
*   Push all `.java` files to your repository
*   Ensure your code follows Java naming conventions.

---
# Rubric: Activity 14 (Tournament Management System)

| Criteria | Description | Points |
| :--- | :--- | :--- |
| **Interfaces (Fundamental)** | Correct definition and implementation of the `Competitor` interface with the required abstract method. | 4 |
| **Advanced Interface Features** | Correct use of a `default` method for status reporting and a `static` method for score validation. | 3 |
| **Generics Implementation** | Correct implementation of the generic `Tournament<T>` class using a type parameter for participants. | 3 |
| **Comparable Logic** | Proper implementation of `compareTo` with multi-field logic (Score descending, Name ascending). | 3 |
| **Deep Copy (Cloneable)** | Successful implementation of `Cloneable` where mutable fields (trophies list) are independently copied. | 4 |
| **Demo & Functionality** | Driver class successfully demonstrates sorting, cloning independence, and generic usage without errors. | 3 |
| **Total** | | **20** |
