# Activity 2: University Roster System

**Objective:** This activity will challenge you to apply your understanding of `static` and `instance` members by building a simple system to manage students and courses. You will see how `static` members can be used to hold data shared across all instances of a class, while `instance` members hold data unique to each object.

## Instructions

### Part 1: The `Student` Class

1.  Create a Java class named `Student`.
2.  **Instance Fields:** Add the following fields. These are unique to each student.
    *   `studentId` (int)
    *   `firstName` (String)
    *   `middleName` (String)
    *   `lastName` (String)
    *   `gender` (String)
    *   `email` (String)
3.  **Static Field:** Add a field to track the total number of students created.
    *   `totalStudents` (int, static) - Initialize it to `0`.
4.  **Constructor:**
    *   Create a constructor that accepts parameters for `studentId`, `firstName`, `middleName`, `lastName`, `gender`, and `email`.
    *   Inside the constructor, initialize the instance fields.
    *   Crucially, **increment the `totalStudents` static field by 1** every time a new `Student` object is created.
5.  **Instance Method:**
    *   Create a method `public void displayStudentInfo()` that prints all the details for a specific student.
6.  **Static Method:**
    *   Create a method `public static int getTotalStudents()` that returns the current value of the `totalStudents` field.

### Part 2: The `Course` Class

1.  Create a Java class named `Course`.
2.  **Instance Fields:**
    *   `courseCode` (String)
    *   `courseTitle` (String)
    *   `enrolledStudents` (`Student[]`)
    *   `enrollmentCount` (int) - Initialize to 0. This will track the number of students added to the array.
3.  **Static Field:**
    *   `schoolName` (String, static) - Initialize it with the value `"My University"`.
4.  **Constructor:**
    *   Create a constructor that accepts `courseCode` and `courseTitle`.
    *   Inside the constructor, initialize the `enrolledStudents` array with a size of 50 (e.g., `this.enrolledStudents = new Student[50];`).
5.  **Instance Methods:**
    *   `public void enrollStudent(Student student)`: This method should add the provided `Student` object to the `enrolledStudents` array at the next available index and increment the `enrollmentCount`.
    *   `public void displayCourseInfo()`: This method should print the `schoolName`, `courseCode`, `courseTitle`, and then loop through the `enrolledStudents` array up to the `enrollmentCount` to print the name of each enrolled student.
6.  **Static Method:**
    *   `public static String getSchoolName()`: A simple method that returns the `schoolName`.

### Part 3: The `Main` Class

1.  Create a `Main` class with a `main` method to run your simulation.
2.  **Demonstrate `Student` class:**
    *   Print the initial number of students by calling `Student.getTotalStudents()`. It should be 0.
    *   Create at least three different `Student` objects with unique information.
    *   After creating the objects, call `Student.getTotalStudents()` again to show that the count has increased.
    *   Call `displayStudentInfo()` on one of your `Student` objects.
3.  **Demonstrate `Course` class:**
    *   Print the school name by calling `Course.getSchoolName()` without creating a `Course` object.
    *   Create a `Course` object (e.g., "CS101", "Introduction to Programming").
    *   Enroll two of your `Student` objects into the course using the `enrollStudent()` method.
    *   Call the `displayCourseInfo()` method on your `Course` object to show its details and the list of enrolled students.

## Submission

Please submit your `Student.java`, `Course.java`, and `Main.java` files.


---
## Rubric
# Activity 2: Grading Rubric

| Criteria | Points | Description |
| :--- | :--- | :--- |
| **`Student` Class** | **8** | |
| Instance & Static Fields | 2 | Correctly declares `studentId`, `firstName`, `middleName`, `lastName`, `gender`, `email` as instance fields and `totalStudents` as a static field. |
| Constructor | 3 | Constructor correctly initializes new instance fields and increments the `totalStudents` static counter. |
| `displayStudentInfo()` Method | 1 | Instance method correctly implemented to display details of a single student. |
| `getTotalStudents()` Method | 2 | Static method correctly implemented and returns the `totalStudents` count. |
| **`Course` Class** | **7** | |
| Instance & Static Fields | 2 | Correctly declares instance fields (`enrolledStudents` as `Student[]`, `enrollmentCount`) and `schoolName` as a static field. |
| Constructor & `enrollStudent()` | 3 | Constructor initializes array to size 50. `enrollStudent` method properly adds a `Student` to the array and updates the enrollment count. |
| `displayCourseInfo()` Method | 2 | Method correctly displays course info and loops through the array up to the enrollment count. |
| **`Main` Class** | **5** | |
| `Student` Demonstration | 2 | Correctly creates `Student` objects and demonstrates the functionality of `getTotalStudents()` before and after object creation. |
| `Course` Demonstration | 3 | Correctly demonstrates static access to `schoolName`, creates a `Course` object, enrolls students, and displays the final course info. |
| **Total** | **20** | |
