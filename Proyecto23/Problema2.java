package Proyecto23;
import java.util.Scanner;
public class Problema2 {
    private Scanner entrada;
    private int [][] matriz;
    private int filas;
    private int columnas;
    public void Datos(){
        entrada=new Scanner(System.in);
        System.out.print("Introduzca la cantidad de filas de la matriz");
        filas=entrada.nextInt();
        System.out.print("Introduzca la cantidad de columnas de la matriz");
        columnas=entrada.nextInt();
        matriz=new int[filas][columnas];
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz[f].length;c++){
                System.out.print("Introduzca el componente");
                matriz[f][c]=entrada.nextInt();
            }
        }
    }
    public void busqueda(){
        System.out.println("Y... sus vertices son:...");
        int f=0;
               System.out.println(matriz[f][f]);
               System.out.println(matriz[f][columnas-1]);
               System.out.println(matriz[filas-1][f]);
               System.out.println(matriz[filas-1][columnas-1]);
    }
    public static void main(String[]ar){
        Problema2 impresora=new Problema2();
        impresora.Datos();
        impresora.busqueda();
    }
}
