package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prueba {
        private JButton button_msg;
        private JPanel panelMain;

        public prueba() {
            button_msg.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Hola Mundo");
                }
            });
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Aplicacion Prueba");
            frame.setContentPane(new prueba().panelMain);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }
}
