package exercicios07;

public class Preguica extends AnimaisClasse implements AnimaisInterface {

	@Override
	public void nome(String nome) {
		System.out.println("O nome do cavalo �: " + nome);
	}

	@Override
	public void idade(int idade) {
		System.out.println("A pregui�a tem: "+ idade+ " anos.");
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da Pregui�a �: zzzzzzZZ " );

	}

	@Override
	public void correr() {
		super.correr();
	}

	@Override
	public void subir() {
		super.subir();
		System.out.println("A pregui�a est� subindo a �rvore...");
	}
	

}
