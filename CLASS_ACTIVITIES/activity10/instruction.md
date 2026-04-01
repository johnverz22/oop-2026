# Activity 10: Abstraction and the Object Class
**Topic:** Implementing Geometric Hierarchies

## Objective
To practice the implementation of **Abstract Classes** and methods, and to leverage the **Object Class** methods (`toString` and `equals`) to manage custom object behavior.

---

## Given Base Class
You must use the following abstract class as your foundation. Do not modify the existing abstract method signatures.

```java
public abstract class GeometricObject {
    private String color;
    private boolean filled;

    protected GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea();
    public abstract double getPerimeter();
}
```

---

## Tasks

### 1. Implement Concrete Subclasses
Create two concrete subclasses: **Circle** and **Rectangle**.
*   **Circle:** Must have a `radius` field.
*   **Rectangle:** Must have `width` and `height` fields.
*   Both classes must provide specific implementations for `getArea()` and `getPerimeter()`.

### 2. Practice with the Object Class
In both `Circle` and `Rectangle`, you must override the following methods from the `Object` class:
*   **`toString()`**: Return a String describing the object (e.g., "Circle with radius 5.0, color: red").
*   **`equals(Object o)`**: Compare two objects. Two circles are equal if they have the same radius; two rectangles are equal if they have the same width and height.

### 3. Verification Class
Create a `Main` class with a `main` method that:
1.  Creates an array list of `GeometricObject` containing at least two Circles and two Rectangles.
2.  Iterates through the array list and prints the Area and Perimeter of each using polymorphism.
3.  Demonstrates the use of your overridden `equals()` method by comparing two similar objects.

---

## Quantitative Rubric (20 Points Total)

| Criteria | Description | Points |
| :--- | :--- | :--- |
| **Abstraction Implementation** | Correct use of `extends` and implementation of all abstract methods (`getArea`, `getPerimeter`). | 6 pts |
| **Object Class Overriding** | Correct implementation of `toString()` and logic-based `equals()` in both subclasses. | 6 pts |
| **Polymorphism & Logic** | Successful use of an array of the abstract type and correct mathematical calculations. | 4 pts |
| **Code Structure & Style** | Proper use of constructors (`super`), encapsulation (private fields), and naming conventions. | 4 pts |

**Total: 20 Points**
