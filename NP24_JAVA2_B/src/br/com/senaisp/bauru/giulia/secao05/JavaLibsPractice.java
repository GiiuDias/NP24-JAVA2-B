package br.com.senaisp.bauru.giulia.secao05;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class JavaLibsPractice {
		public static void main(String[] args) {
	        String name = JOptionPane.showInputDialog("Enter your name");
	        
	        //Para sim ou não
	        boolean resp = JOptionPane.
	        		showConfirmDialog(null,
	        		"Você gosta de se aventurar?",
	        		"Participação",
	        		JOptionPane .YES_NO_OPTION,
	        		JOptionPane.QUESTION_MESSAGE)
	        		== JOptionPane.YES_OPTION;
	        
	        String[] acceptableValues = {"Bar do tatu", "Buteco do japonês", "Praia"};
	        String input2 = (String)JOptionPane.showInputDialog(null,
	                "Qual seu lugar favorito?",
	                "Dialog Title",
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                acceptableValues,
	                acceptableValues[1]);
	        
	        
	        String xVlr = JOptionPane.
	    			showInputDialog("Qual o valor você gastaria nesse local?:");
	    	JOptionPane.showMessageDialog(null, xVlr);    	
	                
	        
	        //Parse the input as an int.
	        //Print its value +1
	    	JOptionPane.showMessageDialog(null, Integer.parseInt(xVlr)+0);      
	        
	        
	        //Try creating a dialog, parsing it, and initializing an int in a single line.
	        //You should have only one semicolon (;) in this line.
	    	int valor = Integer.parseInt(
	    			JOptionPane.showInputDialog("Digite o valor:")
	    			);
	    	JOptionPane.showMessageDialog(null, valor);
	    	
	    	
	    	
	    	
		}

		private static Object name(Object object, String name) {
			// TODO Auto-generated method stub
			return null;
		}}