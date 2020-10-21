import java.util.Scanner;
public class Positivo {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float Numero;
		System.out.println("Introduzca un numero");
		Numero= entrada.nextFloat();
		if(Numero>=1) {
			System.out.println("El numero es positivo");
		}if(Numero<=-1) {
			System.out.println("El numero es negativo");
		}
		if(Numero==0){
			System.out.println("El numero es nulo");
		}
	}
	

}
