package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Botones {

	PantallaCalculadora pantalla;
	String[] datos = new String[3];

	public Botones(JFrame frame, PantallaCalculadora pantalla) {
		GenerarBotones(frame);
		this.pantalla = pantalla;
	}

	private void AlmacenarNumero(JButton boton) {
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.ActualizarPantalla(boton.getText());
			}
		});
	}

	private void AlmacenarSigno(JButton boton) {
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.ActualizarPantalla(boton.getText());
			}
		});
	}

	private void CalcularDatos(JButton boton) {
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.ActualizarPantalla(pantalla.CalcularDatos());
			}
		});
	}

	public void GenerarBotones(JFrame frame) {

		JButton Boton0 = new JButton("0");
		Boton0.setBounds(115, 213, 42, 37);
		AlmacenarNumero(Boton0);
		frame.getContentPane().add(Boton0);

		JButton Boton1 = new JButton("1");
		Boton1.setBounds(65, 165, 42, 37);
		AlmacenarNumero(Boton1);
		frame.getContentPane().add(Boton1);

		JButton Boton2 = new JButton("2");
		Boton2.setBounds(115, 165, 42, 37);
		AlmacenarNumero(Boton2);
		frame.getContentPane().add(Boton2);

		JButton Boton3 = new JButton("3");
		Boton3.setBounds(167, 165, 42, 37);
		AlmacenarNumero(Boton3);
		frame.getContentPane().add(Boton3);

		JButton Boton4 = new JButton("4");
		Boton4.setBounds(65, 117, 42, 37);
		AlmacenarNumero(Boton4);
		frame.getContentPane().add(Boton4);

		JButton Boton5 = new JButton("5");
		Boton5.setBounds(115, 117, 42, 37);
		AlmacenarNumero(Boton5);
		frame.getContentPane().add(Boton5);

		JButton Boton6 = new JButton("6");
		Boton6.setBounds(167, 118, 42, 37);
		AlmacenarNumero(Boton6);
		frame.getContentPane().add(Boton6);

		JButton Boton7 = new JButton("7");
		Boton7.setBounds(65, 70, 42, 37);
		AlmacenarNumero(Boton7);
		frame.getContentPane().add(Boton7);

		JButton Boton8 = new JButton("8");
		Boton8.setBounds(115, 70, 42, 37);
		AlmacenarNumero(Boton8);
		frame.getContentPane().add(Boton8);

		JButton Boton9 = new JButton("9");
		Boton9.setBounds(167, 70, 42, 37);
		AlmacenarNumero(Boton9);
		frame.getContentPane().add(Boton9);

		JButton BotonSuma = new JButton("+");
		BotonSuma.setBounds(10, 70, 42, 37);
		AlmacenarSigno(BotonSuma);
		frame.getContentPane().add(BotonSuma);

		JButton BotonResta = new JButton("-");
		BotonResta.setBounds(10, 117, 42, 37);
		AlmacenarSigno(BotonResta);
		frame.getContentPane().add(BotonResta);

		JButton BotonDivision = new JButton("/");
		BotonDivision.setBounds(10, 165, 42, 37);
		AlmacenarSigno(BotonDivision);
		frame.getContentPane().add(BotonDivision);

		JButton BotonMultiplicacion = new JButton("*");
		BotonMultiplicacion.setBounds(10, 213, 42, 37);
		AlmacenarSigno(BotonMultiplicacion);
		frame.getContentPane().add(BotonMultiplicacion);

		JButton BotonComa = new JButton(".");
		BotonComa.setBounds(167, 213, 42, 37);
		// AlmacenarNumero(BotonComa);
		frame.getContentPane().add(BotonComa);

		JButton BotonIgual = new JButton("=");
		BotonIgual.setBounds(65, 213, 42, 37);
		CalcularDatos(BotonIgual);
		frame.getContentPane().add(BotonIgual);

		JButton BotonBorrar = new JButton("C");
		BotonBorrar.setBounds(220, 213, 42, 37);
		AlmacenarSigno(BotonBorrar);
		frame.getContentPane().add(BotonBorrar);

	}

}
