package src.libreriaAngel;
import javax.swing.JOptionPane;
/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 **/
public class PedirDatos {
    public static String pedirString(String mensaje){
        return (JOptionPane.showInputDialog( mensaje));
    }
    public int pedirInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
}
