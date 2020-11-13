package Burbuja;
import java.util.Scanner;
public class Problema1 {
    private Scanner entrada;
    private int[] arreglo;
    private int buscado;
    public void datos(){
        entrada=new Scanner(System.in);
        int e;
        System.out.print("Introduzca el numero de elementos de su arreglo");
        e=entrada.nextInt();
        arreglo=new int[e];
        for(int i=0;i<arreglo.length;i++){
            System.out.print("Introduzca el elemento "+i);
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("Ingrese el numero a buscar");
        buscado=entrada.nextInt();
    }
    public void imprimir(){
        for(int f=1;f<arreglo.length;f++) {
            if(buscado==arreglo[f]){
                System.out.println("Arreglo["+f+"] = "+ arreglo[f] + "<---------------Aquí está");
            }else{
                System.out.println("Arreglo["+f+"] = "+ arreglo[f]);
            }
        }
    }
    public static void main(String[]ar){
        Problema1 impresora=new Problema1();
        impresora.datos();
        impresora.imprimir();
    }

    
}
