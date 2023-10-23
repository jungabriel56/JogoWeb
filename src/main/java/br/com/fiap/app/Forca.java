package br.com.fiap.app;

public class Forca {

	private int erros;
	private String palavra;
	private boolean[] check;
	private int maxErros;
	
	public Forca() {		
		this.erros = 0;
		this.palavra = "Coreia do Norte";		
		this.maxErros = 6;
		this.check = new boolean[palavra.length()];
		for(int i = 0; i < check.length; i++)
			check[i] = false;
	}
	
	public Forca(int nivel) {
		this();
		if (nivel == 0) //EASY
			this.maxErros = 9;
		else if (nivel == 2) //HARD
			this.maxErros = 3;		
	}
	
	public boolean acertou() {
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false)
				return false;
		}
		return true;
	}
	
	public void chuta(char letra) {
		boolean gol = false;		
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == letra) {
				check[i] = true;
				gol = true;
			}				
		}
		if (gol == false)
			this.erros++;
	}
	
	public String getPalavraFechada() {
		String resp = "";
		for (int i = 0; i < check.length; i++) {
			if (check[i] == true)
				resp = resp + palavra.charAt(i) + " ";
			else
				resp = resp + "_ ";
		}
		return resp;
	}
	
	public int getErros() {
		return erros;
	}
	
	public String getPalavraAberta() {
		return palavra;
	}
	
	public boolean enforcou() {
		if (erros == maxErros)
			return true;
		else
			return false;
	}
	
	
}
