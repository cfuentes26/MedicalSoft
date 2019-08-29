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

        Medico primermedico = new Medico("Jose", "Alvarez");
        //primermedico.nombre="Jose";
        System.out.println(primermedico.getNombre()+" "+primermedico.getApellidos());

    }

}
