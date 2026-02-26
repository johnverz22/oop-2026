
## Activity 7: The Smart Home Hierarchy

**Total Points:** 20 

### The Scenario

You have been hired by a tech startup to build the backend logic for a Smart Home controller. You need to create a system that manages different types of smart devices (Lights and Thermostats) using a common base class to minimize code redundancy.

### Task 1: Create the Base Class (5 Points)

Create a class named `SmartDevice`.

* **Attributes:** `String deviceName` and `boolean isOn`.
* **Constructor:** Initialize the `deviceName` and set `isOn` to `false` by default.
* **Methods:** * `togglePower()`: Switches the device from on to off, or off to on.
* `displayStatus()`: Prints the device name and its current power state.



### Task 2: Implement Inheritance (10 Points)

Create two subclasses that extend `SmartDevice`.

1. **Class `SmartLight`:**
* **Additional Attribute:** `int brightness` (0 to 100).
* **Override `displayStatus()`:** Call the parent method and also print the brightness level.
* **Unique Method:** `setBrightness(int level)`: Only sets the brightness if the device is `isOn`.


2. **Class `SmartThermostat`:**
* **Additional Attribute:** `double temperature`.
* **Override `displayStatus()`:** Call the parent method and print the current temperature.
* **Unique Method:** `setTemperature(double temp)`: Prints a warning if the temperature is set above 30°C.



### Task 3: The "Main" Challenge (5 Points)

In your `Main` class, perform the following sequence:

1. Instantiate one `SmartLight` named "Living Room Light".
2. Try to set its brightness to 80 before turning it on (it should not change).
3. Turn the light on, set the brightness, and call `displayStatus()`.
4. Instantiate a `SmartThermostat`, turn it on, set it to 32°C, and display its status.

---

## Grading Rubric (20 Points Total)

**Total Points: 20** (5 Points per Category)

| Criteria | 5 (Excellent) | 4 (Very Good) | 3 (Good/Developing) | 2 (Emerging) | 1 (Beginning) |
| --- | --- | --- | --- | --- | --- |
| **Inheritance & Constructors** | Uses `extends`. Subclass constructor correctly calls `super(brand)`. | Uses `extends`. Calls `super()` but omits the brand parameter. | Uses `extends` but manually assigns parent fields (e.g., `this.brand = brand`). | Classes are created but the `extends` keyword is missing. | Code does not compile or classes are not linked. |
| **Method Overriding** | `displayStatus()` is overridden and includes a call to `super.displayStatus()`. | Method is overridden but logic is duplicated (no `super` call). | Method is overridden but with the wrong signature (e.g., `display()`). | Subclass has unique methods but does not override parent methods. | No attempt to override or modify parent behavior. |
| **Encapsulation & Logic** | Fields are `private/protected`. Methods check `if(isOn)` before execution. | Logic is correct, but fields are `public` (violates encapsulation). | Logic works but allows invalid states (e.g., battery < 0 or brightness > 100). | Methods are defined but do not change object state (e.g., battery remains 100). | Logical methods are empty or contain syntax errors. |
| **Polymorphism & Main** | Uses a `SmartDevice` array/list to store and loop through different subclasses. | Objects are stored in a list, but loop logic or output formatting is broken. | Subclasses are tested individually; no parent-type array/list is used. | Only one subclass is instantiated and tested. | `Main` class is missing or code fails to execute. |