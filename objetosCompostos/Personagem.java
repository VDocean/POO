package objetosCompostos;

public class Personagem {
	
	     private String Nome;
	     private int Idade;
	     private double Altura;
	     private int Estamina;
	     
	     //metodos getters e setters
	     
	     public String getNome() {
	    	 return Nome;
	     }
	     public void setNome(String n) {
	    	 this.Nome=n;
	     }
	     public int getIdade() {
	    	 return Idade;
	     }
	     public void setIdade(int i) {
	    	 this.Idade=i;
	     }
	     public double getAltura() {
	    	 return Altura;
	     }
	     public void setAltura(double a) {
	    	 this.Altura=a;
	     }
	     public int getEstamina() {
	    	 return Estamina;
	     }
	     public void setEstamina(int e) {
	    	 this.Estamina=e;
	     }
	      
	public void Status() {
		   System.out.println("O  estado atual do jogo é:");
		   System.out.println("Nome: "+ this.Nome);
		   System.out.println("Idade: "+ this.Idade);
		   System.out.println("Altura: "+this.Altura);
		   System.out.println("Estamina: "+this.Estamina);
	   }
       public Personagem(String no, int id, double al, int es) {
		this.Nome = no;
		this.Idade = id;
		this.Altura = al;
		this.Estamina = es;
	}
	public void Saltar() {
    	   if(this.Nome=="Mario") {
    		   System.out.println("Pulo de: "+ getAltura()*0.5);
    	   }else {
    		   System.out.println("Pulo de: "+ getAltura()*2);
    	   }
       }
	}


