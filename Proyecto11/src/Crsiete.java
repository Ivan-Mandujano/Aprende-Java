import java.util.Scanner;

public class Crsiete {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int n,valor,suma;
		int positivo= 0;
		int negativo=0;
		int multiplos=0;
		suma=0;
		for(n=0;n<=10;n++) {
			System.out.print("Introduzca el valor entero");
			valor= entrada.nextInt();
			if(valor>0) {
				positivo= positivo+1;
			}
			if(valor<0) {
				negativo= negativo+1;
			}
			if(valor%15==0) {
				multiplos= multiplos +1;
			}
			if(valor%2==0) {
				suma=valor+suma;
			}
		}
		System.out.print("El numero de enteros positivos es:");
		System.out.println(positivo);
		System.out.print("El numero de enteros negativos es:");
		System.out.println(negativo);
		System.out.print("El numero de enteros multiplos de 15:");
		System.out.println(multiplos);
		System.out.print("El valor acumulado de los enteros pares");
		System.out.println(suma);


	}

}
