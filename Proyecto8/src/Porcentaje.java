import java.util.Scanner;

public class Porcentaje {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float Preguntas,Correcto,Promedio;
		System.out.println("Ingrese la cantidad de preguntas a contestar");
		Preguntas= entrada.nextFloat();
		System.out.println("Ingrese la cantidad de preguntas contestadas correctamente");
		Correcto= entrada.nextFloat();
		Promedio= (Preguntas * Correcto) / 100;
		if(Promedio>=75) {
			if(Promedio>=90) {
				System.out.println(Promedio);
				System.out.println("Nivel maximo");
			} else {
				System.out.println(Promedio);
				System.out.println("Nivel medio");
			}
		}else {
			if(Promedio>=50) {
				System.out.println(Promedio);
				System.out.println("Nivel regular");
			}else {
				System.out.println(Promedio);
				System.out.println("Fuera de nivel");
			}
		}
		if(Correcto>Preguntas) {
			System.out.println("Creo que eso no es posible");
		}
	}

}
