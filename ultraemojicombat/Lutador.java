/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author User
 */
public class Lutador {
    //Atributos
		private String nome;
		private String nacionalidade;
		private int idade;
		private double altura;
		private double peso;
		private String categoria;
		private int vitorias;
		private int derrotas;
		private int empates;
	//Metodos publicos
		public void apresentar() {
			System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR "+this.getNome());
			System.out.println("Diretamente de "+this.getNacionalidade());
			System.out.println("com "+this.getIdade()+" anos e "+this.getAltura());
			System.out.println("Pesando "+this.getPeso()+" Kg");
			System.out.println(this.getVitorias()+" vitorias");
			System.out.println(this.getDerrotas()+" derrotas");
			System.out.println(this.getEmpates()+" empates");
		}
	    public void status() {
			System.out.println(this.getNome()+ " é um peso "+ this.getCategoria());
			System.out.println("Ganhou "+this.getVitorias()+" vezes");
			System.out.println("Perdeu "+this.getDerrotas()+" vezes");
			System.out.println("Empatou "+this.getEmpates()+" vezes");
		}
	    public void ganharLuta() {
			this.setVitorias(getVitorias()+1);
		}
	    public void perderLuta() {
	    	this.setDerrotas(getDerrotas() + 1);
		}
	    public void empatarLuta() {
			this.setEmpates(getEmpates()+1);
		}
	//Metodos especiais
	    /*contrutor*/
		public Lutador(String no, String na, int id, double al, double pe, int vi, int de,
				int em) {
			super();
			this.nome = no;
			this.nacionalidade = na;
			this.idade = id;
			this.altura = al;
			this.peso = pe;
			this.vitorias = vi;
			this.derrotas = de;
			this.empates = em;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
			setCategoria();
		}
		public String getCategoria() {
			return categoria;
		}
		private void setCategoria() {
		 if (this.peso<52.2) {
			 this.categoria="Inválido";
		 }else if(this.peso <=70.3){
			 this.categoria="Leve";
		 }else if(this.peso <=83.9) {
			 this.categoria="Medio";
		 }else if(this.peso <=83.9) {
			 this.categoria="Pesado";
		 }else {
			 this.categoria="Inválido";
		 }
		}
			 
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}
}
