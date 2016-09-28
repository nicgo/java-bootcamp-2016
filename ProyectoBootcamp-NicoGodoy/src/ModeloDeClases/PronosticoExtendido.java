package ModeloDeClases;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Nico on 26/9/2016.
 */
public class PronosticoExtendido {

    private Date fecha;
    private Dia dia;
    private float min;
    private float max;
    private String descripcion;

    public PronosticoExtendido(Date fecha, Dia dia, float min, float max, String descripcion) {
        this.fecha = fecha;
        this.dia = dia;
        this.min = min;
        this.max = max;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
