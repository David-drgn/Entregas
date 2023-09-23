package main;

public class No {

	private int val = 0;
	No direita = null;
	No esquerda = null;

	public No(int val) {

		this.val = val;
		this.direita = null;
		this.esquerda = null;

	}

	public int getVal() {
		return val;
	}

	public No getDireita() {
		return direita;
	}

	public No getEsquerda() {
		return esquerda;
	}


}
