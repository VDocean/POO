package polimorfismoSobrecarga;
// sobrecarga>> assinaturas diferentes( numeros de parametros diversos e tipos diversos) e repeticao do
// metodo na mesma classe.

public class Sobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mamifero m= new Mamifero();
      Lobo l= new Lobo();
      Cachorro c= new Cachorro();
      // ate aqui eh sobreposicao
      m.emitirSom();
      l.emitirSom();
      c.emitirSom();
      
      //Sobrecarga: diferentes assinaturas para o objeto cachorro
      
      c.reagir("Cheguei");
      c.reagir(18,30);
      c.reagir(true);
      c.reagir(2,10);

      
      
      
	}

}
