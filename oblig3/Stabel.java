class Stabel<T> extends Lenkeliste<T>{



	public void leggPaa(T t){
		super.leggTil(t);
	}
	public T taAv(){
		return super.fjern(super.noder-1);
	}

}
