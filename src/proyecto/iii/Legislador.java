package proyecto.iii;

public abstract class Legislador extends Persona{
    
    private String ProvinvciaQueRepresenta;
    private String Partido;
   

    public String getProvinvciaQueRepresenta() {
        return ProvinvciaQueRepresenta;
    }

    public void setProvinvciaQueRepresenta(String ProvinvciaQueRepresenta) {
        this.ProvinvciaQueRepresenta = ProvinvciaQueRepresenta;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }

    
    

    
    
    public abstract String getCamaraEnQueTrabaja();
}
