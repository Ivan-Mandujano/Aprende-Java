import java.util.Scanner;

public class dos {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int personas, x;
		float estatura, promedio, suma;
		System.out.println("Introduzca el numero de personas a medir");
		personas= entrada.nextInt();
		x=1;
		suma= 0;
		while(personas>=x) {
			System.out.println("Introduzca la estatura de las personas");
			estatura= entrada.nextFloat();
			suma= suma + estatura;
			x= x+1;
		}
		promedio= suma / personas;
		System.out.print("El promedio de las estaturas es: ");
		System.out.print(promedio);
	}

}
