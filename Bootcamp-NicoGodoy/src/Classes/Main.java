package Classes;

//import com.sun.org.apache.xpath.internal.operations.String;
import java.util.*;

/**
 * Created by Nico on 26/9/2016.
 */
public class Main {


    public static void main(String []args)
    {
        int resp;


        System.out.println("..::Welcome to App Forecast::..");
        System.out.println("Today data?\nPress 1-Yes 2-No");
        resp=In.readInt();
        while (resp!=1&&resp!=2){
            System.out.println("Wrong Option!!\\nPress 1-Yes 2-No");
            resp=In.readInt();
        }
        switch (resp) {
            case 1 :
                    {
                        int ext_Forec_Counter=1;//extended forecast counter
                        GregorianCalendar calendar = new GregorianCalendar();
                        Date date,extDate = new Date();
                        Day dayExt = null;//extended forecast day
                        List<ExtendedForecast> extendedForecastList=new ArrayList<ExtendedForecast>();

                        System.out.print("LOCATION\n");
                        System.out.print("County?: ");
                        String country=In.readString();
                        System.out.print("Region: ");
                        String region=In.readString();
                        System.out.print("City?: ");
                        String city=In.readString();
                        Location location = new Location(city,region,country);

                        date = calendar.getTime();//instantiates current date
                        System.out.print("\nTODAY IS: "+date+"\n");

                        System.out.print("Temperature in °C ?: ");
                        float temp=In.readFloat();
                        System.out.print("Enter description's Day: ");
                        java.lang.String descrip=In.readString();
                        CurrentDay currentDay = new CurrentDay(date,temp,descrip);

                        System.out.print("\nATMOSPHERE\n");
                        System.out.print("Humidity?: ");
                        float humidity=In.readFloat();
                        System.out.print("Pressure: ");
                        float pressure=In.readFloat();
                        System.out.print("Visibility: ");
                        float visibility=In.readFloat();
                        System.out.print("Rising: ");
                        float rising=In.readFloat();
                        Atmosphere atmosf = new Atmosphere(humidity,pressure,visibility,rising);

                        System.out.print("\nWIND\n");
                        System.out.print("Direction: ");
                        float direction=In.readFloat();
                        System.out.print("Velocity: ");
                        float velocity=In.readFloat();

                        Wind wind = new Wind(direction,velocity);


                        int load_another_option=0;
                        do {
                            calendar.add(Calendar.DAY_OF_MONTH, 1);//increase in a day, current day
                            extDate = calendar.getTime();//extended forecast day calculation
                            switch (extDate.getDay()){//day calculation to set Enum Day
                                case 0:
                                    dayExt = Day.Sun;
                                    break;
                                case 1:
                                    dayExt = Day.Mon;
                                    break;
                                case 2:
                                    dayExt = Day.Tues;
                                    break;
                                case 3:
                                    dayExt = Day.Wed;
                                    break;
                                case 4:
                                    dayExt = Day.Thu;
                                    break;
                                case 5:
                                    dayExt = Day.Fri;
                                    break;
                                case 6:
                                    dayExt = Day.Sun;
                                    break;

                            }

                            System.out.print("\nEXTENDED FORECAST "+ext_Forec_Counter+"\n");
                            System.out.println("Forecast for day: "+extDate);
                            System.out.print("Low?: ");
                            float low=In.readFloat();
                            System.out.print("High?: ");
                            float high=In.readFloat();
                            System.out.print("Enter description: ");
                            String description=In.readString();
                            extendedForecastList.add(new ExtendedForecast(extDate, dayExt,low,high,description));

                            ext_Forec_Counter++;
                            System.out.println("Do you want to load another forecast? 1-Yes 2-No: ");
                            load_another_option=In.readInt();
                        }
                        while (load_another_option==1);

                        Forecast forecast = new Forecast(location, currentDay,atmosf, wind,extendedForecastList);
                        System.out.println(forecast.toString());
                    }
        }
    }
}
