import java.util.Scanner;
public class EstructuraCondicionalSimple {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float Sueldo;
		System.out.print("Introduzca su salario");
		Sueldo= entrada.nextFloat();
		if(Sueldo>3000){
			System.out.print("Toca darle dinero al SAT");
		}
		
	}

}
