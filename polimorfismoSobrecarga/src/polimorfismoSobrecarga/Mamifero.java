package polimorfismoSobrecarga;

public class Mamifero extends Animal{
	protected String corPelo;
	
	@Override
	public void emitirSom() {
		System.out.println("Emitir som de mamífero");
		
	}

}
