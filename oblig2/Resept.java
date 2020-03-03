public abstract class Resept{

	public int id;
	public static int idTeller = 0;
	public int pasientId;
	public Legemiddel legemiddel;
	public Lege refLege;
	public int reit;
	public double pris;


	public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
		this.pasientId = pasientId; this.legemiddel = legemiddel;
		this.refLege = utskrivendeLege; 
		this.reit = reit;
		id = idTeller++;
		this.pris = legemiddel.hentPris();
	}

	public int hentId(){
		return id;
	}
	public Legemiddel hentLegemiddel(){
		return legemiddel;
	}

	public Lege hentLege(){
		return refLege;
	} 

	public int hentPasientId(){
		return pasientId;
	}

	public int hentReit(){
		return reit;
	}

	public boolean bruk(){
		if(reit>0){
			reit--; return true;
		}
		return false;
	}

	abstract public String farge();

	abstract public double prisAaBetale();

}
