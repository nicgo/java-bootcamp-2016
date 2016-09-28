package ModeloDeClases;

/**
 * Created by Nico on 26/9/2016.
 */
public class Atmosfera {

    private float humedad;
    private float presion;
    private float visibilidad;
    private float ambienteAsc;

    public Atmosfera(float humedad, float presion, float visibilidad, float ambienteAsc) {
        this.humedad = humedad;
        this.presion = presion;
        this.visibilidad = visibilidad;
        this.ambienteAsc = ambienteAsc;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public float getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(float visibilidad) {
        this.visibilidad = visibilidad;
    }

    public float getAmbienteAsc() {
        return ambienteAsc;
    }

    public void setAmbienteAsc(float ambienteAsc) {
        this.ambienteAsc = ambienteAsc;
    }

    @Override
    public String  toString() {
        return "Atmosfera{" +
                "humedad=" + humedad +
                ", presion=" + presion +
                ", visibilidad=" + visibilidad +
                ", ambienteAsc=" + ambienteAsc +
                '}';
    }
}
