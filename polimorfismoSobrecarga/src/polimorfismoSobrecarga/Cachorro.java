package polimorfismoSobrecarga;

public class Cachorro extends Lobo {
@Override
 public void emitirSom() {
	 System.out.println("Au, au,au!");
 }
	 //Sobrecarga
	 public void reagir (String frase) {
		 if (frase=="Toma comida" || frase=="Cheguei") {
			 System.out.println("Abanar o rabo");
			 
		 }else {
			 System.out.println("rosnar");
		 }
	 }
	 
	 public void reagir(int hora, int min) {
		 if (hora<12) {
			 System.out.println("abanar");
		 }else if (hora>=18) {
			 System.out.println("ignorar");
		 }else {
			 System.out.println("abanar e latir");
		 }
	 }
	 
	 public void reagir(boolean tutor) {
		 if (tutor) {
			 System.out.println("cachorro feliz");
		 }else {
			 System.out.println("cachorro com raiva");
		 }
	 }
	 public void reagir(int idade, float peso) {
		 if (idade<5) {
			 if (peso<10) {
				 System.out.println("Abanar");
			 }else {
					 System.out.println("Latir");
				 }
			 
		 }else {
			 if (peso<10) {
				 System.out.println("rosnar");
			 }else {
				 System.out.println("ignorar");
			 }
		 }
	 }
}

