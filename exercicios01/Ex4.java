package exercicios01;
/*  4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D = (R+S)/2, onde R = (A+B)� e S = (B+C)�
*/  
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int a, b, c, r, s;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("valor de a: ");
		a = leia.nextInt();
		
		System.out.println("valor de b: ");
		b = leia.nextInt();
		
		System.out.println("valor de c: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r + s) / 2;
		
		System.out.println("O valor de D �: " + d);
		
		leia.close();

	}

}
