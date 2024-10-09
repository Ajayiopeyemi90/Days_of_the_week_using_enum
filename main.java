// Enum for days of the week
enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// The Superclass
class Week {
    protected DaysOfWeek[] days;

    public Week() {
        days = DaysOfWeek.values();
    }

    //all days of the week
    public void displayDays() {
        System.out.println("Days of the Week:");
        for (DaysOfWeek day : days) {
            System.out.println(day);
        }
    }
}

// The Subclass
class Weekend extends Week {

    public Weekend() {
        super(); // The supperclass constructor.
    }

    //The Method that display weekend days only
    public void displayWeekend() {
        System.out.println("\nWeekend Days:");
        for (DaysOfWeek day : days) {
            if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
                System.out.println(day);
            }
        }
    }
}

// Main class for the model.
public class Main {
    public static void main(String[] args) {
        Week week = new Week();
        week.displayDays();

        Weekend weekend = new Weekend();
        weekend.displayWeekend();
    }
}

