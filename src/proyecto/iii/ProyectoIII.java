package proyecto.iii;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProyectoIII {
    
    public static void evaluarEdad (int edad) throws NumberFormatException{
        if (edad < 0){
            throw new NumberFormatException();
        }
    }
    
    public static void evaluarString (String String) throws MisExcepciones{
        if (String.isEmpty()){
            throw new MisExcepciones();
        }
    }    
    
    public static void main(String[] args) {
            String ProvinvciaQueRepresenta = null, Partido = null,  nombre = null, apellido = null;
            int edad = 0;
            boolean flag=true;
            ArrayList<Legislador> ArrayLegislador = new ArrayList<>();
            
            do { 
                do{
                    try{
                        nombre=JOptionPane.showInputDialog(null, "Escriba nombre", "Registro de Legislador",JOptionPane.QUESTION_MESSAGE);
                        evaluarString(nombre);  
                        flag=true;
                    }catch(MisExcepciones e3){
                        JOptionPane.showMessageDialog(null, "No puede dejar campo vacío", "¡Error!", JOptionPane.WARNING_MESSAGE);    
                        flag=false;
                    }catch(NullPointerException ex){
                        System.exit(0);
                    }
                }while(flag==false);
                do{
                    try{
                        apellido=JOptionPane.showInputDialog(null, "Escriba apellido", "Registro de Legislador",JOptionPane.QUESTION_MESSAGE);
                        evaluarString(apellido); 
                        flag=true;
                    }catch(MisExcepciones e3){
                        JOptionPane.showMessageDialog(null, "No puede dejar campo vacío", "¡Error!", JOptionPane.WARNING_MESSAGE);    
                        flag=false;
                    }catch(NullPointerException ex){
                        System.exit(0);
                    }
                }while(flag==false);
                do {
                    try{
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba edad", "Registro de Legislador",JOptionPane.QUESTION_MESSAGE));
                        evaluarEdad(edad);
                        evaluarString(String.valueOf(edad));
                        flag=true;
                    }catch (NumberFormatException e2){
                        JOptionPane.showMessageDialog(null, "Introduzca una edad correcta", "¡Error!", JOptionPane.WARNING_MESSAGE);    
                        flag=false;
                    }catch(MisExcepciones e3){
                        JOptionPane.showMessageDialog(null, "No puede dejar campo vacío", "¡Error!", JOptionPane.WARNING_MESSAGE); 
                        flag=false;
                    }catch(NullPointerException ex){
                        System.exit(0);
                    }catch (HeadlessException e3){
                        JOptionPane.showMessageDialog(null, "Error al introducir edad", "¡Error!", JOptionPane.WARNING_MESSAGE);   
                        flag=false;
                    }
                } while (flag==false);
                do{
                    try {
                        Partido=JOptionPane.showInputDialog(null, "Escriba partido al que pertenece", "Registro de Legislador",JOptionPane.QUESTION_MESSAGE);
                        evaluarString(Partido); 
                        flag=true;
                    }catch(MisExcepciones e3){
                        JOptionPane.showMessageDialog(null, "No puede dejar campo vacío", "¡Error!", JOptionPane.WARNING_MESSAGE); 
                        flag=false;
                    }catch(NullPointerException ex){
                        System.exit(0);
                    }
                }while(flag==false);
                do{
                    try{                        
                        ProvinvciaQueRepresenta=JOptionPane.showInputDialog(null, "Escriba la provincia que representa", "Registro de Legislador",JOptionPane.QUESTION_MESSAGE);
                        evaluarString(ProvinvciaQueRepresenta);
                        flag=true;
                    }catch(MisExcepciones e3){
                        JOptionPane.showMessageDialog(null, "No puede dejar campo vacío", "¡Error!", JOptionPane.WARNING_MESSAGE);    
                        flag=false;
                    }catch(NullPointerException ex){
                        System.exit(0);
                    }
                }while(flag==false);
                    String[] carreras = {"Diputado","Senador"};        
                    if (JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0])=="Diputado"){
                        Legislador diputado = new Diputado(ProvinvciaQueRepresenta,Partido,nombre, apellido,edad);
                       ArrayLegislador.add(diputado);                   
                    }else {
                        Legislador senador;
                    senador = new Senador(ProvinvciaQueRepresenta,Partido,nombre, apellido,edad);
                        ArrayLegislador.add(senador);    
                    }
                    if (JOptionPane.showConfirmDialog(null, "¿Desea registrar a otro legislador?","Elija una opción",JOptionPane.YES_NO_OPTION)==1){
                        flag=false;
                    }	                 
        } while (flag);
            ArrayLegislador.forEach((aux) -> {
                System.out.println("El Legislador " + aux.getNombre() + " " + aux.getApellido() + " es : " + aux.getCamaraEnQueTrabaja());
        }); 
    }       
    
    
}
