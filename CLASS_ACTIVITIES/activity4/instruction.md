# Activity 4: The Java ATM System

**Objective:** To complete the functional logic of a bank transaction system and implement data persistence using File I/O to ensure account balances are saved between sessions.

In this activity, you are provided with a partially completed ATM application. While the login and account loading systems are functional, the core transaction logic and data saving mechanisms are missing.

---

### **Part 1: The `BankAccount` Class (Logic Refinement)**

Your first task is to ensure the `BankAccount` class can properly communicate the result of transactions back to the main application.

#### **Tasks:**

* **Refine `withdraw(float amount)**`: Modify this method so it returns a `boolean`. Return `true` if the withdrawal was successful (sufficient funds) and `false` if it failed (insufficient funds).
* **Encapsulation**: Ensure all calculations regarding the `balance` stay within this class. The `App` class should not manually subtract or add to the balance field.

---

### **Part 2: The `App` Class (Transaction Logic)**

The `beginTransaction` method currently only handles balance inquiries and then terminates. You must make it a fully interactive menu.

#### **Tasks:**

* **Menu Looping**: Wrap the `switch` statement in a loop (e.g., `while` or `do-while`) so the user can perform multiple actions. The loop should only end when the user selects `0` (Exit).
* **Deposit & Withdraw**:
1. Prompt the user for the amount using `Scanner`.
2. Call the corresponding method in the `BankAccount` object.
3. Display a success message with the new balance or an error message if the transaction fails.


* **Exit Logic**: When the user chooses to exit, the program must trigger the saving process before closing.

---

### **Part 3: Data Persistence (Save on Exit)**

Currently, the `loadAccounts` method reads the `accounts.csv` file, but changes are lost when the program ends. You must implement a way to write the updated data back to the file.

#### **Tasks:**

* **Create `saveAccounts(ArrayList<BankAccount> accounts)**`:
1. Use `FileWriter` or `PrintWriter` to open `accounts.csv`.
2. **Crucial**: Write the header line first: `Account No,Full Name,Balance,PIN`.
3. Iterate through the `ArrayList` and write each account's data as a comma-separated line.
4. Ensure the file is properly closed to save the changes.



---

# Grading Rubric: ATM Persistence System

| Criteria | 0 Points | 1-2 Points | 3-4 Points | 5 Points |
| --- | --- | --- | --- | --- |
| **Functional Transactions** | Deposit and Withdraw choices do not work or are missing. | Transactions work but do not update the object state or display the wrong balance. | Transactions work correctly, but the menu does not loop (terminates after one action). | **Deposit and Withdraw are fully functional within a repeating menu loop.** |
| **BankAccount Adjustments** | No changes made to `BankAccount.java`. | Changes made but contain logic errors (e.g., allowing negative balances). | Methods updated to return status, but `App.java` does not utilize the feedback. | **Methods return booleans/status correctly; App uses this to give user feedback.** |
| **Data Persistence** | No attempt to save data to the CSV file. | Attempted to save, but the file is corrupted, missing the header, or missing data. | Data saves successfully, but overwrites the file incorrectly or only saves the current user. | **Successfully overwrites `accounts.csv` with all updated account data and the correct header.** |
| **Exit & Execution** | Program crashes on exit or does not provide an exit option. | Exit option exists but does not trigger the save method. | Exit works and saves, but code contains redundant `Scanner` objects or resource leaks. | **Selecting '0' cleanly triggers the save method and terminates the program without errors.** |