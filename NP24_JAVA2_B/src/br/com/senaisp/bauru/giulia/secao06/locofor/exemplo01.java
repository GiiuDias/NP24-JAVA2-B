package br.com.senaisp.bauru.giulia.secao06.locofor;

import java.util.Scanner;

public class exemplo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        
        while (opc < 1 || opc > 15) {
            System.out.println("Digite um valor entre 1 e 15");
            opc = sc.nextInt();
        }
        
        System.out.println("Fim do jogo");

        // Exemplo do Do-While
        int idade;
        do {
            System.out.println("Digite um valor entre 5 a 10");
            idade = sc.nextInt();
        } while (idade < 5 || idade > 10);
        
        sc.close();
    }
}