package exercicios03;

import java.util.Scanner;

/*4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas;
o n�mero de mulheres nervosas;
o n�mero de homens agressivos;
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.*/
public class Ex4 {

	public static void main(String[] args) {
		int pessoa = 0, idade; 
		int feminino = 0, masculino = 0, outros = 0, sexo;
		int temper, calmo = 0, nervoso = 0, agressivo = 0;
		int mn=0, ha = 0, oc =0, qr = 0, nov =0;
		
		Scanner leia = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		Scanner ler2 = new Scanner(System.in);
		while
			(pessoa < 5) { //150 pessoas*
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Qual seu sexo?\n Digite:\n 1-Feminino \n 2-Masculino \n 3-Outros");
			sexo = ler.nextInt();
			
			if ( sexo == 1 ) {
				feminino++;
            }  
            else if (sexo == 2) { 
				masculino++;
			}  
			else if (sexo == 3) {
				outros++;
			}
			
			System.out.println("voc� se considera uma pessoa: \n Digite:\n 1-Calma \n 2-Nervosa \n 3-Agressiva");
			temper = ler2.nextInt();
			
			if ( temper == 1 ) {
				calmo++;
            }  
            else if (temper == 2) { 
				nervoso++;
			}  
			else if (temper == 3) {
				agressivo++;	
				
			
			if(sexo == 1 && temper ==2) {
				mn++;}
			if(sexo == 2 && temper ==3) {
				ha++;}
			if(sexo == 3  && temper ==1) {
				oc++;}
			if(idade > 40 && temper ==2) {
				qr++;}
			if(idade < 18 && temper ==1) {
				nov++;}
			
		}
			pessoa++;
					
	}
		System.out.println("N�mero de pessoas calmas: " + calmo);
		System.out.println("N�mero de mulheres nervosas: " + mn);
		System.out.println("N�mero de homens agressivos: " + ha);
		System.out.println("N�mero de outros calmos: " + oc);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + qr);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + nov);
}
}