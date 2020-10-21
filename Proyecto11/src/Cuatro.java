import java.util.Scanner;

public class Cuatro {
	public static void main(String[]ar) {
	Scanner entrada=new Scanner(System.in);
	int suma, f, num;
	System.out.print("Introduzca un numero del 1 al 10");
	num= entrada.nextInt();
	suma=num;
	if(num<=10 && num>=1) {
		for(f=1;f<=12;f++) {
		System.out.print(suma);
		System.out.print("-");
		suma= suma + num;
	}

}

}
}