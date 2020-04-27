import java.util.ArrayList;
import java.util.Iterator;
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
			//arbeiderene se paa mens hovedtraaden  gjor sitt arbeid.
			//
			//Det er bedre aa delegere forst, for saa a gjore sitt eget arbeid.

			int tmp = 1;
			ArrayList<Thread> traader = new ArrayList<>();
			ArrayList<Rute> naboOutSource = new ArrayList<>();

			for(Rute r: naboer){
				if(!ny.contains(r)){
					if(tmp==naboer.size()){
						Iterator iter = naboOutSource.iterator();
						Runnable task = new TraadBeholder(naboOutSource, ny); //Her er en oppgave.. Gaa fra alle naboene i nabolisten
						while(iter.hasNext()){
							iter.next();
							Thread traad1 = new Thread(task); //Her er en arbeider, en for hver naborute - den jeg tar med hovedtraaden
							traader.add(traad1);
						}
						for(Thread t: traader){
							t.start(); //starter alle.
						}

						//Gaa siste  nar alle andre har startet
						r.gaa(ny); 
					}else{
						naboOutSource.add(r);
					}
				}
				tmp+=1;
			}
			for(Thread t: traader){
				try {
					//brukes for a si at traden som startet alle skal vente paa alle for den blir ferdig.
					t.join();

				} catch(Exception e) {
				
				}
			}
		}
	}



}
