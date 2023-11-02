package Ejercicio10;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtPalabra2;
    private JTextField txtPalabra1;
    private JLabel etiTexto;

    public Ventana() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(41, 21, 111, 27);
        contentPane.add(txtPalabra1);
        txtPalabra1.setColumns(10);

        txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(268, 21, 118, 27);
        contentPane.add(txtPalabra2);
        txtPalabra2.setColumns(10);

        etiTexto = new JLabel("");
        etiTexto.setBounds(187, 74, 200, 21);
        contentPane.add(etiTexto);

        JButton btnConcatena = new JButton("Concatena");
        btnConcatena.setBounds(164, 131, 101, 33);
        contentPane.add(btnConcatena);

        btnConcatena.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String palabra1 = txtPalabra1.getText();
                String palabra2 = txtPalabra2.getText();
                String resultado = palabra1 + " "  +   palabra2;
                etiTexto.setText(resultado);
            }
        });
    }
}
