
### **Objective**
Rewrite the provided `PrintCalendar` class to use the built-in Java `Calendar` and `GregorianCalendar` classes instead of manual mathematical calculations.

### **Requirements**
1.  **Command-Line Input:** Modify the program to receive the **month** and **year** as command-line arguments instead of using `Scanner`.
    * *Example Usage:* `java PrintCalendar 5 2016`
2.  **API Integration:** Use `java.util.Calendar` and `java.util.GregorianCalendar` to determine:
    * The name of the month.
    * The day of the week the month starts on.
    * The total number of days in the month.
    * Whether the year is a leap year.
3.  **Refactor:** Delete the manual logic methods (like `isLeapYear`, `getTotalNumberOfDays`, and `getStartDay`) and replace them with calls to the Java Calendar API.

---

### **Original Code (For Reference)**

```java
import java.util.Scanner;

public class PrintCalendar {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);
    }

    /** Print the calendar for a month in a year */
    public static void printMonth(int year, int month) {
        // Print the headings of the calendar
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }

    /** Print the month title, e.g., March 2012 */
    public static void printMonthTitle(int year, int month) {
        System.out.println(" " + getMonthName(month) + " " + year);
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    /** Get the English name for the month */
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }

    /** Print month body */
    public static void printMonthBody(int year, int month) {
        // Get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    /** Get the start day of month/1/year */
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /** Get the total number of days since January 1, 1800 */
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }

    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
```

To ensure this rubric is "AI-friendly," it uses a **structured table format** and **clear quantitative indicators**. This allows an AI (or a human instructor) to parse the requirements quickly and assign points based on discrete, objective benchmarks.

## Grading Rubric (20 Points Total)

| Criteria | 4 pts (Excellent) | 2 pts (Partial) | 0 pts (Incomplete/Incorrect) |
| :--- | :--- | :--- | :--- |
| **Command-Line Inputs** | Program correctly uses `args[0]` and `args[1]` for month/year; includes basic error handling for missing arguments. | Program uses command-line args but crashes if they are missing or in the wrong format. | Program still uses `Scanner` or hardcoded values for input. |
| **API Class Integration** | Correctly instantiates and uses both `Calendar` and `GregorianCalendar` to drive the logic. | Uses only one of the required classes or uses them inefficiently (e.g., redundant objects). | Does not use the Java Calendar API at all. |
| **Logic Refactoring (Start Day)** | Uses `calendar.get(Calendar.DAY_OF_WEEK)` to find the start of the month. Manual Zeller logic is removed. | Uses API to get the date but incorrectly maps the integer value to the UI layout. | Manual `getStartDay` or `getTotalNumberOfDays` methods are still present. |
| **Logic Refactoring (Month Info)** | Uses `getActualMaximum(Calendar.DAY_OF_MONTH)` and `getDisplayName()` for month name/length. | Uses API for one but retains manual `switch` or `isLeapYear` logic for the other. | Retains manual `getMonthName` and `getNumberOfDaysInMonth` methods. |
| **Output & Formatting** | Calendar grid is perfectly aligned; matches original logic for spacing and line breaks. | Calendar logic is correct, but visual alignment is messy or off-center. | Output is unreadable or logically incorrect (dates under wrong days). |

**Total: 20 Points**