# Activity 11: The Persistent Employee Payroll System
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
>     .of(Employee.class, "type", true) // "type" is the field name in JSON -> UPDATED: Added true to fix error on parsing the JSON which makes this value null
>     .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
>     .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());
>
> Gson gson = new GsonBuilder().registerTypeAdapterFactory(adapter).create();
> ```

> To make the RuntimeTypeAdapterFactory work, add this maven dependency:
>```xml
><dependency>
>    <groupId>org.danilopianini</groupId>
>    <artifactId>gson-extras</artifactId>
>    <version>3.3.0</version>
></dependency>
>```

### Task 4: Interactive Menu: `PayrollSystem` (Main Class)
Create a `PayrollSystem` class with a `main` method that displays a menu. Note: The system should automatically **Load Records** from `employees.json` as soon as the program starts.
1.  **Add Employee:** (Ask for type using the Enum, then collect details).
2.  **View All Employees:** (Display records and earnings using polymorphism).
3.  **Save Records:** (Write the current list to `employees.json`).
4.  **Exit:** (Quit).

---

## Grading Rubric (40 Points Total)

| Criteria | Points | Description |
| :--- | :--- | :--- |
| **Abstraction Logic** | **8** | Correct use of `abstract` keyword; no instantiation of `Employee`. |
| **Enum Implementation** | **5** | Correct use of `EmployeeType` enum to restrict and identify types. |
| **Inheritance & Super** | **5** | Proper use of `extends` and calling `super()` in constructors. |
| **Polymorphism** | **7** | Correct implementation and use of `calculateEarnings()` in the menu loop. |
| **Data Persistence** | **10** | Successful implementation of JSON Save/Load with Polymorphic Adapter. |
| **Interactive Menu** | **5** | Functional menu loop with proper input handling and logic. |
| **Total** | **40** | |
