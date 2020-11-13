package Proyecto25;
import java.util.Scanner;
public class Problema2 {
    private Scanner entrada;
    private String[] nombre;
    private int[][] falta;
    private int[][] suma;
    public void Cargar(){
        entrada=new Scanner(System.in);
        nombre=new String[3];
        for(int a=0; a<nombre.length;a++){
            nombre[a]=entrada.next();
        }
        falta=new int[3][];
        for(int f=0;f<falta.length;f++){
            System.out.print("Introduzca la cantidad de dias que falto el empleado");
            int e = entrada.nextInt();
            falta[f]=new int[e];
            for(int c=0;c<falta[e].length;c++){
                System.out.print("Introduzca el dia en que falto");
                falta[f][c]=entrada.nextInt();
            }
        }
    }
    public void imprimir(){
        for(int f=0;f<falta.length;f++){
            System.out.print(nombre[f]+" falto " +falta[f].length);
            System.out.println();
        }
        }
    public static void main(String[]ar){
        Problema2 imp=new Problema2();
        imp.Cargar();
        imp.imprimir();
    }
}
