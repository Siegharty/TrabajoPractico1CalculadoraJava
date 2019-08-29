package Controllers;

import Models.A;
import Models.B;
import Models.IOperadores;
import Models.ITipoOperacion;
import Models.TipoOperacion;

public class Calculadora implements IOperadores, ITipoOperacion {

	private A a;
	private B b;
	private TipoOperacion tipoOperacion;

	public Calculadora(double a, double b, String tipo) {
		this.a = new A(a);
		this.b = new B(b);
		this.tipoOperacion = new TipoOperacion(tipo);
	}

	@Override
	public double Suma() {
		return a.getA() + b.getB();
	}

	@Override
	public double Resta() {
		return a.getA() - b.getB();
	}

	@Override
	public double Division() {
		return a.getA() / b.getB();
	}

	@Override
	public double Multiplicacion() {
		return a.getA() * b.getB();
	}

	@Override
	public String DevolverOperacion() {
		double resultado = 0;

		switch (tipoOperacion.getTipoOperacion().toUpperCase()) {

		case "+":
			resultado = Suma();
			break;
		case "-":
			resultado = Resta();
			break;
		case "/":
			resultado = Division();
			break;
		case "*":
			resultado = Multiplicacion();
			break;
		default:
			resultado = 0;
			break;
		}
		return Double.toString(resultado);
	}

	public void AlmacenarDatos(String[] datos) {
		this.a.setA((Double.parseDouble(datos[0])));
		this.b.setB((Double.parseDouble(datos[1])));
		this.tipoOperacion.setTipoOperacion(datos[2]);
	}

	public void LimpiarDatos() {
		this.a.setA(0);
		this.b.setB(0);
		this.tipoOperacion.setTipoOperacion("");
	}
}
