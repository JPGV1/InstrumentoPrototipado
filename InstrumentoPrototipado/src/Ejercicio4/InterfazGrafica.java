package Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfazGrafica extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnDesactivar;
	private JButton btnAceptar;
	private JButton btnActivar;
	private JLabel txtFrase;
	private String frase, nombre, ciudad;
	private JLabel txtIdNombre;
	private JLabel lblCiudad;

	
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(174, 117, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("\u00A1\u00A1BIENVENIDOS!!");
		lblTitle.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblTitle.setBounds(155, 11, 112, 14);
		contentPane.add(lblTitle);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(151, 78, 233));
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtNombre.setBounds(68, 104, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtFrase = new JLabel("");
		txtFrase.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtFrase.setBounds(68, 75, 287, 14);
		contentPane.add(txtFrase);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnActivar.setBackground(new Color(124, 62, 230));
		btnActivar.setBounds(68, 150, 89, 23);
		contentPane.add(btnActivar);
		btnActivar.addActionListener(this);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnAceptar.setBackground(new Color(124, 62, 230));
		btnAceptar.setBounds(167, 150, 89, 23);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnDesactivar.setBackground(new Color(124, 62, 230));
		btnDesactivar.setBounds(266, 150, 89, 23);
		contentPane.add(btnDesactivar);
		btnDesactivar.addActionListener(this);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtCiudad.setColumns(10);
		txtCiudad.setBackground(new Color(151, 78, 233));
		txtCiudad.setBounds(269, 104, 86, 20);
		contentPane.add(txtCiudad);
		
		txtIdNombre = new JLabel("Nombre:");
		txtIdNombre.setBounds(20, 108, 52, 14);
		contentPane.add(txtIdNombre);
		
		lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(221, 108, 46, 14);
		contentPane.add(lblCiudad);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAceptar) {
			nombre=txtNombre.getText();
			ciudad=txtCiudad.getText();
			frase="Usted es " +nombre+ " y su ciudad es "+ciudad;
			txtFrase.setText(frase);
		}
		if(e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}else if(e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}
	}

}
