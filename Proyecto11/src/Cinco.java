import java.util.Scanner;
public class Cinco {
	public static void main(String[]ar) {
		Scanner entrada=new Scanner(System.in);
		int n, s,l,l1,l2,l3, suma, esca, isos, equi;
		System.out.println("Ingrese el numero de triangulos a calcular");
		n= entrada.nextInt();
		esca= 0;
		isos= 0;
		equi= 0;
		for(s=1;s<=n;s++) {
			System.out.print("Ingrese el primer lado del triangulo");
			l1= entrada.nextInt();
			System.out.print("Ingrese el segundo lado del triangulo");
			l2= entrada.nextInt();
			System.out.print("Ingrese el tercer lado del triangulo");
			l3= entrada.nextInt();
			if(l1==l2 || l1==l3 || l2==l3) {
				if(l2==l3 && l1==l2) {
					equi= equi + 1;
				}else {
					isos= isos + 1;
				}
			}else {
				esca= esca + 1;
			}


		}
		System.out.print("cantidad de triangulos equilateros es:");
		System.out.println(equi);
		System.out.print("cantidad de triangulos isosceles es:");
		System.out.println(isos);
		System.out.print("cantidad de triangulos escalenos:");
		System.out.println(esca);
		System.out.print("El tipo de triangulo con menor cantidad es:");
		if(equi>isos || equi>esca) {
			if(isos>esca) {
				System.out.print("El triangulo escaleno es el de menor cantidad");
			}else {
				System.out.print("El triangulo isoseles es el de menor cantidad");
			}
		}else {
			System.out.print("El triangulo equilatero es el de menor cantidad");
		}

	}

}
