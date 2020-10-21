import java.util.Scanner;

public class tres {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int empleados,x,y,z;
		float sueldo,total;
		System.out.println("Introduzca el numero de empleados para medir su salario");
		empleados= entrada.nextInt();
		z= 1; 
		total=0;
		x=0;
		y=0;
		while(empleados>=z) {
			System.out.println("Introduzca el salario del empleado");
			sueldo= entrada.nextFloat();
			z= z + 1;
			if(sueldo>=100 && 500>=sueldo) {
				total= total + sueldo;
				if(sueldo>300){
					y= y + 1;
				}
				if(sueldo>=100 && sueldo<=300){
					x= x + 1;
				}
			}else {
				System.out.println("Eres un mentiroso");
			}
		}
		System.out.print("El numero de trabajadores que ganan entre 100 y 300 es ");
		System.out.println(x);
		System.out.print("El numero de trabajadores que ganan mas de 300 es ");
		System.out.println(y);
		System.out.print("Los gastos de la empresa en sueldos al personal es ");
		System.out.print(total);


	}

}
