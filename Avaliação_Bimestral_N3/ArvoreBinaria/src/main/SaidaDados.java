package main;

import javax.swing.JOptionPane;

public class SaidaDados {
	
	static void saidaAdicional(No no) {
		if (no != null) {

			saidaAdicional(no.getEsquerda());
			saidaAdicional(no.getDireita());

			int valEsquerda = 0;
			int valDireita = 0;

			try {valEsquerda = no.getEsquerda().getVal();} catch (Exception e) {valEsquerda = 0;}

			try {valDireita = no.getDireita().getVal();} catch (Exception e) {valDireita = 0;}

			JOptionPane.showMessageDialog(null, "Valor nó principal: " + no.getVal() + "\nEsquerda: " + valEsquerda + " Direita: " + valDireita);
		}
	}
	
	static void saidaDadosEmOrdem(No no) {
        if (no != null) {
        	saidaDadosEmOrdem(no.esquerda);
        	JOptionPane.showMessageDialog(null, "Valor nó: " + no.getVal());
        	saidaDadosEmOrdem(no.direita);
        }
    }
	
	static void saidaDadosPreOrdem(No no) {
        if (no != null) {
        	JOptionPane.showMessageDialog(null, "Valor nó: " + no.getVal());
        	saidaDadosPreOrdem(no.esquerda);
        	saidaDadosPreOrdem(no.direita);
        }
    }
	
	static void saidaDadosPosOrdem(No no) {
        if (no != null) {
        	saidaDadosPosOrdem(no.esquerda);
        	saidaDadosPosOrdem(no.direita);
            JOptionPane.showMessageDialog(null, "Valor nó: " + no.getVal());
        }
    }


	static void selectOrder(No no) {
		String valNo1 = JOptionPane.showInputDialog(null, "Digite a ordem: " + "\n1: para em ordem"
				+ "\n2: Para pré-ordem" + "\n3: Para pós-ordem" + "\n4: Para ver nó por nó"  + "\n0: Para sair");
		int val = 0;
		try {
			val = Integer.parseInt(valNo1);
		} catch (Exception e) {
			selectOrder(no);
		}
		if (val == 1)
			saidaDadosEmOrdem(no);
		if (val == 2)
			saidaDadosPreOrdem(no);
		if (val == 3)
			saidaDadosPosOrdem(no);
		if (val == 4)
			saidaAdicional(no);
		if (val == 0)
			return;
		else
			selectOrder(no);
	}
}
