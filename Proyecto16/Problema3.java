package Proyecto16;
import java.util.Scanner;
public class Problema3 {
    private Scanner entrada;
    private float[] A;
    private float[] B;
    private float prom1,prom2;
    public void Entrada(){
         entrada= new Scanner(System.in);
         A=new float[6];
         B=new float[6];
         for(int n=1; n<=5; n++){
             System.out.print("Introduzca la calificacion "+n);
             System.out.println("Grupo A");
             A[n]= entrada.nextFloat();
         }
         for(int f=1;f<=5;f++){
             System.out.print("Introduzca la calificacion "+f);
             System.out.println("Del gurpo B");
             B[f]= entrada.nextFloat();
         }
    }
    public void Promedio(){
        prom1=0;
        prom2=0;
        for(int n=1; n<=5;n++){
            prom1= (A[n] + prom1)/5;
            prom2= (B[n] + prom2)/5;
        }
        if(prom1>prom2){
            System.out.println("El promedio del grupo A es mayor que el B "+prom1);
        }else{
            System.out.println("El promedio del grupo B es mayor que el del grupo A "+prom2);
        }
    }
    public static void main(String[]ar){
        Problema3 Imprimir=new Problema3();
        Imprimir.Entrada();
        Imprimir.Promedio();
    }
}
