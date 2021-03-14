
package boletin_16;


public class metodo_3 {
	private String texto = "www.javadesde0.com";
	private String[] textoArray;

	public void separarTexto3() {
		textoArray = new String[] {
				texto.substring(0, 8),
				texto.substring(8, texto.length()),};

		texto = "";

		System.out.printf(textoArray[0], textoArray[1]);
	}

	public void fusionarTexto3() {
		if (texto.length() == 0) {
			for (String linea : textoArray) {
				texto += linea;
			}
		}

		System.out.printf(texto);
	}
}