package br.com.senaisp.bauru.giulia.secao05.execicio;

public class exercicio01 {

	public static void main(String[] args) {
		int idade = 17;
		boolean bPodeDirigir = ! (idade < 18 || idade > 65);
		                        //idade>= 18 && idade <= 65
		System.out.println("Você " + 
		                       ( bPodeDirigir ? "Pode" : "Não pode" ) 
		+ " Dirigir ");
		

	}

}