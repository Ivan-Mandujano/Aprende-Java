package Showcase;
import java.util.Scanner;
public class Uno{
    Scanner entrada= new Scanner(System.in);
    int V;
    public void Datos(){
        System.out.println("Introduzca la cantidad de valores que quiere introducir");
        V= entrada.nextInt();
    }
    public void Ciclo(){
        int n,numero,suma=0;
        for(n=1;n<=V;n++){
            System.out.println("Introduzca el valor numero "+n);
            numero= entrada.nextInt();
            if(numero%2==0){
                suma= suma + numero;
            }
            System.out.println("La suma de los numeros pares es "+suma);
        }
    }
    public static void main(String[]ar){
        Uno imprimir=new Uno();
        imprimir.Datos();
        imprimir.Ciclo();
    }
}