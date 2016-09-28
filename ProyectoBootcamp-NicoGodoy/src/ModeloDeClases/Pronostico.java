package ModeloDeClases;

import java.util.List;

/**
 * Created by Nico on 26/9/2016.
 */
public class Pronostico {

    private Localidad localidad;
    private DiaActual dia;
    private Atmosfera atmosfera;
    private Viento viento;
    private List<PronosticoExtendido> pronosticoExtendidos;

    public Pronostico(Localidad localidad, DiaActual dia, Atmosfera atmosfera, Viento viento, List<PronosticoExtendido> pronosticoExtendidos) {
        this.localidad = localidad;
        this.dia = dia;
        this.atmosfera = atmosfera;
        this.viento = viento;
        this.pronosticoExtendidos = pronosticoExtendidos;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public DiaActual getDia() {
        return dia;
    }

    public void setDia(DiaActual dia) {
        this.dia = dia;
    }

    public Atmosfera getAtmosfera() {
        return atmosfera;
    }

    public void setAtmosfera(Atmosfera atmosfera) {
        this.atmosfera = atmosfera;
    }

    public Viento getViento() {
        return viento;
    }

    public void setViento(Viento viento) {
        this.viento = viento;
    }

    public List<PronosticoExtendido> getPronosticoExtendidos() {
        return pronosticoExtendidos;
    }

    public void setPronosticoExtendidos(List<PronosticoExtendido> pronosticoExtendidos) {
        this.pronosticoExtendidos = pronosticoExtendidos;
    }

    @Override
    public String toString() {
        return "Pronostico:\n" +
                "localidad=" + localidad +
                "\ndia=" + dia +
                "\natmosfera=" + atmosfera +
                "\nviento=" + viento +
                "\npronosticoExtendidos=" + pronosticoExtendidos;
    }
}

