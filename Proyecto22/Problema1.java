/*Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
Imprimir luego la matriz.*/
package Proyecto22;
import java.util.Scanner;
public class Problema1 {
    private Scanner entrada;
    private int[] [] componente;

    public void Cargar(){
        entrada=new Scanner(System.in);
        componente=new int[2][5];
        for(int f=0;f<2;f++){
            for(int n=0;n<5;n++){
                System.out.println("Introduzca el componente");
                componente[f][n]=entrada.nextInt();
            }
        }
    }
    public void Imprimir(){
        for(int f=0;f<2;f++){
            for(int n=0;n<5;n++){
                System.out.print(componente[f][n]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]ar){
        Problema1 imp=new Problema1();
        imp.Cargar();
        imp.Imprimir();
    }
}
