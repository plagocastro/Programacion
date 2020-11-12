
package boletin.pkg7;


public class Numeros {
    
    public void numero(int numeros){
        if (numeros<0){
            System.out.println("Erro");
        }
        else{
            System.out.println("Sera positivo");
        }
    }
    public void numero2(short num1, short num2){
        if (num1>=num2){
            int resta = num1 - num2;
            System.out.println("Da" + resta);
        }
        else{
             int suma = num1 + num2;
            System.out.println("Da" + suma);
        }
    }
    public void numero3(int num){
            if (num>0){
                System.out.println("+");
            }
            if (num<0){
                System.out.println("-");
            }
            else{
                System.out.println("0");
            }
    }
    public void peso(int peso1, int peso2){
        if (peso1 > peso2){
            System.out.println("La primera persona pesará más");
        }
        if (peso1 < peso2){
            System.out.println("La segundo persona será mas pesada");
        }
        else{
            System.out.println("Serán iguales");
        }
    }
    public void numero5(int numero1, int numero2, int numero3){
      if (numero1 > numero2){
           if (numero1 > numero3){
                System.out.println("El primer numero es mayor");
           }
        }
        if (numero2 > numero1){
            if (numero2 > numero3){
                System.out.println("El segundo numero es mayor");
           }
        }
        if (numero3>numero1){
             if (numero3> numero2)
                 System.out.println("El tercer numero es mayor");
               }
    } 
}
