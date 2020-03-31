class SvartRute extends Rute{

	public SvartRute(int rad, int kolonne, Labyrint lab){
		super(rad, kolonne, lab);
	}
	@Override
	char tilTegn(){
		return '#';
	}

}
