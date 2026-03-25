# Activity 10: The Persistent Employee Payroll System
**Topic:** Abstract Classes, Polymorphism, Enums, and Data Persistence (JSON)

## Objective
To practice designing and implementing **Abstract Classes**, enforcing "contracts" through **Abstract Methods**, and managing a persistent collection of objects using **JSON Serialization** with type-safe **Enums**.

---

## 1. Introduction: Using Enums in Java
An **Enum** (short for Enumeration) is a special Java type used to define a collection of constants. Instead of using Strings (which are prone to typos like "Hourly" vs "hourly"), Enums provide **compile-time safety**.

**Sample Enum Definition:**
```java
public enum EmployeeType {
    SALARIED, 
    HOURLY
}
```

**Why use it?**
*   **Type Safety:** You can't accidentally assign "Contractor" if it's not in the Enum.
*   **Clean Code:** It makes your intentions clear (e.g., `if (emp.type == EmployeeType.SALARIED)`).

---

## 2. Scenario
A small company needs a system to manage its employees' payroll and maintain their records across sessions. You are tasked with creating a menu-driven application that treats all employees under a common "Employee" type, calculates their unique earnings, and saves the data to a `employees.json` file.

---

## 3. Tasks

### Task 1: Create the Abstract Base Class: `Employee`
Create an abstract class named `Employee`.
*   **Attributes:**
    *   `private String name`
    *   `private String employeeId`
    *   `protected EmployeeType type` (Using the enum to restrict values)
*   **Constructor:** A constructor that initializes these three fields.
*   **Methods:**
    *   **Abstract Method:** `public abstract double calculateEarnings();`
    *   **Concrete Method:** Override `toString()` to return a string with the name, ID, and type.
    *   **Concrete Method:** Override `equals(Object o)` to compare two employees based on their `employeeId`.

### Task 2: Implement Concrete Subclasses

**A. Class `SalariedEmployee`**
*   **Additional Attributes:** `private double baseSalary`, `private double bonus`
*   **Implementation:**
    *   Pass `EmployeeType.SALARIED` to the super constructor.
    *   Override `calculateEarnings()`: Return `baseSalary + bonus`.

**B. Class `HourlyEmployee`**
*   **Additional Attributes:** `private int hoursWorked`, `private double hourlyRate`
*   **Implementation:**
    *   Pass `EmployeeType.HOURLY` to the super constructor.
    *   Override `calculateEarnings()`: Return `hoursWorked * hourlyRate`.

### Task 3: Data Persistence (JSON)
Implement a `FileHandler` to manage the saving and loading of the `ArrayList<Employee>`.

> **💡 Implementation Note: Polymorphic JSON Parsing**
> Since `Employee` is abstract, standard Gson cannot "guess" which subclass to instantiate. You should use **`RuntimeTypeAdapterFactory`** to tell Gson how to map the `type` field to the correct class.
>
> **Sample Snippet for FileHandler:**
> ```java
> RuntimeTypeAdapterFactory<Employee> adapter = RuntimeTypeAdapterFactory
>     .of(Employee.class, "type") // "type" is the field name in JSON
>     .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
>     .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());
>
> Gson gson = new GsonBuilder().registerTypeAdapterFactory(adapter).create();
> ```

### Task 4: Interactive Menu: `PayrollSystem`
Create a `PayrollSystem` class with a `main` method that displays a menu:
1.  **Add Employee:** (Ask for type using the Enum, then collect details).
2.  **View All Employees:** (Display records and earnings using polymorphism).
3.  **Save Records:** (Write the current list to `employees.json`).
4.  **Load Records:** (Read from `employees.json`).
5.  **Exit:** (Quit).

---

## Quantitative Rubric (40 Points Total)

| Criteria | Description | Points |
| :--- | :--- | :--- |
| **Abstraction Logic** | Correct use of `abstract` keyword; no instantiation of `Employee`. | 8 pts |
| **Enum Implementation**| Correct use of `EmployeeType` enum to restrict and identify types. | 5 pts |
| **Inheritance & Super** | Proper use of `extends` and calling `super()` in constructors. | 5 pts |
| **Polymorphism** | Correct implementation and use of `calculateEarnings()` in the menu loop. | 7 pts |
| **Data Persistence** | Successful implementation of JSON Save/Load with Polymorphic Adapter. | 10 pts |
| **Interactive Menu** | Functional menu loop with proper input handling and logic. | 5 pts |

**Total: 40 Points**
