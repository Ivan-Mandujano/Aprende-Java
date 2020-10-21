import java.util.Scanner;
public class Uno {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float suma=0;
		float valor;
		do {
			System.out.print("Introduzca el valor a cargar, introduzca 9999 para cerrar");
			valor= entrada.nextFloat();
			if(valor<9999) {
				suma= suma + valor;
			}
		}while(valor!=9999);
		if(suma==0) {
			System.out.print("La suma de los valores es igual a 0  ");
			System.out.print(suma);
		}
		if(suma>0) {
			System.out.print("La suma es mayor a 0  ");
			System.out.print(suma);
		}
		if(suma<0) {
			System.out.print("La suma es menor a 0  ");
			System.out.print(suma);
		}
	}

}
