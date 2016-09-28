package ModeloDeClases;

/**
 * Created by Nico on 26/9/2016.
 */
public class Localidad {

    private String ciudad;
    private String region;
    private String pais;

    public Localidad(String ciudad, String region, String pais) {
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
