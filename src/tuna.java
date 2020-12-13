package src;

public class tuna {
    private int hour=1;
    private int minutes=2;
    private int seconds=3;

    public void setTime(int hour, int minutes, int seconds) {
        // you have to use "this" because your formal arguments are named the same as attributes of the tuna class.
        // It wouldn't make any sense to write hour=hour.
        // The only way to access your private attributes in these situations is to use "this"
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

    public String toRegularTime() {
        return String.format("%d:%02d:%02d %s",
                ((hour==0 || hour==12 || hour==24) ? 12: hour%12),
                minutes, seconds, (hour>=12 ? "PM": "AM"));
    }
}