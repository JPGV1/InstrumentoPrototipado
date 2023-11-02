package Ejercicio5;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfazGrafica extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JLabel etiPal1;
    private JLabel etiPal2;
    private JLabel etiPal3;
    private JLabel etiPal4;
    private JButton etiOcultar;

    public InterfazGrafica() {
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        etiPal1 = new JLabel("Palabra 1");
        etiPal1.setBounds(39, 66, 93, 31);
        contentPane.add(etiPal1);

        etiPal2 = new JLabel("Palabra 2");
        etiPal2.setBounds(128, 68, 55, 26);
        contentPane.add(etiPal2);

        etiPal3 = new JLabel("Palabra 3");
        etiPal3.setBounds(207, 70, 60, 22);
        contentPane.add(etiPal3);

        etiPal4 = new JLabel("Palabra 4");
        etiPal4.setBounds(314, 70, 45, 22);
        contentPane.add(etiPal4);

        etiOcultar = new JButton("Ocultar");
        etiOcultar.setBounds(153, 138, 114, 31);
        etiOcultar.setFont(new Font("Arial", Font.BOLD, 18));
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(new Color(0, 128, 128));
        contentPane.add(etiOcultar);

        etiOcultar.addActionListener(this);

        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }
}

