import java.util.Scanner;

public class TresCifras {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int Num1;
		System.out.println("Introduzca un numero entero");
		Num1= entrada.nextInt();
		if(Num1>=10) {
			if(Num1>=100) {
				if(Num1>=1000) {
					System.out.println("Erroooooor mas de 3 cifras");
				}else {
					System.out.println("Tiene tres cifras");
				}
			}else {
				System.out.println("El numero es de dos cifras");
			}
		}else {
			System.out.println("El numero es de una cifra");
		}
	}

}
