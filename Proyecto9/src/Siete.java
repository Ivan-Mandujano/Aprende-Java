import java.util.Scanner;

public class Siete {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float a, b, c;
		System.out.println("Introduzca tres numeros para obtener la varianza");
		System.out.println("Introduzca el primer numero");
		a= entrada.nextFloat();
		System.out.println("Introduzca el segundo numero");
		b= entrada.nextFloat();
		System.out.println("Introduzca el tercer numero");
		c= entrada.nextFloat();
		if(a>b && a>c) {
			if(b>c) {
				System.out.print("La varianza es ");
				System.out.print(a - c);
			}else {
				System.out.print("La varianza es ");
				System.out.print(a - b);
			}
		}else {
			if(b>c) {
				System.out.print("La varianza es ");
				System.out.print(b - a);
			}else {
				System.out.print("La varianza es ");
				System.out.print(c - a);
			}
		}
}
}
