import java.util.Scanner;

public class SumayProducto {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int Numero1;
		int Numero2;
		int Suma;
		int Producto;
		System.out.println("Introduzca dos numeros enteros");
		System.out.print("Introduzca el primer numero");
		Numero1= entrada.nextInt();
		System.out.print("Introduzca el segundo numero");
		Numero2= entrada.nextInt();
		Suma= Numero1 + Numero2;
		System.out.println("La suma de los dos numeros es:");
		System.out.println(Suma);
		Producto= Numero1 * Numero2;
		System.out.println("El producto de los dos numeros es:");
		System.out.println(Producto);


	}

}
