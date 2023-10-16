package DesafioChatGPT.adivinha;

import java.util.Scanner;

public class Main extends JogoAdivinhacao {

	public static void main(String[] args) {
		JogoAdivinhacao jogo = new JogoAdivinhacao();
		Scanner sc = new Scanner(System.in);
		System.out.print("Tente adivinhar um número entre 0 e 100, você terá 10 chances! Boa sorte!!");
		
		boolean acertou = false;
		
		while(!acertou) {
			jogo.getTentativas();
			System.out.println("Digite seu palpite: ");
			int palpite = sc.nextInt();
			jogo.Advinhar(palpite);
			
			if(palpite == jogo.getNumeroAdivinhar() || jogo.getTentativas() >= 10) {
				acertou = true;
			}
		}
		
		
		sc.close();

	}

}
