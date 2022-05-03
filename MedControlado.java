package Farmacia;

public class MedControlado extends Medicamentos{
	public MedControlado(int cod, double preco,int qtd ) {
		super(cod, preco, qtd, true);
	}
	

	public boolean setQtdAtual(int qtd) {
		if(getQtdAtual()-qtd<=getQtdInicial()*0.20 || getQtdAtual()<0) {
			System.out.println("Impossivel vender mais itens desse produto");
			return false;
		}
		menosQtdAtual(qtd);
		System.out.println("Voce comprou" + qtd + " unidades");
		return true;
	}
	public void devolver(int qtd) {
		 menosQtdAtual(qtd);
		 System.out.println("vc devolveu  " + qtd + "  remedios controlados");

	


	}


	
}
