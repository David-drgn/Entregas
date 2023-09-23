package main;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntradaDados entrada = new EntradaDados();
		SaidaDados saida = new SaidaDados();

		No no = entrada.criarNo();
		saida.selectOrder(no);

	}
}
