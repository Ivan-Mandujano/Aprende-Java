import java.util.Scanner;

public class Seis {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int n,x,y,f,uno, dos, tres, cuatro;
		uno=0;
		dos=0;
		tres=0;
		cuatro=0;
		System.out.print("Ingrese el numero de pares de coordenadas");
		n= entrada.nextInt();
		for(f=1;f<=n;f++) {
			System.out.print("Introduzca el valor de X");
			x= entrada.nextInt();
			System.out.print("Introduzca el valor de Y");
			y= entrada.nextInt();
			System.out.print("(");
			System.out.print(x);
			System.out.print(",");
			System.out.print(y);
			System.out.println(")");
			if(x<0 && y>0) {
				uno= uno + 1;
			}
			if(x<0 && y<0) {
				dos= dos + 1;
			}
			if(x>0 && y>0) {
				tres= tres+1;
			}
			if(x>0 && y<0) {
				cuatro= cuatro+1;
			}
		}
		System.out.print("En el primer cuadrante son:");
		System.out.println(uno);
		System.out.print("En el segundo cuadrante son:");
		System.out.println(tres);
		System.out.print("En el tercer cuadrante son:");
		System.out.println(dos);
		System.out.print("En el cuarto cuadrante son:");
		System.out.println(cuatro);

	}

}
