package Proyecto16;
import java.util.Scanner;
public class Problema2 {
    private Scanner entrada;
    private int[] Uno;
    private int[] Dos;
    private int[] Tres;
    public void Ciclo(){
        entrada=new Scanner(System.in);
        Uno= new int[5];
        Dos= new int[5];
        for(int n=1;n<=4;n++){
            System.out.println("Introduzca el valor numero "+n);
            Uno[n]=entrada.nextInt();
        }
        for(int f=1;f<=4;f++){
            System.out.println("Introduzca el valor numero "+f);
            Dos[f]=entrada.nextInt();
        }
    }
    public void Sumatoria(){
        Tres= new int[5];
        for(int n=1;n<=4;n++){
            Tres[n]= Uno[n] + Dos[n];
        }
    }
    public void Imprimir(){
        System.out.println("La suma de los valores ingresados es ");
        for(int n=1; n<=4; n++){
            System.out.print(Tres[n]);
            System.out.print(",");
        }
    }
    public static void main(String[]ar){
        Problema2 impresora=new Problema2();
        impresora.Ciclo();
        impresora.Sumatoria();
        impresora.Imprimir();
    }
}
