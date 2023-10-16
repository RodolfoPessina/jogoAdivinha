package DesafioChatGPT.adivinha;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	
	 private int numeroAdivinhar;
	 private int tentativas;
	
	public JogoAdivinhacao() {
		Random gerador = new Random();
		this.numeroAdivinhar = gerador.nextInt(100);
		tentativas = 0;
	
	}
	
	
	public int getNumeroAdivinhar() {
		return numeroAdivinhar;
	}


	public void setNumeroAdivinhar(int numeroAdivinhar) {
		this.numeroAdivinhar = numeroAdivinhar;
	}


	public int getTentativas() {
		return tentativas;
	}


	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}



	void Advinhar(int palpite) {
		this.tentativas++;
		System.out.println("Número de tentativas " + tentativas);
		if(palpite == numeroAdivinhar) {
			System.out.println("Parabéns você acertou!");
		}else if (palpite < numeroAdivinhar){
			System.out.println("Errou! tente um número mais alto!");
		}else {
			System.out.println("Errou! tente um número mais baixo!");
		}
		
		
		
	}

}
