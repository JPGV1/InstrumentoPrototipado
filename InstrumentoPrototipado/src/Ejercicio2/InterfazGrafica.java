package Ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class InterfazGrafica extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel lblTitle;
	private JLabel etiTexto1;
	private JLabel etiTexto2;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;
	private String txt;

	

	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(203, 124, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("\u00A1\u00A1BIENVENIDOS!!");
		lblTitle.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblTitle.setBounds(170, 11, 102, 14);
		contentPane.add(lblTitle);
		
		txtTexto = new JTextField();
		txtTexto.setForeground(new Color(0, 0, 0));
		txtTexto.setFont(new Font("Tahoma", Font.ITALIC, 12));
		txtTexto.setBackground(new Color(222, 189, 244));
		txtTexto.setBounds(25, 94, 86, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		etiTexto1.setBackground(new Color(0, 0, 0));
		etiTexto1.setBounds(216, 55, 208, 46);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		etiTexto2.setBounds(216, 123, 208, 43);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnTraspasa1.setBackground(new Color(155, 105, 216));
		btnTraspasa1.setBounds(38, 176, 102, 23);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnTraspasa2.setBackground(new Color(155, 105, 216));
		btnTraspasa2.setBounds(246, 177, 102, 23);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		txt= txtTexto.getText();
		if(e.getSource()==btnTraspasa1) {
			
			etiTexto1.setText(txt);
		}else if (e.getSource()==btnTraspasa2) {
			etiTexto2.setText(txt);
		}
		
	}
}
