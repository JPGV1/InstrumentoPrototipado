package Ejercicio8;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class InterfazGrafica extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnOpaca; 
	private JButton btnTransparente;
	private JButton btnFondoVerde;
	private JButton btnFondoRojo;
	private JButton btnFondoAzul;
	private JButton btnVerde;
	private JButton btnRojo; 
	private JButton btnAzul;
	private JLabel etiTexto;
	
	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 186, 201));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JLabel("Juan Pablo");
		etiTexto.setBackground(new Color(188, 186, 201));
		etiTexto.setForeground(new Color(64, 0, 64));
		etiTexto.setFont(new Font("Sitka Small", Font.BOLD, 20));
		etiTexto.setBounds(155, 11, 141, 34);
		etiTexto.setOpaque(true);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnAzul.setBackground(new Color(138, 197, 255));
		btnAzul.setForeground(new Color(0, 128, 255));
		btnAzul.setBounds(10, 75, 89, 23);
		contentPane.add(btnAzul);
		btnAzul.addActionListener(this);

		btnRojo = new JButton("Rojo");
		btnRojo.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnRojo.setForeground(new Color(255, 0, 0));
		btnRojo.setBackground(new Color(255, 102, 102));
		btnRojo.setBounds(10, 109, 89, 23);
		contentPane.add(btnRojo);
		btnRojo.addActionListener(this);
		
		btnVerde = new JButton("Verde");
		btnVerde.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnVerde.setForeground(new Color(0, 255, 64));
		btnVerde.setBackground(new Color(187, 255, 187));
		btnVerde.setBounds(10, 143, 89, 23);
		contentPane.add(btnVerde);
		btnVerde.addActionListener(this);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnFondoAzul.setForeground(new Color(0, 128, 255));
		btnFondoAzul.setBackground(new Color(138, 197, 255));
		btnFondoAzul.setBounds(171, 75, 103, 23);
		contentPane.add(btnFondoAzul);
		btnFondoAzul.addActionListener(this);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnFondoRojo.setForeground(Color.RED);
		btnFondoRojo.setBackground(new Color(255, 102, 102));
		btnFondoRojo.setBounds(171, 109, 103, 23);
		contentPane.add(btnFondoRojo);
		btnFondoRojo.addActionListener(this);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setFont(new Font("Sitka Small", Font.PLAIN, 10));
		btnFondoVerde.setForeground(new Color(0, 255, 64));
		btnFondoVerde.setBackground(new Color(187, 255, 187));
		btnFondoVerde.setBounds(171, 143, 103, 23);
		contentPane.add(btnFondoVerde);
		btnFondoVerde.addActionListener(this);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnTransparente.setForeground(new Color(177, 177, 177));
		btnTransparente.setBackground(new Color(232, 232, 232));
		btnTransparente.setBounds(318, 93, 115, 23);
		contentPane.add(btnTransparente);
		btnTransparente.addActionListener(this);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		btnOpaca.setForeground(new Color(128, 128, 128));
		btnOpaca.setBackground(new Color(192, 192, 192));
		btnOpaca.setBounds(329, 127, 89, 23);
		contentPane.add(btnOpaca);
		btnOpaca.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAzul) {
			etiTexto.setForeground(Color.BLUE);
		}else if(e.getSource()==btnRojo) {
			etiTexto.setForeground(Color.RED);	
		}else if(e.getSource()==btnVerde) {
			etiTexto.setForeground(Color.GREEN);	
		}else if(e.getSource()==btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);	
		}else if(e.getSource()==btnFondoRojo) {
			etiTexto.setBackground(Color.RED);	
		}else if(e.getSource()==btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);	
		}else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        }
		 etiTexto.repaint(); 
	}

}
