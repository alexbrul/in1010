class Militaerresept extends HvitResept{

	private int rabatt = 100;

	public Militaerresept(Legemiddel legemiddel, Lege utskrivendeLege, 
			int pasientId, int reit){
	
		super(legemiddel, utskrivendeLege, pasientId, reit);	

	}
	@Override
	public double prisAaBetale(){
		return this.pris - (this.pris * rabatt/100);
	}


}
