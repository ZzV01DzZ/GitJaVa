package exercicios04;
/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		double [] vetor = new double[5];
		
		double maior=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.print("Qual o " + (i+1) + "� valor? ");
			vetor[i] = entrada.nextDouble();
			if (vetor[i]>maior){
        		maior=vetor[i];
			}
		}
		System.out.println( "Os valores apresentados foram: ");
		for(int i=0; i<5; i++){
			System.out.print( "| "+ vetor[i] +" |");
		}
		
		System.out.println("\nO maior valor � "+ maior);
	}
}