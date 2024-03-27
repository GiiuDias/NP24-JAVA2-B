package br.com.senaisp.bauru.giulia.secao06.locofor;

import java.util.Scanner;

public class TesteSenha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        int tentativas = 0;
        final int PASSWORD = 1592;
        
        do {
            System.out.println("Favor digite a senha");
            senha = sc.nextInt();
            tentativas++;
        } while (senha != PASSWORD && tentativas < 3);

        // Início do if
        if (senha == PASSWORD) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso bloqueado");
        } // Fim do else
        
        sc.close();
    }
}