package Errors;

public class TimeConverter {
    private int totalSeconds;
    private int minutes;
    private int remainingSeconds;

    private void convertTime() {
        this.minutes = totalSeconds /
                60;
        this.remainingSeconds = totalSeconds % 60;
    }

    public TimeConverter(int totalSeconds) {
        this.totalSeconds = totalSeconds;
        convertTime();
    }

    public int getMinutes() {
        return minutes;
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public static void main(String[] args) {
        int totalSeconds =
                135; // Input total seconds here
        TimeConverter converter = new TimeConverter(totalSeconds);
        System.out.println("Total Seconds: " + totalSeconds);
        System.out.println("Minutes: " + converter.getMinutes());
        System.out.println("Remaining Seconds: " + converter.getRemainingSeconds
                ());
    }
}