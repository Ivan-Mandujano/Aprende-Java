import java.util.Scanner;

public class CrSiete {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int n;
		int x=1;
		int uno;
		int i=0;
		int e=0;
		System.out.println("Introduzca el numero de numeros enteros");
		n= entrada.nextInt();
		while(n>=x) {
			System.out.println("Introduzca el numero entero");
			uno= entrada.nextInt();
			if(uno%2==0) {
				i= i+1;
			}else {
				e= e + 1;
			}
			x= x + 1;
			
		}
		System.out.print("El numero de valores pares es ");
		System.out.println(i);
		System.out.print("El numero de valores impares es ");
		System.out.println(e);
	}

}
