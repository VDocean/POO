package visibilidade;

public class VisMario {
	public String Profissao;
    public String reside;
    protected double altura;
    
    protected void Comportamento(){
   	 System.out.println("Profiss�o: "+this.Profissao);
   	 System.out.println("Mora em: "+ this.reside);
   	 System.out.println("Sua altura �: "+this.altura);
    }
    
    protected void SuperPoderes() {
   	 System.out.println("Super pulo!");
   	 System.out.println("For�a sobre-humana.");
   	 System.out.println("H�bil motorista");
    }
}
