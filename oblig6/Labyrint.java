import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Labyrint{
	static Rute[][] nett;
	int rad;
	int kolonne;
	static ArrayList<ArrayList<Rute> > utveier =  new ArrayList<ArrayList<Rute>>(); 
	//ny
	public NodeMonitor utveier2 = new NodeMonitor();	


	public Labyrint(int rad, int kolonne){
		//Viktig. Da er rutenettet med maxpos rad-1, kolonne-1
		this.rad = rad;
		this.kolonne = kolonne;
		this.nett = new Rute[rad][kolonne];
	}

	static Labyrint lesFraFil(File fil){
		Labyrint utLab = null;
		try{
			Scanner infile = new Scanner(fil);
			//leser rad og kol, caster det til int og lager labben
			String[] radkol = infile.nextLine().split("\\s+");
			utLab = new Labyrint(Integer.parseInt(radkol[0]), 
					Integer.parseInt(radkol[1]));
			System.out.println(Integer.parseInt(radkol[0]));
			System.out.println(radkol[1]);
			Rute[][] utnett = new Rute[Integer.parseInt(radkol[0])][Integer.parseInt(radkol[1])];
			String line = "";
			int rc = 0;
			int kc = 0;
			while(infile.hasNextLine()){
				line = infile.nextLine();
				System.out.println(line);
				kc = 0;
				for (char ch: line.toCharArray()){
					if(ch == '#'){
						utLab.nett[rc][kc] = 
							new SvartRute(rc, kc, utLab);
					}
					else if(ch == '.'){
						utLab.nett[rc][kc] = 
							new HvitRute(rc, kc, utLab);
					}

					kc++;
				}
				rc++;
			}
			System.out.println("Ferdig lest inn");

		}catch(Exception E){
			System.out.println(E);	
		}
		for (Rute[] r : utLab.nett){
			for (Rute r2: r){
				//System.out.println("test");
				r2.finnNabo();
				//System.out.println("test");
			}
		}
		return utLab;

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
	public void printLab(){
		String tmp = "";
		for(int i = 0; i<rad; i++){
			for(int k = 0; k<kolonne; k++){
				tmp = tmp + nett[i][k].tilTegn();
			}
			System.out.println(tmp);
			tmp = "";
		
		}

	}

	public void finnUtvei(int rad, int kol){
		ArrayList<Rute> vei = new ArrayList<>();
		ArrayList<Rute> start = new ArrayList<>();
		start.add(this.hentRute(rad, kol));


		Runnable task = new TraadBeholder(start, vei); //Her er en oppgave
		Thread traad1 = new Thread(task); //Her er en arbeider
		traad1.start(); //Leggo
		

		try {
			traad1.join();

		} catch(Exception e) {
		
		}

		ArrayList<ArrayList<Rute>> r = utveier2.hentListe();

		for(ArrayList<Rute> v : r){
			System.out.println(v);
		}
	
	}




}
