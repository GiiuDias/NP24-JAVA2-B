package br.com.senaisp.bauru.giulia.secao08.exemplo;

import javax.management.RuntimeErrorException;

public class Carta {
	private String[] naipes = {"♦","♠","♥","♣"};
	private String[] numeros = {"A","2","3","4","5","6",
			                    "7","8","9","10","J","Q","K"};
	private int naipe;
	private int valor;
	private String numero;
	//Constructor
	public Carta(int nap, int num) {
		//Tratando o Naipe para que seja o de 0 a 3
		if (nap<0 || nap>3) {
			throw new RuntimeErrorException(null, "Os naipes devem ser de 0 a 3");
		}
		//Tratando o numero para que seja de 0 a 12
		if (num<0 || num>12) {
			throw new RuntimeErrorException(null, "Os numeros devem"
					+ " ser de 0 a 12");			
		}
		
		//Atribuindo os fields
		naipe = nap;
		valor = num;
		numero = numeros[num];
		
	}
	public String getNaipe() {
		return naipes[naipe];
		
	}
	
	public String getNumero() {
		return numero;
	}
	
	public int getValor() {
		return valor > 9 ? 10 : valor + 1;
		
	}
	
	public String toString() {
		              //123456
		String apoio = "╔════╗\n" //1
				    +  "║##  ║\n" //2
				    +  "║  § ║\n" //3
				    +  "║  ##║\n" //4
				    +  "╚════╝\n";//5 
	    
		String br = valor  == 9 ? "" : " ";
		apoio = apoio.replaceFirst("##", getNumero()+ br);
		apoio = apoio.replace("§", getNaipe());
		apoio = apoio.replaceFirst("##",br + getNumero());
		return apoio; 
	
}
}