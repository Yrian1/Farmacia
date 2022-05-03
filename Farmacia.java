package Farmacia;

import java.util.ArrayList;

public class Farmacia {
	
	 ArrayList<Medicamentos> totalMed = new ArrayList<>();
	 public boolean addMed(Medicamentos med){//metodo para 'cadastrar' medicamentos adicionando ao array impedindo que tenha mais de 100 medicamentos cadastrados
		 if(totalMed.size()>100) {
			 return false;
		 }
		 this.totalMed.add(med);
		 return true;
	 }
	public static void main(String[] args) {
		Farmacia farma= new Farmacia();
		MedComum p1 = new MedComum(1, 2.60, 40);// inicia os medicamentos comuns adicionando um medicamento,seu preço e a quantidade dele
		MedNControlado p2 = new MedNControlado(2, 2.5, 30);//inicia os medicamentos nao controlados adicionando um medicamento,seu preço e a quantidade dele
		MedControlado p3= new MedControlado(4,2.4, 50);//inicia os medicamentos controlados adicionando um medicamento,seu preço, a quantidade dele
		farma.addMed(p1);
		farma.addMed(p2);
		farma.addMed(p3);
		p1.setQtdAtual(-10);
		p2.setQtdAtual(26);
		p3.devolver(5);

		 System.out.println(p1.toString());
		 System.out.println(p2.toString());
		 System.out.println(p3.toString());
		// TODO Auto-generated method stub

	}

}
