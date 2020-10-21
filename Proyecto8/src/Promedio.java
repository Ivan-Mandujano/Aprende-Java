import java.util.Scanner;

public class Promedio {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float Nota1, Nota2, Nota3;
		System.out.println("Introduzca sus tres notas");
		System.out.println("Introduzca la Nota 1");
		Nota1= entrada.nextFloat();
		System.out.println("Introduzca la Nota 2");
		Nota2= entrada.nextFloat();
		System.out.println("Introduzca la Nota 3");
		Nota3= entrada.nextFloat();
		float Promedio=(Nota1 + Nota2 + Nota3) / 3;
		if(Promedio>=7) {
			System.out.println("Promocionado");
		}else{
			if(Promedio>=4) {
				System.out.println("Regular");
				} else {
					System.out.print("Reprobado, Echale ganas mijo");
				}
		}
	}
}