package proyecto.iii;

public class Diputado extends Legislador{

    
    public Diputado(String ProvinvciaQueRepresenta, String Partido,  String nombre, String apellido, int edad) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        super.setPartido(Partido);
        super.setProvinvciaQueRepresenta(ProvinvciaQueRepresenta);
    }
        

    @Override
    public String getCamaraEnQueTrabaja() {
       String camara = "Diputado";
       return camara;
    }
    
}
