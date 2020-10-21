import java.util.Scanner;

public class Ochopinocho {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int edad,f;
		int suma1=0;
		int suma2=0;
		int suma3=0;
		int promedio1= 0;
		int promedio2=0;
		int promedio3=0;
		for(f=1;f<=50;f++) {
			System.out.println("Ingrese la edad del alumno del turno matutino");
			edad= entrada.nextInt();
			suma1= suma1 + edad;
		}
		for(f=1;f<=60;f++) {
			System.out.println("Ingrese la edad del alumno del turno tarde");
			edad= entrada.nextInt();
			suma2= suma2 + edad;
		}
		for(f=1;f<=110;f++) {
			System.out.println("Ingrese la edad del alumno del turno noche");
			edad= entrada.nextInt();
			suma3= suma3 + edad;
		}
		promedio1= suma1/50;
		promedio2= suma2/60;
		promedio3= suma3/110;
		System.out.print("El promedio del turno matutino es:");
		System.out.println(promedio1);
		System.out.print("El promedio del turno de la tarde es:");
		System.out.println(promedio2);
		System.out.print("El promedio del turno de la noche es:");
		System.out.println(promedio3);
		if(promedio1>promedio2 || promedio1>promedio3) {
			if(promedio2>promedio3) {
				System.out.print("El promedio menor es el turno de la noche");
			}else {
				System.out.print("El promedio menor es el turno de la tarde");
			}
		}else {
			System.out.print("El promedio menor es el turno matutino");
		}
	}

}
