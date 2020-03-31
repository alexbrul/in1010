public class Labyrint{
	Rute[][] nett;
	int rad;
	int kolonne;

	public Labyrint(int rad, int kolonne){
		//Viktig. Da er rutenettet med maxpos rad-1, kolonne-1
		this.nett = new Rute[rad][kolonne];
		this.rad = rad;
		this.kolonne = kolonne;
	}

	public Rute hentRute(int rad, int kolonne){
		return nett[rad][kolonne];	
	}

	public int hentRader(){
		return rad;
	}
	public int hentKolonner(){
		return kolonne;
	}

	



}
