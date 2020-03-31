import java.util.ArrayList;
public class Rute{
	int rad;
	int kolonne;
	ArrayList<Rute> naboer = new ArrayList<>();
	Labyrint lab;

	public Rute(int kolonne, int rad, Labyrint lab){
		this.kolonne = kolonne;
		this.rad = rad;
		this.lab = lab;
		finnNabo(); //Legger til naboer
	}

	public void finnNabo(){
		if(rad>0){
			//opp
			naboer.add(lab.hentRute(kolonne, rad-1));	
		}
		if(kolonne>0){
			//venstre
			naboer.add(lab.hentRute(kolonne-1, rad));	
		}
		if(rad<lab.hentRader()-2){
			//ned
			naboer.add(lab.hentRute(kolonne, rad+1));
		}
		if(rad<lab.hentKolonner()-2){
			naboer.add(lab.hentRute(kolonne+1, rad));	
		}
	}



}
