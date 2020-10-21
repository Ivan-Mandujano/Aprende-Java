import java.util.Scanner;
import java.util.scanner;

public class DosNumeros {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float Numero1, Numero2;
		System.out.println("Introduzca dos numeros para ver cual numero es mayor");
		System.out.println("Introduzca el primer numero:");
		Numero1= entrada.nextFloat();
		System.out.println("Introduzca el segundo numero:");
		Numero2= entrada.nextFloat();
		if(Numero1>Numero2) {
			System.out.println(Numero1);
		} else {
			System.out.println(Numero2);
		}
		if(Numero1==Numero2) {
			System.out.print("Los numeros son iguales");
		}
	}

}
