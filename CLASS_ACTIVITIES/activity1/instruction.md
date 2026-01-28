# Activity 1: Creating Your First Java Class

**Objective:** In this activity, you will practice creating a simple Java class and instantiating objects from it.

## Instructions

### Part 1: Creating the `Book` Class

1.  Create a new Java class named `Book`.
2.  Add the following fields (instance variables) to the `Book` class:
    *   `title` (String)
    *   `author` (String)
    *   `isbn` (String)
    *   `publicationDate` (String or `java.time.LocalDate`)
3.  Add a method to the `Book` class with the signature `public void printBookInfo()` that prints the details of the book to the console.

### Part 2: Creating and Using `Book` Objects

1.  Create another Java class named `Main`.
2.  Inside the `main` method of the `Main` class, create two instances (objects) of the `Book` class.
3.  For each `Book` object, set the values for its `title`, `author`, `isbn`, and `publicationDate` fields to represent your favorite books.
4.  Call the `printBookInfo()` method on each of your two `Book` objects to display their details.

### Part 3: Adding a Constructor

1.  Go back to your `Book.java` file.
2.  Create a parameterized constructor that accepts arguments for `title`, `author`, `isbn`, and `publicationDate` to initialize the fields.
3.  Return to your `Main.java` file.
4.  Create two *new* `Book` objects, this time using the parameterized constructor you just created.
5.  Call the `printBookInfo()` method on these two new objects as well.

## Submission

Please submit your `Book.java` and `Main.java` files.

---

### Rubric
# Activity 1: Grading Rubric

| Criteria | Points | Description |
| :--- | :--- | :--- |
| **`Book` Class** | **8** | |
| Fields | 4 | `Book` class correctly defines `title`, `author`, `isbn`, and `publicationDate` fields. |
| `printBookInfo()` Method | 4 | `printBookInfo()` method is correctly implemented and displays all book details. |
| **`Main` Class** | **6** | |
| Object Creation (Default) | 3 | Two `Book` objects are created and their fields are initialized in the `main` method. |
| Method Call | 3 | `printBookInfo()` is called on both initial `Book` objects. |
| **Constructor** | **6** | |
| Parameterized Constructor | 3 | `Book` class has a correctly implemented parameterized constructor that initializes all fields. |
| Object Creation (Constructor) | 3 | Two new `Book` objects are created using the parameterized constructor and `printBookInfo()` is called on both. |
| **Total** | **20** | |
