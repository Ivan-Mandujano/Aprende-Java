/* Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector.*/
package ProyectoS20;
import java.util.Scanner;
public class Problema1 {
    private int[] arreglo;
    private Scanner entrada;
    private int n;

    public void Entrada(){
        entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero de elementos a ordenar");
        n= entrada.nextInt();
        arreglo=new int[n+1];
        for(int f=1; f<arreglo.length;f++){
            System.out.println("Introduzca el elemento numero ");
            arreglo[f]= entrada.nextInt(); 
        }
    }

    public void Ordenador(){
        for(int k=0;k<n;k++){
            for(int f=0;f<n-k;f++){
                if(arreglo[f]>arreglo[f+1]){
                    int aux;
                    aux=arreglo[f];
                    arreglo[f]=arreglo[f+1];
                    arreglo[f+1]=aux;
                }
            }
        }
    }
    public void Imprimir(){
        System.out.println("Los elementos ordenados de mayor a menor es ");
        for(int f=0;f<arreglo.length;f++){
            System.out.print(arreglo[f]);
        }
    }
    public static void main(String[]ar){
        Problema1 cargar=new Problema1();
        cargar.Entrada();
        cargar.Ordenador();
        cargar.Imprimir();
    }
}

