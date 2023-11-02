package Ejercicio3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfazGrafica extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private JTextField textTexto;
	private JLabel etiTittle;
	private JLabel etiTexto;
	private JButton btnVaciar;

	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(155, 222, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    etiTittle = new JLabel("Eventos del Teclado");
		etiTittle.setFont(new Font("Candara", Font.BOLD, 14));
		etiTittle.setForeground(new Color(0, 128, 255));
		etiTittle.setBackground(new Color(255, 255, 255));
		etiTittle.setBounds(160, 22, 139, 31);
		contentPane.add(etiTittle);
		
		textTexto = new JTextField();
		textTexto.setFont(new Font("Candara", Font.BOLD, 12));
		textTexto.setForeground(new Color(0, 128, 255));
		textTexto.setBackground(new Color(255, 255, 255));
		textTexto.setBounds(47, 91, 97, 20);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
		textTexto.addKeyListener(this);

		
		etiTexto = new JLabel("");
		etiTexto.setForeground(new Color(0, 128, 255));
		etiTexto.setFont(new Font("Candara", Font.BOLD, 14));
		etiTexto.setBounds(183, 68, 229, 66);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Candara", Font.BOLD, 12));
		btnVaciar.setBackground(new Color(138, 197, 255));
		btnVaciar.setForeground(new Color(0, 128, 255));
		btnVaciar.setBounds(160, 149, 89, 23);
		contentPane.add(btnVaciar);
		btnVaciar.addActionListener(this);

		
	}
	 public void keyTyped(KeyEvent e) {
	        char c = e.getKeyChar();
	        etiTexto.setText(etiTexto.getText() + c); 
	    }

	    public void keyPressed(KeyEvent e) {

	    }

	    public void keyReleased(KeyEvent e) {

	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnVaciar) {
	            textTexto.setText(""); 
	            etiTexto.setText("");  
	        }
	    }
}