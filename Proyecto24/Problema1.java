package Proyecto24;
import java.util.Scanner;
public class Problema1 {
    private Scanner entrada;
    private String[] paises;
    private int[][] temperaturas;
    private int[] promedio;
    public void Carga(){
        entrada=new Scanner(System.in);
        paises=new String[4];
        temperaturas=new int[4][3];
        for(int n=0;n<paises.length;n++){
            System.out.print("Introduzca el nombre del pais ");
            paises[n]= entrada.next();
            for(int f=0;f<temperaturas[n].length; f++){
                System.out.print("Ingrese la temperatura del mes ");
                temperaturas[n][f]=entrada.nextInt();
            }
        }
    } 
    public void imprimir1(){
        for(int n=0;n<paises.length;n++){
            System.out.println(paises[n]);
            for(int f=0;f<temperaturas[n].length; f++){
                System.out.print("-");
                System.out.print(temperaturas[n][f]);
                System.out.print("-");
            }
            System.out.println("");
        }
    }
    public void prom(){
        promedio=new int[4];
        int prome=0;
        for(int n=0;n<4;n++){
            for(int f=0; f<temperaturas[n].length;f++){
                prome= prome + temperaturas[n][f];
            }
            promedio[n]=prome/3;
        }
    }
    public void imprimir2(){
        System.out.println("La temperatura promedio de los paises es ");
        for(int n=0;n<paises.length;n++){
            System.out.print(paises[n]);
            for(int f=0;f<3; f++){
                System.out.print("-");
                System.out.println(promedio[f]);
            }
        }
    }
    public void mayor(){
        int may=promedio[0];
        String nom=paises[0];
        for(int f=0;f<promedio.length;f++) {
            if (promedio[f]>may) {
                may=promedio[f];
                nom=paises[f];
            }
        }
        System.out.print("El pais con mayor promedio de temperatura trimestrar es "+nom + " con una temperatura promedio de "+may);
    }
    public static void main(String[]ar){
        Problema1 imp=new Problema1();
        imp.Carga();
        imp.imprimir1();
        imp.prom();
        imp.imprimir2();
        imp.mayor();
    }
}