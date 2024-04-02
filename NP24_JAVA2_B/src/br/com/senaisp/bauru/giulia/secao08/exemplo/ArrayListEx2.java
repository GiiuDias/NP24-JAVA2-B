package br.com.senaisp.bauru.giulia.secao08.exemplo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> lstInt = new ArrayList<Integer>();
        Random rnd = new Random();
        // Adicionando valores aleatórios de 1 a 200 na lista
        for (int i = 0; i < 100; i++) {
            lstInt.add(rnd.nextInt(200) + 1);
        }
        // listar os valores gerados
        for (int it : lstInt) {
            System.out.println(it);

        }
        // Utilizando o iterator
        System.out.println("Listando usando iterator");
        Iterator<Integer> iter = lstInt.iterator();
        while (iter.hasNext()) { // Removi o ponto e vírgula extra aqui
            System.out.println(iter.next());
        }
        // Removendo os pares
        Iterator<Integer> it = lstInt.iterator(); // Adicionei um novo iterator para percorrer a lista
        while (it.hasNext()) { // Usei outro iterator para evitar ConcurrentModificationException
            int num = it.next(); // Obtendo o próximo elemento
            if (num % 2 == 0) { // Verificando se é par
                it.remove(); // Removendo o item par
            }
        }
        // Listando o resultante depois de retirado os valores
        // Utilizando o listIterator
        System.out.println("Listando o final");
        ListIterator<Integer> lsIt = lstInt.listIterator();
        while (lsIt.hasNext()) { // Corrigi lst para lsIt
            System.out.println(lsIt.next()); // Adicionei next() para obter o próximo elemento
        }

    }

}