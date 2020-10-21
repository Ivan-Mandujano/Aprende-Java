import java.util.Scanner;

public class Problema1 {
		public static void main(String[]ar) {
			Scanner entrada=new Scanner(System.in);
			float Numero1, Numero2, Suma, Diferencia, Producto, Division;
			System.out.println("Introduzca dos numeros");
			System.out.println("Introduzca el primer numero:");
			Numero1= entrada.nextFloat();
			System.out.println("Introduzca el segundo numero:");
			Numero2= entrada.nextFloat();
			Suma= Numero1 + Numero2;
			Diferencia= Numero1 - Numero2;
			Producto= Numero1 * Numero2;
			Division= Numero1 / Numero2;
			if(Numero1>Numero2) {
				System.out.println(Suma);
				System.out.println(Diferencia);
			} 
			if(Numero1<Numero2) {
				System.out.println(Producto);
				System.out.println(Division);
			}
			if(Numero1==Numero2) {
				System.out.print("Los numeros son iguales");
			}
		}

	}
