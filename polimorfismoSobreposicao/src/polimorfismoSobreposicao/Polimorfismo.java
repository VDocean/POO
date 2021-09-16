package polimorfismoSobreposicao;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mamifero m= new Mamifero();
     Reptil r= new Reptil();
     Peixe p= new Peixe();
     Ave a= new Ave();
     
     // mesmo metodo,com diferentes respostas para diferentes objetos >> polimorfismo
     m.locomover();
     r.locomover();
     p.locomover();
     a.locomover();
     
     Canguru can=new  Canguru();
     Cachorro dog= new Cachorro();
     Cobra snake= new Cobra();
     Tartaruga turtle=new Tartaruga();
     Goldfish pei= new  Goldfish();
     Arara azul=new Arara();
     
     can.locomover();
     can.emitirSom();
     dog.emitirSom();
     
	}

}
