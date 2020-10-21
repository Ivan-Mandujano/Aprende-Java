import java.util.Scanner;

public class SuperficieCuadrado {
	public static void main (String[]ar) {
		Scanner teclado=new Scanner(System.in);
			float lado;
			float superficie;
			System.out.print("Ingrese el lado");
			lado=teclado.nextFloat();
			superficie=lado * lado;
			System.out.print("La superficie es:");
			System.out.print(superficie);
		    
	}
}
