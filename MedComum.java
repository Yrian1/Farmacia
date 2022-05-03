package Farmacia;

public class MedComum extends Medicamentos {

	public MedComum(int cod, double preco, int qtdInicial) {
		super(cod, preco, qtdInicial, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean setQtdAtual(int qtd) {
		boolean val;
		if(getPreco()<2.50) {
			qtd*=2;
			System.out.println("Produto em promocao, paga 1 leve 2");
			val=true;
		}
		else {
			val=false;
		}
		System.out.prinln("voce comprou" + " " qtd + " unidades");
		menosQtdAtual(qtd);
		
		return val;
		// TODO Auto-generated method stub
		
	}

}
