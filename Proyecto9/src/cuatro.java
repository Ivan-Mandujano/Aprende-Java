import java.util.Scanner;

public class cuatro {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float num1, num2, num3;
		System.out.println("Ingrese tres numeros y le dire si alguno es menor a diez");
		System.out.println("Ingrese el primer valor");
		num1= entrada.nextFloat();
		System.out.println("Ingrese el segundo valor");
		num2= entrada.nextFloat();
		System.out.println("Ingrese el tercer valor");
		num3= entrada.nextFloat();
		if(num1<10 || num2<10 || num3<10) {
			System.out.println("Un numero es menor que diez");
		} else {
			System.out.println("Ningun numero es menor a diez");
		}
	}

}
