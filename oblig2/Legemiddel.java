public abstract class Legemiddel{

	public String navn;
	private double pris;
	private double virkestoff;
	public static int idteller = 0;
	public int id;

	public Legemiddel(String navn, double pris, double virkestoff){
		this.navn = navn; this.pris = pris; this.virkestoff = virkestoff;
		this.id = idteller; 
		
		idteller++;
	}

	public String hentNavn(){
		return navn;	
	}
	public int hentId(){
		return id;	
	}
	public double hentPris(){
		return pris;
	}
	public double hentVirkestoff(){
		return virkestoff;
	}

	public void settNyPris(double p){
		this.pris = p;
	}


}
