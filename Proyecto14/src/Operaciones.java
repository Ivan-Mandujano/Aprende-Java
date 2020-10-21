import java.util.Scanner;

public class Operaciones {
	private Scanner entrada;
	private int x,y;
	private int suma=0;
	private int resta=0;
	private int multi=0;
	private int divi=0;
	
	public void datos() {
		entrada=new Scanner(System.in);
		System.out.println("Introduzca el primer valor entero");
		x= entrada.nextInt();
		System.out.println("Introduzca el segundo valor entero");
		y= entrada.nextInt();
	}
	public void suma() {
		suma= x + y;
		System.out.println("La suma es "+suma);
	}
	public void resta() {
		resta= x - y;
		System.out.println("La resta es "+resta);
	}
	public void multiplicacion() {
		multi= x * y;
		System.out.println("La multiplicacion es "+multi);
	}
	public void division() {
		divi= x/y;
		System.out.println("La division es "+divi);
	}
	public static void main(String[]ar) {
		Operaciones orden;
		orden=new Operaciones();
		orden.datos();
		orden.suma();
		orden.resta();
		orden.multiplicacion();
		orden.division();
	}

}
