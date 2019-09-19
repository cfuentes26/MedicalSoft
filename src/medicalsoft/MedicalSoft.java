/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import static medicalsoft.Validacion.validateEmail;

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

       Medico medico1 = new Medico("","");
       medico1.setNombre("Omar");
       medico1.setApellidos("Marenco");
       medico1.setFecha_nacimiento("22/02/1981");
        medico1.setEmail("carlosand1999/gmail.com");
        System.out.println(" el medico es: " + medico1.getFullname()+ " y su edad es " + medico1.getEdad() + " y su email es "+ validateEmail("carlosand1999@gmail.com"));
       
       
       

    }

}
