package ModeloDeClases;

/**
 * Created by Nico on 26/9/2016.
 */
public class Viento {


    private float direccion;
    private float velocidad;

    public Viento(float direccion, float velocidad) {

        this.direccion = direccion;
        this.velocidad = velocidad;
    }


    public float getDireccion() {
        return direccion;
    }

    public void setDireccion(float direccion) {
        this.direccion = direccion;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Viento{" +
                "direccion=" + direccion +
                ", velocidad=" + velocidad +
                '}';
    }
}
