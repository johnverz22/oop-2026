Based on the image provided, here is the transcribed text followed by a structured grading rubric designed for a total of 20 points.

## Task
Define the **MyRectangle2D** class that contains:

* Two **double** data fields named **x** and **y** that specify the center of the rectangle with getter and setter methods. (Assume the rectangle sides are parallel to x- or y-axis.)
* The data fields **width** and **height** with getter and setter methods.
* A no-arg constructor that creates a default rectangle with **(0, 0)** for **(x, y)** and **1** for both **width** and **height**.
* A constructor that creates a rectangle with the specified **x, y, width,** and **height**.
* A method **getArea()** that returns the area of the rectangle.
* A method **getPerimeter()** that returns the perimeter of the rectangle.
* A method **contains(double x, double y)** that returns **true** if the specified point (x, y) is inside this rectangle (see Figure 10.24a).
* A method **contains(MyRectangle2D r)** that returns **true** if the specified rectangle is inside this rectangle (see Figure 10.24b).
* A method **overlaps(MyRectangle2D r)** that returns **true** if the specified rectangle overlaps with this rectangle (see Figure 10.24c).

---

## Grading Rubric (20 Points Total)

This rubric evaluates both the structural implementation and the mathematical logic required for the geometric methods.

| Criteria | Description | Points |
| :--- | :--- | :--- |
| **Data Fields & Encapsulation** | Correct implementation of private `x`, `y`, `width`, and `height` as doubles. Includes all 8 required getters and setters. | **2 pts** |
| **Constructors** | Correct no-arg constructor (0,0,1,1) and the parameterized constructor correctly assigning all four fields. | **2 pts** |
| **Basic Calculations** | `getArea()` correctly returns $width \times height$. `getPerimeter()` correctly returns $2 \times (width + height)$. | **2 pts** |
| **Point Containment** | `contains(double x, double y)` logic correctly checks if the point is within the bounds relative to the center: $[x_{center} \pm (width/2)]$ and $[y_{center} \pm (height/2)]$. | **3 pts** |
| **Rectangle Containment** | `contains(MyRectangle2D r)` logic correctly verifies that all four corners (or the extreme bounds) of the input rectangle `r` are inside the current rectangle. | **5 pts** |
| **Rectangle Overlap** | `overlaps(MyRectangle2D r)` logic correctly determines if the rectangles intersect. (Typically by checking if they are *not* completely separate). | **5 pts** |
| **Code Quality** | Proper naming conventions (camelCase), indentation, and use of `this` keyword where appropriate. | **1 pt** |
| **Total** | | **20 pts** |