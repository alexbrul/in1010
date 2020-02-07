class Presept extends HvitResept{

	private int rabatt = 100;

	public Presept(Legemiddel legemiddel, Lege utskrivendeLege, 
			int pasientId){
	
		super(legemiddel, utskrivendeLege, pasientId, 3);	

	}
	@Override
	public double prisAaBetale(){
		double pris2 = pris - 108;
		if(pris < 0) return 0;
		return pris;
	}


}
