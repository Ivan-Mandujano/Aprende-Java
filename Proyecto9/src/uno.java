import java.util.Scanner;

public class uno {
public static void main(String[]ar) {
	Scanner entrada=new Scanner(System.in);
	int dia, mes, año;
	System.out.println("Introduzca una fecha y le dire si ya es navidad");
	System.out.println("Introduzca el dia");
	dia= entrada.nextInt( );
	System.out.println("Introduzca el mes en numeros");
	mes= entrada.nextInt( );
	System.out.println("Introduzca el año");
	año= entrada.nextInt( );
	if(dia==25 && mes==12) {
		System.out.println("Es navidad :D");
	}
	else {
		System.out.print("No es navidad :c");
	}
	



}
}
