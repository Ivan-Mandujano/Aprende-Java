package Proyecto 21;
import java.util.Scanner;
public class Problema{
    private Scanner entrada;
    private String[]paises;
    private int[]habitantes;
    public void datos(){
        entrada=new Scanner(System.in);
        paises=new String[6];
        habitantes=new int[6];
        for(int n=1;n<=5;n++){
            System.out.println("Introduzca el pais numero "+n);
            paises[n]= entrada.next();
            System.out.println("Introduzca su poblacion");
            habitantes[n]= entrada.nextInt();
        }
}
    public void ordenar(){
        for(int n=1;n<6;n++){
            for(int f=1;f<6-1;f++){
                if(paises[f].compareTo(paises[f+1])>0){
                    String auxpais;
                    auxpais=paises[f];
                    paises[f]=paises[f+1];
                    paises[f+1]=auxpais;
                    int auxpoblacion;
                    auxpoblacion= habitantes[f];
                    habitantes[f]= habitantes[f+1];
                    habitantes[f+1]= auxpoblacion;
                }
            }
        }
        }
    public void imprimir1(){
        System.out.println("Los paises ordenados alfabeticamente");
        for(int n=1; n<6;n++){
            System.out.println(paises[n] + " - " + habitantes[n]);
        }
                }
    public void ordenar2(){
        for(int h=1;h<6;h++){
            for(int a=1;a<6-1;a++){
                if(habitantes[a]<habitantes[a+1]){
                    int auxhabi;
                    auxhabi=habitantes[a];
                    habitantes[a]=habitantes[a+1];
                    habitantes[a+1]=auxhabi;
                    String auxpaises;
                    auxpaises= paises[a];
                    paises[a]= paises[a+1];
                    paises[a+1]= auxpaises;
                    }
                }
            }
        }
    public void imprimir2(){
        System.out.println("Los paises ordenados por habitantes de mayor a menor");
        for(int n=1; n<6;n++){
            System.out.println(paises[n] + " - " + habitantes[n]);
        }
    }
    public static void main(String[]ar){
        Problema imprimir=new Problema();
        imprimir.datos();
        imprimir.ordenar();
        imprimir.imprimir1();
        imprimir.ordenar2();
        imprimir.imprimir2(); 
    }
}