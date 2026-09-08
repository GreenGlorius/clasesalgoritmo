
    
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebaEjecutable {
    public static void main(String[] args) {
        // 1. Crear el marco/ventana principal
        JFrame frame = new JFrame("Mi Aplicación Java");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrar en pantalla

        // 2. Crear un panel y componentes
        JPanel panel = new JPanel();
        JLabel label = new JLabel("¡Hola! Esta es una app nativa en Java.");
        JButton button = new JButton("Haz clic aquí");

        // 3. Agregar evento al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Presionaste el botón!");
            }
        });

        // 4. Armar la interfaz y mostrarla
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
