
/**
 * Write a description of class Visit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Visit
{
    private String date;
    private int hour;

    /**
     * Constructor for objects of class Visit
     */
    public Visit(String date, int hour)
    {
        this.date = date;
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
    public String getDate() {
        return date;
    }
}
