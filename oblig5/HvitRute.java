class HvitRute extends Rute{
	Boolean aapning = false;

	public HvitRute(int rad, int kolonne, Labyrint lab){
		super(rad, kolonne, lab);
		erApning();

	}
	public void erApning(){
		//Sjekk om aapning
		if((kolonne == 0) || (rad == 0)){
			this.aapning = true;
		}else if((kolonne == lab.hentKolonner()-1) || (rad == lab.hentRader()-1)){
			aapning=true;
		}
	}


	char tilTegn(){
		return '.';
	}


}
