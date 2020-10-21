import java.util.Scanner;

public class Dos {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float num1, num2, num3, opera;
		System.out.println("Introduzca 3 numeros");
		System.out.println("Introduzca el primer numero");
		num1= entrada.nextFloat( );
		System.out.println("Introduzca el segundo numero");
		num2= entrada.nextFloat( );
		System.out.println("Introduzca el tercer numero");
		num3= entrada.nextFloat( );
		opera= (num1 + num2) * num3;
		if(num1==num2 && num2==num3) {
			System.out.println("Los tres numeros son iguales");
			System.out.println(opera);
		} else {
			System.out.println("Los numeros son diferentes");
		}

	}

}
