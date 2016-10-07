package builder;

import domain.Day;
import domain.ExtendedForecast;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Nico on 6/10/2016.
 */
public class ExtendedForecast_Builder {
    private Date date;
    private Day day;
    private float low;
    private float high;
    private String description;

    public ExtendedForecast create(){
        ExtendedForecast extendedForecast= new ExtendedForecast(date,day,low,high,description);
        return extendedForecast;
    }

    public ExtendedForecast_Builder create_Default()
    {
        this.date= Calendar.getInstance().getTime();
        this.day=Day.Fri;
        this.low=12;
        this.high=29;
        this.description="Hazy";
        return this;
    }

    public  ExtendedForecast_Builder with_date(Date date){
        this.date=date;
        return this;
    }

    public  ExtendedForecast_Builder with_day(Day day){
        this.day=day;
        return this;
    }

    public  ExtendedForecast_Builder with_low(Float low){
        this.low=low;
        return this;
    }

    public  ExtendedForecast_Builder with_high(Float high){
        this.high=high;
        return this;
    }

    public  ExtendedForecast_Builder with_description(String description){
        this.description=description;
        return this;
    }
}
