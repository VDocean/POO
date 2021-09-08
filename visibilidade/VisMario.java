package visibilidade;

public class VisMario {
	public String Profissao;
    public String reside;
    protected double altura;
    
    protected void Comportamento(){
   	 System.out.println("Profissão: "+this.Profissao);
   	 System.out.println("Mora em: "+ this.reside);
   	 System.out.println("Sua altura é: "+this.altura);
    }
    
    protected void SuperPoderes() {
   	 System.out.println("Super pulo!");
   	 System.out.println("Força sobre-humana.");
   	 System.out.println("Hábil motorista");
    }
}
