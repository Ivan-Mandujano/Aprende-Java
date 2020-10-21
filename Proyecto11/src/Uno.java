import java.util.Scanner;

public class Uno {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int n,f,t;
		float h,b,s;
		System.out.println("Ingrese la cantidad de triangulos a calcular");
		n= entrada.nextInt();
		t=0;
		for(f=1; f<=n;f++) {
			System.out.println("Ingrese la medida de la base");
			b= entrada.nextFloat();
			System.out.println("Ingrese la medida de su altura");
			h= entrada.nextFloat();
			s= (b*h) / 2;
			System.out.print("Las medidas del triangulo ");
			System.out.println(f);
			System.out.print("La medida de la base es ");
			System.out.println(b);
			System.out.print("La medida de la altura es");
			System.out.println(h);
			System.out.print("La superficie es ");
			System.out.println(s);
			if(s>12) {
				t= t+1;
			}
		}
		System.out.print("La cantidad de triangulos cuya superficie es mayor a 12 es ");
		System.out.println(t);
	}

}
