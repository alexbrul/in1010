import java.util.ArrayList;
public class Rute{
	int rad;
	int kolonne;
	ArrayList<Rute> naboer = new ArrayList<>();
	Labyrint lab;

	public Rute(int rad, int kolonne, Labyrint lab){
		this.kolonne = kolonne;
		this.rad = rad;
		this.lab = lab;
	}

	public void finnNabo(){
		if(rad>0){
			//opp
			naboer.add(lab.hentRute(rad-1, kolonne));	
			System.out.println("denne1?");
		}
		if(kolonne>0){
			//venstre
			naboer.add(lab.hentRute(rad, kolonne-1));	
			System.out.println("denne2?");
		}
		if(rad<lab.hentRader()-1){
			//ned
			naboer.add(lab.hentRute(rad+1, kolonne));
			System.out.println("denne3?");
		}
		if(kolonne<lab.hentKolonner()-1){
			naboer.add(lab.hentRute(rad, kolonne+1));	
			System.out.println("denne4?");
		}
	}

	char tilTegn(){
		return '.';
	}



}
