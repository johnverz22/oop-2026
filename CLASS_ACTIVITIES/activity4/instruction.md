### Activity 4: ATM System Implementation

**Objective:** Complete the functional logic of a Java-based ATM system by integrating user input with object-oriented methods and ensuring data persistence.

---

### 📂 Technical Context

The provided starter code includes:

* **`App.java`**: Handles the login logic (using Java Streams/Optional) and the initial `loadAccounts` method which reads from `accounts.csv`.
* **`BankAccount.java`**: A class defining the structure of an account, including fields for `acctNo`, `pin`, `balance`, and `fullName`.
* **`accounts.csv`**: A data file containing initial user records.

---

### 🛠 Tasks

#### 1. Functional Transactions (`App.java`)

Modify the `beginTransaction` method to make the ATM fully operational:

* **Menu Loop:** Implement a loop (e.g., `while` or `do-while`) so the user can perform multiple transactions without the program closing after one choice.
* **Deposit:** Prompt the user for an amount and update the account balance using the `deposit` method.
* **Withdraw:** Prompt the user for an amount and update the balance. Ensure you handle cases where the user attempts to withdraw more than their current balance.
* **Exit:** When the user selects `0`, the program should save all changes and terminate.

#### 2. Persistence & Adjustments (`BankAccount.java` & `App.java`)

* **State Management:** If necessary, adjust the return types or logic in `BankAccount.java` to better communicate success or failure (e.g., if a withdrawal fails due to insufficient funds).
* **Save on Exit:** Implement a mechanism to write the updated `ArrayList<BankAccount>` back to `accounts.csv` before the program closes. Ensure the CSV header remains intact.

---

### 📊 Rubric (20 Points Total)

| Criteria | 5 Points (Excellent) | 3-4 Points (Good) | 1-2 Points (Developing) |
| --- | --- | --- | --- |
| **Logic & Control Flow** | Menu loops perfectly; Exit (0) works seamlessly; Switch-case is clean. | Menu loops, but has minor bugs or redundant code. | Menu does not loop or crashes on invalid input. |
| **Data Persistence** | Successfully overwrites the CSV with the updated balances upon exit. | Saves data, but formatting is slightly off or header is missing. | Fails to save data or corrupts the CSV file. |
| **Encapsulation & OOP** | Properly uses `BankAccount` methods for math; maintains private data integrity. | Logic is split between classes awkwardly; minor encapsulation breaks. | Calculations are done in `App.java` instead of using class methods. |
| **Input Validation** | Prevents negative deposits or overdrafts with clear user feedback. | Prevents errors but provides poor or confusing user messages. | Allows negative balances or invalid transactions. |