
package boletin_16;


public class metodos_4 {
    	private String texto;

	public void convertirMaiuscula4(String texto) {
		this.texto = texto.toUpperCase();

		System.out.printf(this.texto);
		System.out.println("");
	}

	public void convertirMinuscula4() {
		String textoAnterior = texto;
		texto = texto.toLowerCase();

		System.out.printf(texto);
		System.out.println("");
	}
}
