package libreriaAngel;
/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 **/
import javax.swing.JOptionPane;

public class ValidarDatos {
    public static int validarIntMenorQueCero(){
        int dato;
        do{
            dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Dato positivo"));

        }while (dato <=0);
        return dato;
    }
    public static float validarFloatMenorQueCero(){
        float dato;
        do{
            dato = Float.parseFloat(JOptionPane.showInputDialog(null,"Dato positivo"));

        }while (dato <=0);
        return dato;
    }
}
