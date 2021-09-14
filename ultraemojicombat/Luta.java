/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;
import java.util.Random;
/**
 *
 * @author User
 */
public class Luta {
         private Lutador desafiado;// tipos abstratos de dados
	  private Lutador desafiante;
	  private int rounds;
	  private boolean aprovada;
	  
	  //metodos publicos
	  public void marcarLuta(Lutador l1, Lutador l2) {
		  if (l1.getCategoria() == l2.getCategoria() && l1!=l2){
			  this.aprovada=true;
			  this.desafiado=l1;
			  this.desafiado=l2;
		  }else {
			  this.aprovada=false;
			  this.desafiado=null;
			  this.desafiado=null;
		  }
		  
	  }
	  public void Lutar() {
		  if (this.aprovada) {
			  System.out.print("#### DESAFIADO ####");
			  this.desafiado.apresentar();
			  System.out.print("#### DESAFIANTE ####");
			  this.desafiante.apresentar();
			  
			  Random ale= new Random();
			  int vencedor=ale.nextInt(3);
			  
			  switch(vencedor) {
			  case 0:// empate
				  
				  System.out.print("#### Empatou ####");
				  this.desafiado.empatarLuta();
				  this.desafiante.empatarLuta();
				  
			  case 1://desafiado vence
				  
				  System.out.print("#### Desafiante Vence ####");
				  this.desafiado.perderLuta();
				  this.desafiante.ganharLuta();
				  
			  case 2://desafiante vence
				  
				  System.out.print("#### Desafiado Vence ####");
				  this.desafiado.ganharLuta();
				  this.desafiante.perderLuta();
			  }
			  
			  
			  
		  }else {
			  System.out.print("A luta não pode acontecer!");
		  }
		  
	  }
	  //metodos especiais
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
    
}
