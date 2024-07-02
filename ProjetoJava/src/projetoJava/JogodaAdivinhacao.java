package projetoJava;

import java.util.Random;
import java.util.Scanner;

public class JogodaAdivinhacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	        int continuar = 0;
	        int tentativa;
	        int numero;
	        int numeroAleatorio;
	        
	        do {
	        	
	        	
	        	System.out.println("Seja bem vindo ao jogo da adivinhação =D");
	        	System.out.println("====Como jogar====");
	        	System.out.println("Você deve adivinhar (dããã) o número que eu estou pensando");
	        	System.out.println("Caso queira sair basta digitar '0'");
	        	
	        	Random randomNumero = new Random();
	        	numeroAleatorio = randomNumero.nextInt(101);
	        	System.out.println("Vamos Começar......");
	        	tentativa = 0;
	        	
	        	do {
	        		tentativa++;
	        		System.out.println("Digite um número: ");
	        		numero = entrada.nextInt();
	        		
	        		if(numero > numeroAleatorio) {
	        			System.out.println("O número aleatório é menor;");
	        			System.out.println("Você já tentou :" + tentativa);
					System.out.println("Quantidade de tentativas restantes: " + (10 - tentativa));
	        		}
	        		else if(numero < numeroAleatorio) {
	        			System.out.println("O número aleatorio é maior");
					System.out.println("Você já tentou :" + tentativa);
	        			System.out.println("Quantidade de tentativas restantes: " + (10 - tentativa));
	        		}
	        		
	        		else {
	        			System.out.println("Você acertouuu Parabéns");
	        			System.out.println("Em um total de " + tentativa +" Tentativas");
	        		}
	        		
	        		
	        	}while(tentativa < 10 && numero != numeroAleatorio );
	        	
	        	 if(numero != numeroAleatorio) {
	                 System.out.println("Você perdeu! Eu sou o melhor! Muhahaha =D");
	             }
	             
	             System.out.println("Deseja jogar novamente? Digite 1 para continuar ou 0 para sair.");
	             continuar = entrada.nextInt();
	        		
	        	
	        }while(continuar != 0);

	        entrada.close();
	    }
	    

	}


