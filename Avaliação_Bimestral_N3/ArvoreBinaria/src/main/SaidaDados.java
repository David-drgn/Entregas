package main;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class SaidaDados {

	static String saidaDadosEmOrdem(No no, String result) {
		if (no != null) {
			result = "" + saidaDadosEmOrdem(no.esquerda, result) + " " + no.getVal() + " "
					+ saidaDadosEmOrdem(no.direita, result);
			return result;
		}
		return "";
	}

	static String saidaDadosPreOrdem(No no, String result) {
		if (no != null) {
			result = "" + no.getVal() + " " + saidaDadosPreOrdem(no.esquerda, result) + " "
					+ saidaDadosPreOrdem(no.direita, result);
			return result;
		}
		return "";
	}

	static String saidaDadosPosOrdem(No no, String result) {
		if (no != null) {
			result = "" + saidaDadosPosOrdem(no.esquerda, result) + " " + saidaDadosPosOrdem(no.direita, result) + " "
					+ no.getVal();
			return result;
		}
		return "";
	}
	
	static long time() {
		return System.nanoTime();
	}
	
	static double tempoDeExecucao(long tempoInicial, long tempoFinal) {
		long dif = tempoFinal - tempoInicial;
		double ms = (double) dif / 1_000_000.0;
		return ms;
	}

	static void selectOrder(No no) {
		String valNo1 = JOptionPane.showInputDialog(null, "Digite a ordem: " + "\n1: para em ordem"
				+ "\n2: Para pré-ordem" + "\n3: Para pós-ordem" + "\n0: Para sair");
		int val = 0;
		try {
			val = Integer.parseInt(valNo1);
		} catch (Exception e) {
			selectOrder(no);
		}
		if (val == 1) {
			
			long tempoInicial = time();
			String result = saidaDadosEmOrdem(no, "");
			long tempoFinal = time();
			
			JOptionPane.showMessageDialog(null, "Resultado: " + result + "\nTempo de execução em milesimos: " + tempoDeExecucao(tempoInicial, tempoFinal));
		}
		if (val == 2) {
			long tempoInicial = time();		
			String result = saidaDadosPreOrdem(no, "");
			long tempoFinal = time();
			
			JOptionPane.showMessageDialog(null, "Resultado: " + result + "\nTempo de execução em milesimos: " + tempoDeExecucao(tempoInicial, tempoFinal));
		}
		if (val == 3) {
			long tempoInicial = time();		
			String result = saidaDadosPosOrdem(no, "");
			long tempoFinal = time();
			
			JOptionPane.showMessageDialog(null, "Resultado: " + result + "\nTempo de execução em milesimos: " + tempoDeExecucao(tempoInicial, tempoFinal));
		}
		if (val == 0)
			return;
		else
			selectOrder(no);
	}
}
