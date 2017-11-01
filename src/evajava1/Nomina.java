/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB03
 */
public class Nomina 
{
     public static void main(String[] args)
    {
      int sueldo=0;
      int horas=0;
      int valor_hora=0;
      
      sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
      
      horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas por el valor de las horas trabajadas"));
      
      sueldo=horas*valor_hora;
      
       JOptionPane.showMessageDialog(null, "su sueldo segun las horas trabajadas es: "+sueldo);
      
        
                
      
          
      }
          
          
     
      
      
      
      
          
              
}          
                
                    

