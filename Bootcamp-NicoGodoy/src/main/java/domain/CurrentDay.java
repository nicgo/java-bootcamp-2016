package domain;

import java.util.Date;

/**
 * Created by Nico on 26/9/2016.
 */
public class CurrentDay {

    private Date date;
    private float temp;
    private String description;

    public CurrentDay(Date date, float temp, String description) {
        this.date = date;
        this.temp = temp;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CurrentDay{" +
                "date=" + date +
                ", temp=" + temp +
                ", description=" + description +
                '}';
    }
}
