/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class MedicalSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Medico medico1 = new Medico("", "");
        medico1.setNombre("Carlos");
        medico1.setApellidos("Fuentes");
        medico1.setFecha_nacimiento("26/01/1999");
        medico1.setEmail("carlosand1999@gmail.com");
        System.out.println(" el medico es: " + medico1.getFullname() + " y su edad es: " + medico1.getEdad() + " su email es " + medico1.getEmail());
        Vista_Formulario form = new Vista_Formulario();
        form.setVisible(true);
        
    }
    
}
