package polimorfismoSobreposicao;

public class Peixe extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Pl�ncton");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Ricocheteio na �gua");
	}
	public void soltarBolhas() {
		System.out.println("Blu Blu");
	}
	
	

}
