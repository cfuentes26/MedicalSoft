/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author estudiante
 */
public class Validacion {
    
    public boolean validateEmail(String email){
     // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        // El email a validar
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El email ingresado es inválido.");
        }
        
        return mather.matches();
    
}
    public boolean validatePhone(){
        return true;
    }
}
