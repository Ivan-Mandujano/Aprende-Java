import java.util.Scanner;

public class Seis {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		float salario, antiguedad;
		System.out.println("Introduzca su salario");
		salario= entrada.nextFloat();
		System.out.println("Introduzca su antiguedad en esta empresa");
		antiguedad= entrada.nextFloat();
		float cinco, veinte;
		veinte= (float) (salario * .20 + salario);
		cinco= (float) (salario * .05 + salario);
		if(salario<500 && antiguedad>=10) {
		System.out.println("Le otorgaremos un aumento del 20%");
		System.out.println(veinte);
	}else {
		if(salario<500 && antiguedad<10){
			System.out.println("Le otorgaremos un aumento del 5%");
			System.out.print(cinco);
		} else{
			if(salario>500) {
				System.out.println("Su salario es el adecuado");
				System.out.print(cinco);
		}
	}
	
}
}
}