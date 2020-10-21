import java.util.Scanner;

public class Problema1 {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float Num1, Num2, Num3;
		System.out.println("Introduzca sus tres numeros y te dire cual es el mayor");
		System.out.println("Introduzca el primer numero");
		Num1= entrada.nextFloat();
		System.out.println("Introduzca el segundo numero");
		Num2= entrada.nextFloat();
		System.out.println("Introduzca el tercer numero");
		Num3= entrada.nextFloat();
		if(Num1>Num2) {
			if(Num1>Num3) {
				 System.out.println(Num1);
			}else {
				System.out.println(Num3);
			}
		}else {
			if(Num2>Num3){
				System.out.println(Num2);
			} else {
				System.out.println(Num3);
			}
		}
}
}