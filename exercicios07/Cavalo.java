package exercicios07;

public class Cavalo extends AnimaisClasse implements AnimaisInterface  {

	@Override
	public void nome(String nome) {
		System.out.println("O nome do cavalo �: " + nome);
	}

	@Override
	public void idade(int idade) {
		System.out.println("O cavalo tem: "+ idade+ " anos.");
	}

	@Override
	public void emitirSom() {
		System.out.println("O som do Cavalo �: ihihihihi!! " );
	}

	@Override
	public void correr() {
		System.out.println("O cavalo est� correndo...");
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		super.subir();
	}
	
	
}
