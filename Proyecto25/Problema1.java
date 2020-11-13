package Proyecto25;
import java.util.Scanner;
public class Problema1{
    private Scanner entrada;
    private int [][] matriz;
    public int n=0;
    public void Ciclo(){
        entrada=new Scanner(System.in);
        matriz=new int[5][];
        for(int f=0;f<matriz.length;f++){
            matriz[f]=new int[f+1];
            for(int c=0;c<matriz[f].length;c++){
                System.out.println("Introduzca los componentes de la matriz");
                System.out.println(f);
                System.out.print(c);
                matriz[f][c]= entrada.nextInt();
            }
        }
    }
    public void imprimir(){
        for(int f=0; f<matriz.length;f++){
            for(int c=0; c<matriz[f].length;c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]ar){
        Problema1 imp=new Problema1();
        imp.Ciclo();
        imp.imprimir();
    }
}