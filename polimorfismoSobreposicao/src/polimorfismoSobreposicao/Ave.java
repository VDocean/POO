package polimorfismoSobreposicao;

public class Ave extends Animal {
private String corPena;


public String getCorPena() {
	return corPena;
}


public void setCorPena(String corPena) {
	this.corPena = corPena;
}


public void fazerNinho() {
	System.out.println("Fazendo ninho");
}


@Override
public void locomover() {
	// TODO Auto-generated method stub
	System.out.println("Voando");
}


@Override
public void alimentar() {
	// TODO Auto-generated method stub
	System.out.println("Onívora");
}


@Override
public void emitirSom() {
	// TODO Auto-generated method stub
	System.out.println("Canto");
}
}
