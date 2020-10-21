import java.util.Scanner;

public class Cinco {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int x, y;
		System.out.println("Escriba las cordenadas para decirle en que cuadrante se encuentra");
		System.out.println("Escriba el valor de X");
		x= entrada.nextInt();
		System.out.println("Escriba el valor de Y");
		y= entrada.nextInt();
		if(x>0 && y>0) {
			System.out.println("Se encuentra en el primer cuadrante");
			System.out.print("(");
			System.out.print(x);
			System.out.print(",");
			System.out.print(y);
			System.out.print(")");
		} if(x<0 && y>0) {
			System.out.println("Se encuentra en el segundo cuadrante");
			System.out.print("(");
			System.out.print(x);
			System.out.print(",");
			System.out.print(y);
			System.out.print(")");
		}
		}

	}
