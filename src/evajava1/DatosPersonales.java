/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;//Paquete para usar ventanas PASO 1

/**
 *
 * @author LAB03
 */
public class DatosPersonales 
{
    public static void main(String[] dato)
            
    {
        //PASO 2
        String nombre;
        int edad=0;
        int incremento=0;
        
        //PASO 3
        //El showInput recibe datos de entrada por ventana
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        edad =  Integer.parseInt(JOptionPane.showInputDialog("Digite su Edad"));
        incremento=edad+20;
        
        JOptionPane.showMessageDialog(null, "Bienvenido"+nombre+"en 20 años su edad sera "+incremento+" años" );
    }      
            
            
            
}
