/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class Vista_Formulario extends JFrame {

    public String name;

    Container cp = getContentPane();

    public Vista_Formulario() throws HeadlessException {

        super("Hospital");

        this.onIntit();

    }

    /**
     *
     * Generando la configuracion Inicial para mi Ventana
     *
     */
    public void configInitial() {

        this.setSize(800, 600);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);

        cp.setLayout(new GridLayout(3, 2, 0, 5));

    }

    /**
     *
     * Inicializa la ventanagit 
     *
     */
    public void onIntit() {

        this.configInitial();

        this.setVisible(true);

        this.addlabels(name);
        this.addtextfield(name);
        this.addbutton(name);

    }

    /**
     *
     * Agregando Labels Dinamicamente
     *
     * @param textLabel      *
     */
    public void addlabels(String textLabel) {

        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese antidad de Labels"));
        String label[] = new String[tam];
        for (int i = 0; i < tam; i++) {
            label[i] = JOptionPane.showInputDialog("Digite el nombre del Label en la posicion [" + i + "]");
            for (int j = 0; j < tam; j++) {
            }
            System.out.println(label[i]);
            this.add(new JLabel(label[i]));
        }

    }

    public void addtextfield(String textTextfield) {

        int tam2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Textfields "));
        String textfi[] = new String[tam2];
        for (int i = 0; i < tam2; i++) {
            textfi[i] = JOptionPane.showInputDialog("Digite el nombre del Textfield en la posicion [" + i + "]");
            for (int j = 0; j < tam2; j++) {
            }
            System.out.println(textfi[i]);
            this.add(new JTextField(textfi[i]));
        }
    }

    public void addbutton(String textbutton) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Buttons "));
        String button[] = new String[tam];
        for (int i = 0; i < tam; i++) {
            button[i] = JOptionPane.showInputDialog("Digite el nombre del Button en la posicion [" + i + "]");
            for (int j = 0; j < tam; j++) {
            }
            System.out.println(button[i]);
            this.add(new JButton(button[i]));
        }
    }
    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
}
