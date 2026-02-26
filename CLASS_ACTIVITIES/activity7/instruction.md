
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

| Criteria | 5 Points (Excellent) | 3-4 Points (Good) | 1-2 Points (Developing) |
| --- | --- | --- | --- |
| **Inheritance Logic** | Correct use of `extends` and `super()` constructor. | Used `extends` but missed `super()` or used incorrect access modifiers. | Classes are not linked or inheritance is misused. |
| **Method Overriding** | Successfully overrode `displayStatus()` and used `super.displayStatus()`. | Overrode the method but completely replaced parent logic instead of extending it. | Did not override methods. |
| **Encapsulation & Logic** | Conditional logic (checking `isOn`) works perfectly. | Logic works but allows for edge-case errors (e.g., negative brightness). | Logic is missing or contains syntax errors. |
| **Execution (Main)** | All tasks in the Main class are executed and output is formatted. | Most tasks completed; minor output formatting issues. | Code does not compile or major tasks are missing. |
