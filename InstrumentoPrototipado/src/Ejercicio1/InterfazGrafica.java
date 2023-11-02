package Ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JButton;

public class InterfazGrafica extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JButton btnOcultarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisuNombre;
	private JButton btnVisuCiudad;
	private JLabel lblTItle;
	private JLabel etiNombre;
	private JLabel etiCiudad;

	
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(194, 163, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTItle = new JLabel("\u00A1\u00A1BIENVENIDOS!!");
		lblTItle.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblTItle.setBounds(160, 11, 113, 14);
		contentPane.add(lblTItle);
		
		etiNombre = new JLabel("JUAN PABLO ");
		etiNombre.setForeground(new Color(78, 11, 159));
		etiNombre.setFont(new Font("Tahoma", Font.ITALIC, 14));
		etiNombre.setBounds(68, 62, 89, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("ARMENIA");
		etiCiudad.setForeground(new Color(78, 11, 159));
		etiCiudad.setFont(new Font("Tahoma", Font.ITALIC, 14));
		etiCiudad.setBounds(277, 62, 73, 14);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnOcultarNombre.setForeground(new Color(0, 0, 0));
		btnOcultarNombre.setBackground(new Color(170, 82, 228));
		btnOcultarNombre.setBounds(48, 130, 121, 23);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnOcultarCiudad.setForeground(Color.BLACK);
		btnOcultarCiudad.setBackground(new Color(170, 82, 228));
		btnOcultarCiudad.setBounds(243, 130, 121, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnVisuNombre.setForeground(Color.BLACK);
		btnVisuNombre.setBackground(new Color(170, 82, 228));
		btnVisuNombre.setBounds(48, 186, 121, 23);
		contentPane.add(btnVisuNombre);
		btnVisuNombre.addActionListener(this);
		
		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnVisuCiudad.setForeground(Color.BLACK);
		btnVisuCiudad.setBackground(new Color(170, 82, 228));
		btnVisuCiudad.setBounds(243, 186, 121, 23);
		contentPane.add(btnVisuCiudad);
		btnVisuCiudad.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);
		}else if (e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
		if(e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		}else if (e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}
		
	}
}
