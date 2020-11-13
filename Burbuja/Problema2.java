package Burbuja;
import java.util.Scanner;
public class Problema2 {
    private Scanner entrada;
    private int[] arreglo;
    private int buscado;
    private int tam;
    public void datos(){
        entrada=new Scanner(System.in);
        int e;
        System.out.print("Introduzca el numero de elementos de su arreglo");
        e=entrada.nextInt();
        arreglo=new int[e];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Introduzca el elemento["+i+"] del arreglo");
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("Ingrese el numero a buscar");
        buscado=entrada.nextInt();
        tam=arreglo.length;
    }
    public void imprimir(){
        System.out.println("El contenido del arreglo");
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Arreglo["+i+"] = "+ arreglo[i]);
        }
    int inferior=0;
    int centro;
    int superior= tam-1;
    while(inferior<=superior){
        centro=(superior + inferior)/2;
        if(arreglo[centro]==buscado){
            System.out.println("El numero buscado esta en la posicion "+centro);
            break;
        }else if(buscado<arreglo[centro]){
            superior=centro +1;
        }else{
            inferior=centro + 1;
        }
    }
}
    public static void main(String[]ar){
        Problema1 impresora=new Problema1();
        impresora.datos();
        impresora.imprimir();
    }

    
}
