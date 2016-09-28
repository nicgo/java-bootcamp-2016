package ModeloDeClases;

import java.util.Date;

/**
 * Created by Nico on 26/9/2016.
 */
public class DiaActual {

    private Date fecha;
    private float temp;
    private String descripcion;

    public DiaActual(Date fecha, float temp, String descripcion) {
        this.fecha = fecha;
        this.temp = temp;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "DiaActual{" +
                "fecha=" + fecha +
                ", temp=" + temp +
                ", descripcion=" + descripcion +
                '}';
    }
}
