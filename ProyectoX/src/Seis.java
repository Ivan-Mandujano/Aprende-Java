import java.util.Scanner;
public class Seis {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int x= 1;
		int y= 1;
		float suma1= 0;
		float suma2= 0;
		float num1, num2;
		while(x<=15) {
			System.out.println("Introduzca los valores de la primera lista");
			num1= entrada.nextFloat();
			suma1= suma1 + num1;
			x= x+1;	
		}
		while(y<=15) {
			System.out.print("Introduzca los valores de la segunda lista");
			num2= entrada.nextFloat();
			suma2= suma2 + num2;
			y= y + 1;
		}
		if(suma1>suma2) {
			System.out.println("La primera lista es mayor");
		}
		if(suma2>suma1) {
			System.out.println("La segunda lista es mayor");
		}else{
			System.out.println("Las listas son iguales");
		}
	}
}
