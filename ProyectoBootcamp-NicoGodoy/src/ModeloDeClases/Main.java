package ModeloDeClases;

//import com.sun.org.apache.xpath.internal.operations.String;
import java.util.*;

/**
 * Created by Nico on 26/9/2016.
 */
public class Main {


    public static void main(String []args)
    {
        int resp;


        System.out.println("..::Bienvenidos a la aplicacion de Pronostico::..");
        System.out.println("Desea cargar datos para el dia de hoy?\nPresione 1-Si 2-No");
        resp=In.readInt();
        while (resp!=1&&resp!=2){
            System.out.println("Respuesta no valida!!\nPresione 1-Si 2-No");
            resp=In.readInt();
        }
        switch (resp) {
            case 1 :
                    {
                        int cant_De_Extendidos=1;//Contador para cantidad de Pronosticos extendidos
                        GregorianCalendar calendar = new GregorianCalendar();
                        Date fecha,fechaExt = new Date();
                        Dia diaExt = null;//Dia del pronostico extendido
                        List<PronosticoExtendido> lista_extendidos=new ArrayList<PronosticoExtendido>();

                        System.out.print("UBICACION\n");
                        System.out.print("Ingrese Pais: ");
                        String pais=In.readString();
                        System.out.print("Ingrese Region: ");
                        String region=In.readString();
                        System.out.print("Ingrese Ciudad: ");
                        String ciudad=In.readString();
                        Localidad localidad = new Localidad(ciudad,region,pais);

                        fecha = calendar.getTime();//Intancia la fecha actual.
                        System.out.print("\nHOY ES: "+fecha+"\n");

                        System.out.print("Ingrese temperatura en °C: ");
                        float temp=In.readFloat();
                        System.out.print("Ingrese descripcion del Dia: ");
                        java.lang.String descrip=In.readString();
                        DiaActual diaActual = new DiaActual(fecha,temp,descrip);

                        System.out.print("\nATMOSFERA\n");
                        System.out.print("Ingrese porcentaje de humedad: ");
                        float humedad=In.readFloat();
                        System.out.print("Ingrese valor de presion: ");
                        float presion=In.readFloat();
                        System.out.print("Ingrese visibilidad: ");
                        float visibilidad=In.readFloat();
                        System.out.print("Ingrese Ambiente ascendente: ");
                        float ambAsc=In.readFloat();
                        Atmosfera atmosf = new Atmosfera(humedad,presion,visibilidad,ambAsc);

                        System.out.print("\nVIENTO\n");
                        System.out.print("Ingrese direccion: ");
                        float direccion=In.readFloat();
                        System.out.print("Ingrese velocidad: ");
                        float velocidad=In.readFloat();

                        Viento viento = new Viento(direccion,velocidad);


                        int cargar_Otro=0;
                        do {
                            calendar.add(Calendar.DAY_OF_MONTH, 1);//Instancio en un dia el dia anterior
                            fechaExt = calendar.getTime();//Fecha del pronostico extendido
                            switch (fechaExt.getDay()){//Calculo el dia para settear el Enum
                                case 0:diaExt=Dia.Dom;
                                    break;
                                case 1:diaExt=Dia.Lun;
                                    break;
                                case 2:diaExt=Dia.Mar;
                                    break;
                                case 3:diaExt=Dia.Mier;
                                    break;
                                case 4:diaExt=Dia.Jue;
                                    break;
                                case 5:diaExt=Dia.Vie;
                                    break;
                                case 6:diaExt=Dia.Sab;
                                    break;

                            }

                            System.out.print("\nPRONOSTICO EXTENDIDO "+cant_De_Extendidos+"\n");
                            System.out.println("Para el dia: "+fechaExt);
                            System.out.print("Ingrese temp minima: ");
                            float min=In.readFloat();
                            System.out.print("Ingrese temp maxima: ");
                            float max=In.readFloat();
                            System.out.print("Ingrese descripcion: ");
                            String descripcion=In.readString();
                            lista_extendidos.add(new PronosticoExtendido(fechaExt,diaExt,min,max,descripcion));

                            cant_De_Extendidos++;
                            System.out.println("Cargar otro? 1-SI 2-NO: ");
                            cargar_Otro=In.readInt();
                        }
                        while (cargar_Otro==1);

                        Pronostico pronostico = new Pronostico(localidad,diaActual,atmosf,viento,lista_extendidos);
                        System.out.println(pronostico.toString());
                    }
        }
    }
}
