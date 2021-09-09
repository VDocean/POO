package objetosCompostos;

public class ObjetosCompostos {
	public static void main (String []args) {
		Personagem[] p= new Personagem[2];
		p[0]= new Personagem("Mario", 25, 1.55,100);
		p[1]= new Personagem("Luigi", 31, 1.50,80);
		
		p[0].setNome("Mario");
		p[0].Saltar();
		
		p[1].setNome("Luigi");
		p[1].Saltar();
	}
	

}
