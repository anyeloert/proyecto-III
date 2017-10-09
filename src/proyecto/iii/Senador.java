package proyecto.iii;

public class Senador extends Legislador{

    public Senador(String ProvinvciaQueRepresenta, String Partido,  String nombre, String apellido, int edad) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        super.setPartido(Partido);
        super.setProvinvciaQueRepresenta(ProvinvciaQueRepresenta);
    }

    

    @Override
   public String getCamaraEnQueTrabaja() {
       String camara = "Senador";
       return camara;
    }
    
    
    
}
