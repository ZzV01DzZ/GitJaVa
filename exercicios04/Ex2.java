package exercicios04;

import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
public class Ex2 {

	public static void main(String[] args) {
		int [] lancamento = new int[10];
		int maior= 0, ocr= 0;
		float soma=0, cont=00;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero entre 1 e 6\n");
		
			for (int i = 0 ; i<10; i++){
				System.out.println ((i+1) + "� lan�amento: ");
				lancamento[i] = entrada.nextInt();
					while(lancamento[i] < 1 || lancamento[i]>6) {
						System.out.println (" N�mero invalido!!!\n");
						System.out.println ((i+1)+ "� lan�amento: ");
						lancamento[i] = entrada.nextInt();
					}
					soma +=lancamento[i]; 
					if(lancamento[i] > maior){
						maior = lancamento[i];
					}
				cont++;
			}
			for(int i=0; i<10; i++){
				if(lancamento[i] == maior){
		               ocr++;	
					}
			}
			System.out.println ("\nO valor da m�dia � "+ (soma/cont));
			System.out.println ("\nO maior valor foi " + maior + " e ocorreu " + ocr +" vezes");
	}
}