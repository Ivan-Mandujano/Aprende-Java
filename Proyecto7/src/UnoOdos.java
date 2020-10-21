import java.util.Scanner;

public class UnoOdos {
	public static void main(String []ar) {
		Scanner entrada=new Scanner(System.in);
		int Primis;
		System.out.println("Introduzca un numero entero del 1 al 99");
		Primis= entrada.nextInt();
		if(Primis<10) {
			System.out.println("El numero es de un digito");
		} else{
			System.out.println("El numero es de dos digitos");
		}
	}

}
