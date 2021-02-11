/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 **/
package src.libreriaAngel;
import javax.swing.JOptionPane;

public class LeerDatos {

    public  static String leerString(String mensaje){
        return (JOptionPane.showInputDialog(null, mensaje));
    }
    public static int leerInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
}