package exercicios03;
/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
		int n, par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++){
			System.out.println("Digite o " + i + "� n�mero: ");
			n = ler.nextInt();
			
			if(n % 2 == 0){
                par++;
			}
			else {
				impar++;
			}
		}

		System.out.println("Existem " + par + " n�meros pares e " + impar + " n�meros impares." );
	}

}
