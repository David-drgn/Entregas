package main;

import javax.swing.JOptionPane;

public class EntradaDados {

	static int ValorNo() {
		String valNo1 = JOptionPane.showInputDialog(null, "Digite o valor do nó");
		int val = 0;
		try {
			val = Integer.parseInt(valNo1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possível converter \n" + e + "");
			ValorNo();
		}
		return val;
	}
	
	static No criarNo() {
        int valor = ValorNo();
        No no = new No(valor);
        
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja criar o nó à esquerda?", "Esquerda, Nó principal: " + no.getVal() + "", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) no.esquerda = criarNo();
        else no.esquerda = null;
        
        confirm = JOptionPane.showConfirmDialog(null, "Deseja criar o nó à direita?", "Direita, Nó principal: " + no.getVal() + "", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) no.direita = criarNo();
        else no.direita = null;
        
        if(no.getEsquerda() == null) {        	
        	no.esquerda = no.direita;
        	no.direita = null;
        }
        
        int valEsquerda = 0;
		int valDireita = 0;

		try {valEsquerda = no.getEsquerda().getVal();} catch (Exception e) {valEsquerda = 0;}

		try {valDireita = no.getDireita().getVal();} catch (Exception e) {valDireita = 0;}
		
        if(valEsquerda > valDireita) {
        	No aux = no.esquerda;
        	no.esquerda = no.direita;
        	no.direita = aux;
        }
        
        return no;
    }
}
