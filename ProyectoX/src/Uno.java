import java.util.Scanner;

public class Uno {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float n, nota;
		int u, d;
		System.out.println("Introduzca las 10 notas de sus alumnos del 1 al 10");
		n=1;
		u=0;
		d=0;
		while(10>=n) {
			System.out.println("Ingrese la nota del alumno");
			nota= entrada.nextFloat();
			if(7<=nota){
				u= u + 1;
			}else {
				if(7>nota) {
				d= d + 1;
				}
			}
			n= n + 1;
		}
		System.out.print("El numero de estudiantes que obtuvieron un puntaje mayor o igual a 7 son:");
		System.out.println(u);
		System.out.print("El numero de estudiantes que obtuvieron menos de 7 son:");
		System.out.print(d);
	}

}
