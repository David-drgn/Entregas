package main;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Teste {
	
	private static void CreateNo(No[] nos, int count, int position, int originPosition) {
		
		int confirm;
		
		if(originPosition < 0) {
			System.out.println("Fim da execução");
			return;
		}
		
		if(nos[count].getDireita() != null && nos[count].getDireita() != null) position = 3;
		
		if(position >= 3) {
			System.out.println(nos[count].getEsquerda().getVal());
			JOptionPane.showMessageDialog(null, "Perdão, porém o Nó atual está com ambos os dados preenchidos");
			
			confirm = JOptionPane.showConfirmDialog(null, "Deseja implementar o nó da esquerda?", "Esquerda do nó: " + nos[count].getEsquerda().getVal() + "", JOptionPane.YES_NO_OPTION);
			if(confirm == JOptionPane.YES_OPTION){
				count++;
				originPosition++;
				nos[count] = nos[count - 1].getEsquerda();
				CreateNo(nos, count, 1, originPosition);
				return;
			}
			
			confirm = JOptionPane.showConfirmDialog(null, "Deseja implementar o nó da direita?", "Direita do nó: " + nos[count].getDireita().getVal() + "", JOptionPane.YES_NO_OPTION);
			if(confirm == JOptionPane.YES_OPTION){
				count++;
				originPosition++;
				nos[count] = nos[count - 1].getDireita();
				CreateNo(nos, count, 1, originPosition);
				return;
			}
			
			else {
				System.out.println("Retornando");
				originPosition--;
				count--;
				CreateNo(nos, count, 0, originPosition);
				return;
			}
		}
		
		String valNo1;
		int val = 0;
		
		System.out.println(position);
		
		if(position != 0 && nos[count].getEsquerda() == null || nos[count].getDireita() == null) {
			valNo1 = JOptionPane.showInputDialog(null, "Digite o valor do nó pertencente a esse nó: " + nos[count].getVal() + "");
			try {
				val = Integer.parseInt(valNo1);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Não foi possível converter \n" + e + "");
				CreateNo(nos, count, position, originPosition);
				return;
			}
		}
			
		if(position == 1 && nos[count].getEsquerda() == null) {
			nos[count].setEsquerda(new No(val));
			nos[count].getEsquerda().setVal(val);
			confirm = JOptionPane.showConfirmDialog(null, "Continuar o nó?", "Nó de valor: " + val + "", JOptionPane.YES_NO_OPTION);
			if(confirm == 0) {
				count++;
				originPosition++;
				nos[count] = nos[count - 1].getEsquerda();
				CreateNo(nos, count, 1, originPosition);	
				return;
			}
			else {
				position++;
				CreateNo(nos, count, position, originPosition);
				return;
			}
		}
		
		else if(position == 2 && nos[count].getDireita() == null){
			nos[count].setDireita(new No(val));
			nos[count].getDireita().setVal(val);
			confirm = JOptionPane.showConfirmDialog(null, "Continuar o n�?", "Nó de valor: " + val + "", JOptionPane.YES_NO_OPTION);
			if(confirm == 0) {
				count++;
				originPosition++;
				nos[count] = nos[count - 1].getEsquerda();
				CreateNo(nos, count, 1, originPosition);
				return;
			}
			else {
				position++;
				CreateNo(nos, count, position, originPosition);
				return;
			}
		}
		
		position++;
		CreateNo(nos, count, position, originPosition);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valNo1 = JOptionPane.showInputDialog(null, "Digite o valor do n�");
		int val = 0;
		try {
			val = Integer.parseInt(valNo1);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "N�o foi poss�vel converter \n" + e + "");
		}
		
		No no = new No(val);
		
		No[] nos = new No[500];
		
		nos[0] = no;
		
		CreateNo(nos, 0, 1, 0);
		
		System.out.println("\n\n\n\n");
		
		int count = 0;
	    Stack<No> stack = new Stack<>();
	    No currentNode = nos[0];

	    while (currentNode != null || !stack.isEmpty()) {
	        if (currentNode != null) {
	            stack.push(currentNode);
	            currentNode = currentNode.getEsquerda();
	        } else {
	            currentNode = stack.pop();
	            System.out.print(currentNode.getVal() + " ");
	            currentNode = currentNode.getDireita();
	        }
	    }
	}
}
