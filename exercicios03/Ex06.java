package exercicios03;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Ex06 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int n = 0,soma = 0, cont = 0;
			
			do {
				System.out.println("Digite um n�mero :");
				n = ler.nextInt();
				if(n %3 == 0 && n !=0)
					cont++;
					soma+=n;
		 		
			}
			while(n != 0);
				
			System.out.println("A m�dia dos n�meros m�ltiplos de 3 �:" + soma/cont);
	
		}
	
	}
