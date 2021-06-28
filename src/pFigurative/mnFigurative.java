/*
 * Documentación de Aplicacion Figurative.
 * Equipo 1 | Unidad 5 y 6 |
 * Fecha de Elaboracion: 26 / Agosto / 2021
 * Docente: Juana Garcia Seañez
 */

 /*
 * Autores (Elaborado por):
 * Alvarez Gutierrez Arturo Misael, Corral Quezada Adrian
 * Gerard Ramos Elian Ramiro, Gil Najera Karen Vanessa
 * Najera Ruiz Roman, Salazar Campos Jesus Adan
 */

package pFigurative;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class mnFigurative {
      public static void main(String args[]) {
        
        // Creacion del objeto que mostrará la interfaz gráfica.
        GUI interfaz = new GUI();
        
        // Diseño de JOptionPane
        UIManager.put("OptionPane.background", new Color(255,255,255));
        UIManager.put("Panel.background", new Color(255,255,255));
        UIManager.put("OptionPane.messageForeground", new Color(0,0,0));
        UIManager.put("Button.background", new Color(156,0,188));
        UIManager.put("Button.foreground", new Color(255,255,255));
        
        // Uso de bloque Try-Catch
        try {
            interfaz.GUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cumple con las indicaciones por favor.", "Error",
                    JOptionPane.ERROR_MESSAGE, new ImageIcon("src/images/figJO.png"));
        }
    }
}
