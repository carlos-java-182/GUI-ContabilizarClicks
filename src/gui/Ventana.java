package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private JPanel panel;
	private JLabel etiqueta;
	private JButton boton;
	private int click = 0;

	public Ventana() {
		setSize(500, 500);
		setTitle("Contabilizar clicks");
		setLocationRelativeTo(null);
		iniciarComponentes();

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void iniciarComponentes() {

		colocarPanel();
		colocarEtiqueta();
		colocarBoton();
		contabilizarClick();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);

	}

	public void colocarEtiqueta() {
		etiqueta = new JLabel("Pulsa el botón");
		etiqueta.setBounds(0, 50, 500, 40);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("Arial", 3, 12));

		panel.add(etiqueta);

	}

	public void colocarBoton() {
		boton = new JButton("Pulsa aquí");
		boton.setBounds(50, 300, 100, 40);
		boton.setFont(new Font("Cooper", 2, 12));
		boton.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(boton);

	}

	public void contabilizarClick() {

		MouseListener contador = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

				click++;

				etiqueta.setText("Boton pulsado " + click + " veces");

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		};
		boton.addMouseListener(contador);
	}

}
