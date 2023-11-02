package Ejercicio11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class InterfazGrafica extends JFrame implements MouseListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel[] etiquetas;
    private JTextField txtNumero;
    private StringBuilder numeroAcumulado = new StringBuilder();

    public InterfazGrafica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        etiquetas = new JLabel[10];
        contentPane.setLayout(null);

        txtNumero = new JTextField();
        txtNumero.setBounds(21, 11, 200, 23);
        contentPane.add(txtNumero);

        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel("eti" + (i + 1));
            etiquetas[i].setBounds(21, 50 + i * 39, 84, 23);
            contentPane.add(etiquetas[i]);

            etiquetas[i].addMouseListener(this);
        }

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(278, 79, 84, 23);
        contentPane.add(btnBorrar);

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroAcumulado.setLength(0);
                txtNumero.setText(numeroAcumulado.toString());
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (int i = 0; i < etiquetas.length; i++) {
            if (e.getSource() == etiquetas[i]) {
                numeroAcumulado.append(i);
                txtNumero.setText(numeroAcumulado.toString());
                break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

