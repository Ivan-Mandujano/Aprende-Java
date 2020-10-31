package Proyecto16;
import java.util.Scanner;
public class Problema4 {
    private Scanner entrada;
    private float[] arreglo;
    
    public void Entrada(){
        System.out.println("Introduzca los siguientes 10 elementos y le dire si estan acomodados de menor a mayor");
        arreglo=new float[11];
        for(int n=1;n<=10;n++){
            System.out.println("Introduzca el elemento numero "+n);

        }
    }
    public void Condicional(){
        int orden=1;
        for(int n=0; n<=10;n++){
            if(arreglo[n+1]<arreglo[n]){
                orden=0;
            }
        }
        if(orden==1){
            System.out.println("Esta ordenado de menor a mayor");
        }else{
            System.out.println("No esta ordenado de menor a mayor");
        }
    }
    public static void main(String[]ar){
        Problema4 imprimir=new Problema4();
        imprimir.Entrada();
        imprimir.Condicional();
    }

}
