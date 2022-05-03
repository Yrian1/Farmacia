package farmacia;
import java.util.ArrayList;

public class Farmacia {
	
	 ArrayList<Medicamentos> totalMed = new ArrayList<>();
	 public boolean addMed(Medicamentos med){	
		 if(totalMed.size()>100) {
			 return false;
		 }
		 this.totalMed.add(med);
		 return true;
	 }
	public static void main(String[] args) {
		Farmacia farma= new Farmacia();
		MedComum p1 = new MedComum(1, 2.60, 40);
		MedNControlado p2 = new MedNControlado(2, 2.5, 30);
		farma.addMed(p1);
		farma.addMed(p2);
		p1.setQtdAtual(-10);

		 System.out.println(p1.toString());
		 System.out.println(p2.toString());
		// TODO Auto-generated method stub

	}

}
