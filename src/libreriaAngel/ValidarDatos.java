package src.libreriaAngel;
/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 **/
import javax.swing.JOptionPane;

public class ValidarDatos {
    public static int validarIntMenorQueCero(String mensaje){
        int dato;
        do{
            dato = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        }while (dato <=0);
        return dato;
    }
    public static float validarFloatMenorQueCero(String mensaje){
        float dato;
        do{
            dato = Float.parseFloat(JOptionPane.showInputDialog(null,mensaje));

        }while (dato <=0);
        return dato;
    }
}
