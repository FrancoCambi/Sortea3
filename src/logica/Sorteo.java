package logica;
import gui.Pantalla;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class Sorteo {

    public static void main(String[] args) {
        
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        JSpinner ganadores = new JSpinner();

        // Disable keyboard edits in the spinner
        JFormattedTextField tf = ((JSpinner.DefaultEditor) ganadores.getEditor()).getTextField();
        tf.setEditable(false);
        tf.setBackground(Color.white);
    }
    
}
