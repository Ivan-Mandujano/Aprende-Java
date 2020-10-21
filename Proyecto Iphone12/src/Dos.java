import java.util.Scanner;

public class Dos {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int cuenta;
		float saldo;
		int acreedor=0;
		do {
			System.out.print("Introduzca su numero de cuenta xfas,para salir ingrese un numero negativo");
			cuenta= entrada.nextInt();
			if(cuenta>=0) {
				System.out.println("Introduzca su saldo actual");
				saldo= entrada.nextFloat();
				System.out.print("Su cuenta es:");
				System.out.println(cuenta);
				System.out.println("Su estado de cuenta es:");
				if(saldo>0) {
					System.out.println("Usted es acreedor, felicidades");
					acreedor= acreedor + 1;
			}
				if(saldo<0) {
					System.out.println("Usted es Deudor, pague");
			}
				if(saldo==0) {
					System.out.println("Usted no tiene nada, salga de aqui");
			}
			}
		}while(cuenta>=0);
		System.out.print("El numero total de acreedores es: ");
		System.out.print(acreedor);
	}

}
