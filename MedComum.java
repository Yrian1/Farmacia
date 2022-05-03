package farmacia;

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
			val=true;
		}
		else {
			val=false;
		}
		menosQtdAtual(qtd);
		
		return val;
		// TODO Auto-generated method stub
		
	}

}
