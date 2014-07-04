/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo9;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int num=0,c=0;
    for (int i = 0; i < 2; i++) 
    {
    num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
    if (num>0)
   {i=2;}
    else
            {
        i=0;
        JOptionPane.showMessageDialog(null, "Debe de Ingresar Valores Enteros Positivos es Decir Numeros Mayores a 0" );
            }  
        }
    long[] arreglo=new long[num];
    for (int i = 0; i < arreglo.length; i++) 
     {arreglo[i]=i*i;
     }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (num==arreglo[i])
            {
                i=arreglo.length;
                c=1;
            }
        }
        if (c==1 || num == 1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }
    }
}
    
