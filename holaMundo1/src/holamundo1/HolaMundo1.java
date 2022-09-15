/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo1;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class HolaMundo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        String nombre =JOptionPane.showInputDialog("Entre su nombre, por favor");
        JOptionPane.showMessageDialog(null, "Hola " +nombre+ ", bienvenido al sistema.");
        
        char sexo = JOptionPane.showInputDialog("Por favor, indícame si eres hombre o mujer. Para ello necesito que introduzcas una de las siguientes letras: H o M").charAt(0);
        if(sexo=='M'||sexo=='m')
        {
            JOptionPane.showMessageDialog(null,"Me alegra estar hablando con una chica");
        }
        else
        {
            if(sexo=='H'||sexo=='h')
            {
                JOptionPane.showMessageDialog(null, "No sé por qué me imaginé que eras un hombre.");
            }
            else
                JOptionPane.showMessageDialog(null, "Has introducido la letras " + sexo+ ", voy a asumir que eres un unicornio.");
        }
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        JOptionPane.showMessageDialog(null, "Wow, en verdad tienes " +edad+ ", pareces mucho más joven. Creí que tenías " +(edad -1));
        
        
    }
    
}
