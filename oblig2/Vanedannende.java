public class Vanedannende extends Legemiddel {
	int styrke;

	public Vanedannende(String navn, double pris, double virkestoff, int styrke){
		super(navn, pris, virkestoff);
		this.styrke = styrke;
	}
	public int hentStyrke(){
	return styrke;
	}
}
