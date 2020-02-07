class HvitResept extends Resept{

	private int rabatt = 0;

	public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, 
			int pasientId, int reit){
	
		super(legemiddel, utskrivendeLege, pasientId, reit);	


	}
	@Override
	public double prisAaBetale(){
		return pris - (pris * rabatt/100);
	}
	@Override
	public String farge(){
		return "hvit";
	}

}
