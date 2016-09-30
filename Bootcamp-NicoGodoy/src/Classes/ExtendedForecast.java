package Classes;

import java.util.Date;

/**
 * Created by Nico on 26/9/2016.
 */
public class ExtendedForecast {

    private Date date;
    private Day day;
    private float low;
    private float high;
    private String description;

    public ExtendedForecast(Date date, Day day, float low, float high, String description) {
        this.date = date;
        this.day = day;
        this.low = low;
        this.high = high;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nExtendedForecast\n" +
                "\ndate=" + date +
                "\nday=" + day +
                "\nlow=" + low +
                "\nhigh=" + high +
                "\ndescription='" + description;
    }
}
