import java.util.ArrayList;
class HvitRute extends Rute{
	Boolean aapning = false;
	ArrayList<Rute> veien;

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
		if(aapning){
			return '*';
		}
		return '.';
	}

	public void gaa(ArrayList<Rute> vei){
		ArrayList<Rute> ny = new ArrayList<>(vei);
		ny.add(this);
		if(aapning){
			lab.utveier2.add(ny);

		}else{

			//Hvis hovedtraaden ikke sender arbeiderene ut paa jobb forst maa
			//arbeiderene se paa mens arbeideren gjor sitt arbeid.
			//
			//Det er bedre aa delegere forst, for saa a gjore sitt eget arbeid.

			int tmp = 1;
			ArrayList<Thread> traader = new ArrayList<>();
			for(Rute r: naboer){
				if(!ny.contains(r)){
					if(tmp==naboer.size()){
						//Gaa videre nar alle andre har kjort
						r.gaa(ny);
					}else{
						Runnable task = new Traadbeholder(r, ny); //Her er en oppgave
						Thread traad1 = new Thread(task); //Her er en arbeider
						traader.add(traad1);
						traad1.start(); //Leggo

					}
				}
				tmp+=1;
			}
			for(Thread t: traader){
				try {
					t.join();

				} catch(Exception e) {
				
				}
			}
		}
	}



}
