package Proyecto;
import java.util.Scanner;
public class Problema1 {
    private int[]arreglo;
    private int valores;
    Scanner entrada=new Scanner(System.in);


    public void Entrada(){
        System.out.println("Introduzca el numero de valores a introducir");
        valores= entrada.nextInt();
        for(int n=1; n<=valores;n++){
            System.out.println("Introduzca el valor "+valores);
            arreglo[n]= entrada.nextInt();
        }
    }
    public void Condicion(){
        int menor = arreglo[0];
        int igual= arreglo[0];
        for(int n=1;n<=arreglo.length;n++){
            if(arreglo[n]<menor){
                menor= arreglo[n];
            }
        }
        for(int f=1; f<=arreglo.length;f++){
            if(arreglo[f]==igual){
                igual= arreglo[f];
                }
            }
        System.out.println("El elemento menor es "+menor);
        System.out.println("Los elementos iguales son "+menor);
        }
    public static void main(String[]ar){
        Problema1 impresora=new Problema1();
        impresora.Entrada();
        impresora.Condicion();
    }
}
