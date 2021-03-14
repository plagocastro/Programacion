
package boletin15;


public class Boletin15 {


    public static void main(String[] args) {
        metodos objeto=new metodos();
        int numeros[]=new int[6];
        numeros=objeto.crearArray(numeros);
        objeto.visualizarArray(numeros);
        
        metodos_2 obj=new metodos_2();
        int[] notas=new int[30];
        notas=obj.crearArray2(notas);
        obj.visualizarGrupos2(notas);
        obj.calcularMedia2(notas);
        obj.notaAlta2(notas);
        
        metodos_3 obx=new metodos_3();
        String[] nombre=new String[6];
        notas=obx.crearArray3(notas);
        nombre=obx.crearArray3(nombre);
        obx.visualizarGrupos3(notas);
        obx.visualizarAprobados3(notas,nombre);
        obx.mostrarNota3(notas, nombre);
    }
}

