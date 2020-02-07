import java.util.ArrayList;
public class TestLegemiddel{

	public static void main(String[] args){
		
		Legemiddel A = new Vanedannende("Lundosil", 200, 20, 10);
		Vanedannende B = new Vanedannende("antibiotikym", 200, 20, 10);
		Vanlig C = new Vanlig("antibiotikym", 200, 20);
		Narkotisk D = new Narkotisk("Heroin", 50, 10, 99999);
		ArrayList<Legemiddel> l = new ArrayList<>();
		l.add(A);
		l.add(B);
		l.add(C);
		l.add(D);

		for(Legemiddel lm: l){
			String navn = lm.hentNavn();
			int id =lm.hentId();
			double pris = lm.hentPris();
			double vi= lm.hentVirkestoff();
			System.out.println("navn: " + navn + " id: " + id + " pris: " + 
					pris + " virkestoff: " + vi);
		}
		boolean test = testLegemiddel("pensilin", 200, 10, 99);
		System.out.println("Testresultat: " + test);
	
	}


	public static boolean testLegemiddel(String navn, double pris, double virk, int styrk){
		int id = 4;
		Legemiddel A = new Vanedannende(navn, pris, virk, styrk);
		Vanedannende B = new Vanedannende(navn, pris, virk, styrk);
		Vanlig C = new Vanlig(navn, pris, virk);
		Narkotisk D = new Narkotisk(navn, pris, virk, styrk);
		
		ArrayList<Legemiddel> l2 = new ArrayList<>();
		l2.add(A);
		l2.add(B);
		l2.add(C);
		l2.add(D);
		for(Legemiddel lm: l2){
			if(navn != lm.hentNavn()) return false;
			if(id != lm.hentId()) return false;
			id++;
			if(pris != lm.hentPris()) return false;
			if(virk != lm.hentVirkestoff()) return false;
			//if((lm instanceof Narkotisk) || (lm instanceof Vanedannende)){
				//if(styrk != lm.hentStyrke()) return false;
			
			//}
		}


		return true;
	
	}

}
