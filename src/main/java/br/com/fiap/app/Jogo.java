package br.com.fiap.app;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
	/**
	 * enquanto ele não acertou a palavra E nao foi enforcado faça
	 * 		Imprime a palavra secreta (com os tracinhos)
	 * 		Imprime a quantidade de erros cometidos
	 * 		Peço para o usuário digitar uma letra
	 * 		Passo a letra para o objeto decidir se ela pertence à palavra
	 * 		Caso ela pertença atualizo o objeto para imprimir a letra nos locais adequados
	 * 		Se ela não pertence à palavra eu aumento a quantidade de erros
	 * 
	 */
		Scanner tec = new Scanner(System.in);
		Forca f = new Forca(2);
		while (!f.acertou() && !f.enforcou()) {
			System.out.println(f.getPalavraFechada());
			System.out.println("ERROS: " + f.getErros());
			
			System.out.print("Letra: ");
			String letra = tec.nextLine();
			f.chuta(letra.charAt(0));
		}
		
		if (f.acertou()) {
			System.out.println("Parabéns, você acertou!");
			System.out.println(f.getPalavraFechada());
		}
		else {
			System.out.println("A palavra era " + f.getPalavraAberta());
			System.out.println("Mais sorte na proxima vez!");
		}
	}

}
