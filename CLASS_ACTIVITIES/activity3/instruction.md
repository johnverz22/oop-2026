# Activity: The Secret Agent Mission Assignment System

**Objective:** To apply the principles of **encapsulation** and **data hiding** while utilizing the `Random` and `java.time` APIs to create a practical, object-oriented application.

In this activity, you will build a system that creates a `SecretAgent` and assigns them a randomly generated `Mission` with a deadline.

---

### **Part 1: The `SecretAgent` Class (Encapsulation Focus)**

Your first task is to create a `SecretAgent` class that securely encapsulates all agent data. The state of this object must be protected from invalid external modification.

#### **Fields (all `private`):**
*   `agentId`: `String` (e.g., "007"). This should be set once and never change.
*   `codename`: `String`.
*   `clearanceLevel`: `int`.
*   `onMission`: `boolean`.
*   `lastMissionCompletionTime`: `LocalDateTime`.

#### **Constructor:**
*   A `public` constructor that accepts an `agentId`, `codename`, and `clearanceLevel`.
*   Inside the constructor, initialize `onMission` to `false` and `lastMissionCompletionTime` to `null`.

#### **Methods (`public`):**
*   **Getters:**
    *   `getAgentId()`: Returns `String`.
    *   `getCodename()`: Returns `String`.
    *   `getClearanceLevel()`: Returns `int`.
    *   `isOnMission()`: Returns `boolean`.
    *   `getLastMissionCompletionTime()`: Returns `LocalDateTime`.
*   **Setters (with Validation):**
    *   `setCodename(String newCodename)`: A standard setter for the agent's codename.
    *   `setClearanceLevel(int level)`: **This is a critical part of encapsulation.**
        *   Add validation logic to ensure the `level` is between 1 and 5 (inclusive).
        *   If the input is valid, update the agent's `clearanceLevel`.
        *   If the input is invalid, print an error message to the console (e.g., "Invalid clearance level.") and do *not* change the value.
*   **Behavioral Methods:**
    *   `startMission()`: A method that sets the `onMission` status to `true`.
    *   `completeMission()`: A method that sets `onMission` to `false` and updates the `lastMissionCompletionTime` to the current time using `LocalDateTime.now()`.

---

### **Part 2: The `Mission` Class (Random & DateTime Focus)**

Your second task is to create a `Mission` class where each instance is randomly generated.

#### **Fields (all `private`):**
*   `missionTarget`: `String`.
*   `missionDeadline`: `LocalDate`.
*   `difficulty`: `int` (from 1 to 10).

#### **Constructor (The Fun Part):**
*   The constructor will take no arguments. It will randomly generate the mission details itself.
*   Inside the constructor:
    1.  Create a `Random` object.
    2.  Define a `String` array of possible mission targets (e.g., `"Retrieve stolen data"`, `"Infiltrate enemy base"`, `"Rescue hostage"`).
    3.  Randomly select a `missionTarget` from the array.
    4.  Generate a random `difficulty` level from 1 to 10.
    5.  Calculate the `missionDeadline` by adding a random number of days (e.g., between 7 and 30) to the current date (`LocalDate.now()`).

#### **Methods (`public`):**
*   **Getters:**
    *   `getMissionTarget()`
    *   `getMissionDeadline()`
    *   `getDifficulty()`
*   **`displayMissionBriefing()`:**
    *   This method should print a well-formatted mission briefing to the console.
    *   Use a `DateTimeFormatter` to display the deadline in a readable format (e.g., "MMMM dd, yyyy").
    *   **Example Output:**
        ```
        *** MISSION BRIEFING ***
        Target: Infiltrate enemy base
        Difficulty: 8
        Deadline: February 18, 2026
        ```

---

### **Part 3: The `MissionControl` (Main) Class**

This class will contain your `main` method and will orchestrate the entire simulation.

1.  Create an instance of `SecretAgent` (e.g., agent "007", "James Bond", clearance level 5).
2.  Print the agent's initial status using the getter methods.
3.  Create a new `Mission` object. Its details will be randomized upon creation.
4.  Call the `displayMissionBriefing()` method from your `Mission` object.
5.  **Decision Logic:** Check if the agent's `clearanceLevel` is greater than or equal to the mission's `difficulty`.
    *   If it is, call the agent's `startMission()` method and print a confirmation message (e.g., "Agent 007 is cleared for mission.").
    *   If not, print a denial message (e.g., "Agent 007's clearance is too low for this mission.").
6.  Assuming the agent was cleared, print their updated status (they should now be on a mission).
7.  Simulate time passing and then call the agent's `completeMission()` method.
8.  Print the agent's final status, including the `lastMissionCompletionTime` formatted nicely.

Go go go, agent!

---

# Grading Rubric: Secret Agent Mission Assignment System

| Criteria | 0 Points | 1-2 Points | 3-4 Points | 5 Points |
| :--- | :--- | :--- | :--- | :--- |
| **`SecretAgent` Class: Encapsulation** | No `SecretAgent` class submitted or fields are not `private`. | `SecretAgent` class exists, but fields are not all `private` or there are no getters/setters. | All fields are `private` and have public getters and setters, but validation is missing or incorrect. | All fields are `private`. All required getters and setters are present and correctly implemented. **Validation for `setClearanceLevel` works perfectly.** |
| **`SecretAgent` Class: State & Behavior** | Methods are missing or do not compile. | `startMission` and `completeMission` methods exist but do not correctly update the object's state. | `startMission` and `completeMission` work, but `lastMissionCompletionTime` is not handled or is not a `LocalDateTime`. | `startMission` and `completeMission` correctly modify the `onMission` boolean. `completeMission` accurately sets `lastMissionCompletionTime` to `LocalDateTime.now()`. |
| **`Mission` Class: Random Generation** | `Mission` constructor does not use the `Random` class. | `Random` is used, but only for one of the required attributes (e.g., only difficulty). | `Random` is used to generate the difficulty and select a target, but the implementation is flawed or not robust. | The constructor correctly uses a `Random` object to generate a mission `difficulty`, select a `missionTarget` from an array, and determine the number of days for the deadline. |
| **`Mission` Class: Date & Time** | `missionDeadline` is not a `LocalDate` or is not calculated. | `missionDeadline` is a `LocalDate` but is hard-coded or does not use `LocalDate.now()` as a base. | `missionDeadline` is correctly calculated but the `displayMissionBriefing` method does not use a `DateTimeFormatter`. | `missionDeadline` is correctly calculated by adding a random number of days to `LocalDate.now()`. The `displayMissionBriefing` method **correctly uses a `DateTimeFormatter`** for clean output. |
| **`MissionControl` (Main) Class: Orchestration** | `main` method is missing or does not create objects. | Objects are created, but there is no logic to connect them. | The program runs, but the logic to check agent clearance against mission difficulty is missing or incorrect. | The `main` method correctly creates both objects, **implements the clearance vs. difficulty check**, and calls the appropriate methods to simulate the full mission lifecycle, printing status updates along the way. |
| **Code Quality & Style** | Code is unreadable and does not follow Java conventions. | Code is difficult to read, with inconsistent formatting and naming. | Code is generally readable but has some style inconsistencies or could benefit from better comments/naming. | Code is clean, well-formatted, easy to read, and follows standard Java naming conventions. |

