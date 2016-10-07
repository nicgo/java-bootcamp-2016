package builder;

import domain.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Nico on 6/10/2016.
 */
public class Forecast_Builder {
    private Location location;
    private CurrentDay day;
    private Atmosphere atmosphere;
    private Wind wind;
    private List<ExtendedForecast> extendedForecasts;

    public Forecast create(){
        Forecast forecast = new Forecast(location,day,atmosphere,wind,extendedForecasts);
        return forecast;
    }

    public Forecast_Builder create_Default(){
        this.location=new Location("Vcp","Cba","Arg");
        this.day= new CurrentDay(Calendar.getInstance().getTime(),27,"Cloudy");
        this.atmosphere=new Atmosphere(40,70,95,2);
        this.wind=new Wind(50,100);
        this.extendedForecasts= new ArrayList<ExtendedForecast>();
        extendedForecasts.add(new ExtendedForecast(Calendar.getInstance().getTime(), Day.Sun, 04, 12, "Cloudy"));
        extendedForecasts.add(new ExtendedForecast(Calendar.getInstance().getTime(), Day.Mon, 04, 12, "Sunny"));
        extendedForecasts.add(new ExtendedForecast(Calendar.getInstance().getTime(), Day.Tues, 04, 12, "Partly Cloudy"));
        return this;
    }

    public Forecast_Builder whit_Location(Location location){
        this.location=location;
        return this;
    }

    public Forecast_Builder whit_Day(CurrentDay day){
        this.day=day;
        return this;
    }

    public Forecast_Builder with_Atmosphere(Atmosphere atmosphere){
        this.atmosphere=atmosphere;
        return this;
    }

    public Forecast_Builder with_Wind(Wind wind){
        this.wind=wind;
        return this;
    }

    public Forecast_Builder with_Extend_Fore_List(List<ExtendedForecast> list){
        this.extendedForecasts= list;
        return this;
    }

}
