package exercicios02;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n= 0;
		
		System.out.println("Entre com um n�mero qualquer: ");
		n = leia.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n+ " � par e sua raiz quadrada �: " + Math.sqrt(n));
		}
		
		else {
			System.out.println(n+ " � impar e " + n + " elevado ao quadrado �: " + Math.pow(n,2));
		}
	}

}
