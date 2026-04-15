# Activity 13: Generic Class Mastery
**Topic:** Creating and Using Generic Classes in Java

## Objective
To understand how to design and implement **Generic Classes** to create reusable, type-safe components. You will build a "Universal Toolkit" that can handle any object type—from simple Strings to complex business models.

---

## 1. Introduction: The Power of Generics
Until now, you have used built-in generics like `ArrayList<String>`. In this activity, you will learn how to **define your own** generic classes. This allows you to write logic once and apply it to many different data types without duplicating code or using unsafe type-casting.

---

## 2. Scenario
You are developing a "Data Management Toolkit." You need two core components:
1.  **A Result Wrapper:** To standardise how your program returns data and status messages.
2.  **A Generic Repository:** To manage a collection of items (like Students, Bank Accounts, or even simple Integers).

---

## 3. Tasks

### Task 1: The "Success/Failure" Wrapper (`Result<T>`)
Create a generic class named `Result<T>`.
*   **Attributes:**
    *   `private T data`: The actual object being returned.
    *   `private String message`: A status message (e.g., "Success" or "Not Found").
    *   `private boolean isSuccess`: A flag indicating if the operation worked.
*   **Constructor:** Initialize all three fields.
*   **Methods:**
    *   Standard Getters for all fields.
    *   A method `public void display()` that prints the status and the data's `toString()`.

### Task 2: The Generic Storage (`Repository<T>`)
Create a generic class named `Repository<T>`.
*   **Attributes:**
    *   `private List<T> items`: Use an `ArrayList` to store the items.
*   **Constructor:** Initialize the list.
*   **Methods:**
    *   `public void add(T item)`: Adds an item to the list.
    *   `public T get(int index)`: Returns the item at the specific index.
    *   `public List<T> getAll()`: Returns the entire list.
    *   `public int size()`: Returns the number of items.

### Task 3: The Mini-Program (`Main.java`)
In your `main` method, perform the following simulations:

**A. String Repository (Simple Type)**
1.  Create a `Repository<String>` for "Guest Names."
2.  Add three names: "Alice", "Bob", and "Charlie".
3.  Print the total count of guests.

**B. The "Refactor" Challenge (Complex Type)**
1.  Use a class from a previous activity (e.g., `Employee` from Activity 11 or `BankAccount` from Week 4).
2.  Create a `Repository<YourClass>` (e.g., `Repository<BankAccount>`).
3.  Add at least two instances of your class to the repository.
4.  Retrieve one instance by index and wrap it in a `Result<T>` object with a "Load Successful" message.
5.  Call `result.display()` to show the final output.

---

## 📝 Grading Rubric

| Criteria | 5 Points (Exemplary) | 3-4 Points (Developing) | 0-2 Points (Beginning) | Score |
| :--- | :--- | :--- | :--- | :--- |
| **Generic Class Definition** | Correct use of `<T>` placeholder in both `Result` and `Repository`. No raw types used. | `<T>` is used but missing in some parts of the class (e.g., return types). | Classes are not generic or use `Object` instead of `<T>`. | /5 |
| **Repository Logic** | Implementation of `add`, `get`, and `size` is correct and type-safe. | Repository works but uses hardcoded types or has logic errors. | Repository is missing or does not use a List correctly. | /5 |
| **Result Wrapper Usage** | `Result<T>` is correctly instantiated with a complex object and used for the final output. | `Result<T>` is created but not used according to the scenario. | `Result<T>` is missing or incorrectly implemented. | /5 |
| **Main Simulation** | Both String and Complex Type repositories are tested and produce correct output. | Only one type of repository is tested, or output is messy. | The `Main` class does not compile or test the requirements. | /5 |
| **Total** | | | | **/20** |