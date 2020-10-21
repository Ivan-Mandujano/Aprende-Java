import java.util.Scanner;
public class Empleado {
	private Scanner entrada;
	private float sueldo;
	private String nombre;
	
	public void datos() {
		entrada=new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado");
		nombre= entrada.next();
		System.out.println("Ingrese el sueldo del empleado "+nombre);
		sueldo= entrada.nextFloat();
	}
	public void imprimir() {
		System.out.println("El nombre del empleado es "+nombre);
		System.out.println("Su salario es "+sueldo);
	}
	public void condicion() {
		if(sueldo>3000) {
			System.out.println("El empleado debe de pagar impuestos");
		}else {
			System.out.println("El empleado no debe de pagar impuestos");
		}
	}
	public static void main(String[]ar) {
		Empleado orden;
		orden=new Empleado();
		orden.datos();
		orden.imprimir();
		orden.condicion();
	}

}
