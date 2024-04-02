package br.com.senaisp.bauru.giulia.secao06.locofor;

public class testepoligonos {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println("7 x " + i + " = " + (7*i));
		}
		//Contagem regressiva
		for(int i=100;i>0;i--) {
			System.out.println(i);
		}
		//For sem as chaves
		for(int i=0;i<5;i++) {
			System.out.println("linha do for");
		}
		System.out.println("linha seguinte!");
		//For sem parametros
		for(;;) {
			System.out.println("For infinito!!");
		}
	}

}