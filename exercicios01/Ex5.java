package exercicios01;

import java.util.Scanner;

/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
public class Ex5 {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite a nota 2: ");
		n2 = leia.nextInt();

		System.out.println("Digite a nota 3: ");
		n3 = leia.nextInt();

		media = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("M�dia final: " + media);
		
		leia.close();
	
	}

}
