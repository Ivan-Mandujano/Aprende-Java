package Burbuja;
import java.util.Scanner;
public class Problema3 {
    private Scanner entrada;
    private int[] cuadrado;
    private int buscado;
    public void datos(){
        entrada=new Scanner(System.in);
        System.out.println("Le dire en que posicion de numeros al cuadrado se encuentra su numero");
        System.out.println("Introduzca un limite para los numeros al cuadrado");
        int limite= entrada.nextInt();
        cuadrado=new int[limite];
        for(int c=0;c<cuadrado.length;c++){
            cuadrado[c]= c*c;
        }
        System.out.println("Introduzca el numero a buscar en que posicion esta su cuadrado");
        buscado=entrada.nextInt();
    }
    public void imprimir(){
        for(int f=1;f<cuadrado.length;f++) {
            if(buscado==cuadrado[f]){
                System.out.println("Arreglo["+f+"] = "+ cuadrado[f] + "<---------------Aquí está");
            }else{
                System.out.println("Arreglo["+f+"] = "+ cuadrado[f]);
            }
        }
    }
    public static void main(String[]ar){
        Problema3 impresora=new Problema3();
        impresora.datos();
        impresora.imprimir();
    }
}
