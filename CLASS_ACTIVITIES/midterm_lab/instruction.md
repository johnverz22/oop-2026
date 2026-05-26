## **Midterm Lab Assessment: Rock-paper-scissor Game with Networking**

### **I. Objective**
To design a networked system that handles multi-round game logic, custom object modeling, and data persistence using the specific implementation patterns discussed in class.

### **II. Game Specifications**
You are to develop a **Server** and a **Client** application for a competitive Rock-Paper-Scissors match between two remote players.

1.  **Input Mapping:** 
    * `0` = Rock
    * `1` = Paper
    * `2` = Scissors
2.  **Match Structure:** * The game consists of **10 rounds**.
    * The system must track the score of each player across these rounds.
    * At the end of the 10th round, the system must declare an overall match winner based on who won the most rounds.
    * Display the leaderboard at the end of the game
3.  **Data Modeling (Required):** * You **must** use Java classes to represent your data. This includes a `Player` class and any other necessary models (e.g., `GameResult` or `Match`) to organize information before it is processed or saved.
4.  **Persistence:** * The final match results (Player names/IDs and total wins) must be recorded.
5. **Logic Location:** All game rules, winner determination, and score tracking must be handled by the **Server**.


### **IV. Submission**
Push your codes in your repository under `midterm_lab` directory.

### Grading Rubric

- **Encapsulation** (10 points)
  - Excellent (85-100%): All fields are private; access strictly via getters/setters; state changes (scores) are handled internally.
  - Good (70-84%): Most fields are private; minor direct access or missing getters/setters for non-critical fields.
  - Needs Improvement (50-69%): Several public fields; encapsulation logic is bypassed or poorly structured.
  - Unsatisfactory (0-49%): No encapsulation; all fields are public; no internal logic control.

- **Abstraction & Inheritance** (15 points)
  - Excellent (85-100%): Perfect abstract class and subclass implementation; compare() method overridden; effective use of super().
  - Good (70-84%): Hierarchy implemented but with minor logic errors or missing constructor chaining.
  - Needs Improvement (50-69%): Inheritance is implemented but misses abstract keyword or has redundant code.
  - Unsatisfactory (0-49%): Fails to use abstract classes or inheritance; relies on procedural logic.

- **Dynamic Binding** (10 points)
  - Excellent (85-100%): Server processes moves using the GameMove supertype reference; winner logic is purely polymorphic.
  - Good (70-84%): Most logic is polymorphic, but uses instanceof or type-casting excessively.
  - Needs Improvement (50-69%): Limited use of polymorphism; logic is mostly hardcoded to specific subclasses.
  - Unsatisfactory (0-49%): No dynamic binding; server logic explicitly references specific subclasses.

- **Networking & Persistence** (10 points)
  - Excellent (85-100%): Reliable multi-round networking; match results are correctly formatted and saved to a file.
  - Good (70-84%): Functional networking; persistence works but formatting is inconsistent.
  - Needs Improvement (50-69%): Basic networking; persistence is incomplete or fails under certain conditions.
  - Unsatisfactory (0-49%): Networking fails to complete 10 rounds; no data persistence implemented.

- **Code Quality** (5 points)
  - Excellent (85-100%): Code is clean, well-commented, and follows Java naming conventions perfectly.
  - Good (70-84%): Code is readable and mostly follows conventions with minor stylistic issues.
  - Needs Improvement (50-69%): Code lacks clarity; sparse comments; inconsistent naming conventions.
  - Unsatisfactory (0-49%): Unreadable code; no documentation; poor project structure.
