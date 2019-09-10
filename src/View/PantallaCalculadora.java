package View;

import java.awt.Color;
import java.awt.Font;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import Controllers.Calculadora;

public class PantallaCalculadora {

	private JLabel PantallaCalculadora = new JLabel("");
	private JLabel PantallaCalculadora2 = new JLabel("");
	private String primerNumero = "";
	private String segundoNumero = "";
	private String signo = "";
	Calculadora calc = new Calculadora(0, 0, "");

	public PantallaCalculadora(JFrame frame) {
		GenerarPantalla(frame);
	}

	private void GenerarPantalla(JFrame frame) {
		PantallaCalculadora.setBounds(10, 5, 275, 60);
		PantallaCalculadora.setBackground(Color.WHITE);
		PantallaCalculadora.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 30));
		PantallaCalculadora.setForeground(Color.BLACK);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		PantallaCalculadora.setBorder(border);
		frame.getContentPane().add(PantallaCalculadora);

		PantallaCalculadora2.setBounds(15, -115, 214, 261);
		PantallaCalculadora2.setBackground(Color.WHITE);
		PantallaCalculadora2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 10));
		PantallaCalculadora2.setForeground(Color.GRAY);
		frame.getContentPane().add(PantallaCalculadora2);
	}

	public void EnviarDatosDePantalla() {
		String[] resultado = new String[3];
		ObtenerDatosDePantalla(PantallaCalculadora.getText(), calc.ObtenerTipoOperacion());

		resultado[0] = this.primerNumero;
		resultado[1] = this.segundoNumero;
		resultado[2] = this.signo;

		calc.AlmacenarDatos(resultado);
	}

	public String CalcularDatos() {
		EnviarDatosDePantalla();
		ActualizarPantalla("C2");
		return calc.DevolverOperacion();
	}

	private void ObtenerDatosDePantalla(String cadena, String signo) {
		String[] arrayNuevo = cadena.split(Pattern.quote(signo));
		this.primerNumero = arrayNuevo[0];
		this.segundoNumero = arrayNuevo[1];
		this.signo = signo;
	}

	private String ObtenerSignoDeTexto(String cadena) {
		String nuevo = "";
		char[] cadena_div = cadena.toCharArray();
		for (int i = 0; i < cadena_div.length; i++) {
			if (cadena_div[i] == '+' || cadena_div[i] == '-' || cadena_div[i] == '/' || cadena_div[i] == '*') {
				nuevo += cadena_div[i];
			}
		}
		return nuevo.substring(nuevo.length()-1);
	}

	public boolean existeSignoEnPantalla() {
		char[] cadena_div = PantallaCalculadora.getText().toCharArray();
		// Verificar que no tome el signo negativo de un numero
		for (int i = 0; i < cadena_div.length; i++) {
			if (cadena_div[i] == '+' || (cadena_div[i] == '-' && !Character.isDigit(cadena_div[i + 1]))
					|| cadena_div[i] == '/' || cadena_div[i] == '*') {
				return true;
			}
		}
		return false;
	}

	private String NegarUltimoNumero() {
		char[] cadena_div = PantallaCalculadora.getText().toCharArray();
		String nuevo = "";
		for (int i = 0; i < cadena_div.length; i++) {
			if (Character.isDigit(cadena_div[i])) {
				nuevo += cadena_div[i];
			}
		}
		return "-" + nuevo.substring(nuevo.length() - 1);
	}

	public void ActualizarPantalla(String s) {
		switch (s) {
		case "C":
			PantallaCalculadora.setText("");
			PantallaCalculadora2.setText("");
			calc.LimpiarDatos();
			break;
		case "C2":
			PantallaCalculadora.setText("");
			PantallaCalculadora2.setText("");
			break;
		case "±":
			PantallaCalculadora.setText(NegarUltimoNumero());
			PantallaCalculadora2.setText(NegarUltimoNumero());
			break;
		default:
			PantallaCalculadora.setText(PantallaCalculadora.getText() + s);
			PantallaCalculadora2.setText(PantallaCalculadora2.getText() + s);
			break;
		}
	}

	public void EnviarTipoOperacion(String dato) {
		calc.AlmacenarTipoOperacion(dato);
	}
}
