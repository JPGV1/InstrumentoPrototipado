package Ejercicio9;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InterfazGrafica extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;

    public InterfazGrafica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtPrimerTrimestre = new JTextField();
        txtPrimerTrimestre.setBounds(25, 51, 86, 30);
        contentPane.add(txtPrimerTrimestre);
        txtPrimerTrimestre.setColumns(10);

        txtSegundoTrimestre = new JTextField();
        txtSegundoTrimestre.setBounds(180, 51, 86, 30);
        contentPane.add(txtSegundoTrimestre);
        txtSegundoTrimestre.setColumns(10);

        txtTercerTrimestre = new JTextField();
        txtTercerTrimestre.setBounds(324, 51, 86, 30);
        contentPane.add(txtTercerTrimestre);
        txtTercerTrimestre.setColumns(10);

        etiNotaFinal = new JLabel("NotaFinal:");
        etiNotaFinal.setBounds(116, 122, 121, 30);
        contentPane.add(etiNotaFinal);

        etiResultado = new JLabel("Resultado:");
        etiResultado.setBounds(270, 122, 140, 30);
        contentPane.add(etiResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(177, 194, 89, 38);
        contentPane.add(btnCalcular);


        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
                double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
                double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
                double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

            
                double notaMedia = (nota1 + nota2 + nota3) / 3;

               
                etiNotaFinal.setText("NotaFinal: " + notaMedia);

              
                if (notaMedia < 5) {
                    etiResultado.setText("Resultado: SUSPENSO");
                    etiResultado.setForeground(Color.RED);
                    etiNotaFinal.setForeground(Color.RED);
                } else {
                    etiResultado.setText("Resultado: APROBADO");
                    etiResultado.setForeground(Color.BLACK);
                }
            }
        });
    }
}
