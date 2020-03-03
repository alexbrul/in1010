import java.util.ArrayList;

public class Integrasjonstest{
	static ArrayList<Legemiddel> l2 = new ArrayList<>();
	static ArrayList<Resept> resepter = new ArrayList<>();
	static ArrayList<Lege> leger = new ArrayList<>();
	static ArrayList<String> navn = new ArrayList<>();
	static String[] navn2 = {"Preben", "Tora", "Viktor", "Leif-vidar"};
	static String[] medisiner = {"tempofin", "simolan", "tyktroten", "klementin"};
	static String[] virkestoff = {"cola", "pepsi", "sprite", "fanta exotic"};


	public static void main(String[] args){
		boolean test = testLegemiddel("pensilin", 200, 10, 99);
	
	
	}


	public static boolean testLegemiddel(String navn, double pris, double virk, int styrk){
		int id = 4;
		Legemiddel A = new Vanedannende(navn, pris, virk, styrk);
		Vanedannende B = new Vanedannende(navn, pris, virk, styrk);
		Vanlig C = new Vanlig(navn, pris, virk);
		Narkotisk D = new Narkotisk(navn, pris, virk, styrk);
		
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



	ORKER IKKKKEE
	

	public static void lagInstanser(){
		for(String i: navn2){
			leger.add(new Lege(i));
			leger.add(new Spesialist(i));
		}
		for(int i=0; i<4; i++){
			L
		}

	
	}
}
