package main;

public class No {
	
	private int val = 0;
	No direita = null;
	No esquerda = null;
	
	public No() {
		this.val = 0;
		this.direita = null;
		this.esquerda = null;
	}
	
	public No(int val) {
		
		this.val = val;
		this.direita = null;
		this.esquerda = null;
		
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public No getDireita() {
		return direita;
	}
	
	public void delDireitaEsquerda() {
		this.esquerda = null;
		this.direita = null;
	}

	public void setDireita(No direita) {
		if(this.esquerda.getVal() > direita.getVal()) {
			No aux = direita;
			this.esquerda = direita;
			this.direita = aux;
		}
		else this.direita = direita;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	
}
