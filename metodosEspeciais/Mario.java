package metodosEspeciais;

public class Mario {
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
     // metodo contrutor
     /*public Mario() {
    	 this.Nome="Mario  Bros";
    	 this.Idade= 40;
    	 this.Altura= 1.5;
         this.Estamina= 100;   	 
     }*/
      
   public Mario(String n, int i, double a, int e) {
	   this.Nome=n;
	   this.Idade=i;
	   this.Altura=a;
	   this.Estamina=e;
   }
   public void Status() {
	   System.out.println("O  estado atual do jogo é:");
	   System.out.println("Nome: "+ this.Nome);
	   System.out.println("Idade: "+ this.Idade);
	   System.out.println("Altura: "+this.Altura);
	   System.out.println("Estamina: "+this.Estamina);
   }

}

