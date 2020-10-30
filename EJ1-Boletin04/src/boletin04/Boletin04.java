
package boletin04;

import java.util.Scanner;


public class Boletin04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro obxLibro = new Libro();
        obxLibro.setTitulo("El Quijote");
        obxLibro.setAutor("Miguel de Cervantes");
        obxLibro.setAno(1605);
        obxLibro.setNumPaginas((short) 445);
        obxLibro.setValoracion(4.5f);
        obxLibro.amosar();
        System.out.println("Introduce titulo: ");
        String t = sc.nextLine();
        System.out.println("Introduce autor: ");
        String a = sc.nextLine();
        System.out.println("Introduce ano daa edicion: ");
        int an = sc.nextInt();
        System.out.println("Introduce numero de paxinas: ");
        short num = sc.nextShort();
        System.out.println("Introduce valoracion entre 0 e 10: ");
        float val = sc.nextFloat();
        System.out.println("Info final: Titulo "+ t +", Autor "+ a + ", Ano "+ an + ", numero de paxinas " + num  + ", valoracion "+ val);
    }
        
}
