import java.util.Scanner;

public class Dos {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int n;
		float num,suma;
		suma=0;
		for(n=1;n<=10;n++) {
			System.out.println("Introduzca el numero");
			num= entrada.nextFloat();
			if(n>5) {
				suma= suma + num;
			}
		}
		System.out.print("La suma de los ultimos 5 numeros es ");
		System.out.print(suma);
	}
}