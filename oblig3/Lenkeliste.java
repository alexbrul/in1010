public class Lenkeliste<T> implements Liste<T>{

	protected Node<T> forste = null;
	private int noder = 0; 

	class Node<T>{
		T verdi;
		Node<T> neste = null;

		protected Node(T t){
			this.verdi = t; 
		}
	
	}
	public int stoerrelse(){
		return noder;
	}
	/*
	public void leggTil(T t){
		noder++;
		// Lager node. Hvis forste ikke finnes saa er den forste
		// hvis ikke, iterer helt til slutten. 
		Node<T> nyNode = new Node<>(t);
		if(this.forste == null){ 
			this.forste = nyNode;}
		else{
			Node<T> tmp = forste;
			while(tmp.neste!= null){
				tmp = tmp.neste;
			}
			tmp.neste = nyNode;
		}
	}
	*/
	public void leggTil(T t){
		leggTil(noder-1, t);
	}


	public T fjern(int pos){
	//kan vare tom eller forst
		Node<T> tmp = forste;
		int teller = 0; 
		if(pos == 0){
			forste = forste.neste;
			return tmp.verdi; 	
		}
		//itererer til noden for
		while(teller< pos-1){
			if(tmp.neste == null){
				System.out.println("Det er ikke nok noder i listen");
				return null;
			}	
			tmp = tmp.neste;
		}
		T ut = tmp.neste.verdi;
		tmp.neste = tmp.neste.neste; 
		noder--;
		return ut; 
	}
	public T fjern(){
		return this.fjern(noder-1);
	}

	public T hent(int pos){	
		int teller = 0;
		Node<T> tmp = forste;
		while(teller<pos){
			tmp = tmp.neste;
		}
		return tmp.verdi;
	
	}

	public void leggTil(int pos, T x){
		int teller = 0; 
		Node<T> tmp = forste;
		Node<T> nyNode = new Node<>(x);
		if(pos == 0){
			nyNode.neste = forste;
			forste = nyNode;
			return ;
		}
		while(teller<pos-1){
			tmp = tmp.neste; teller++;
		}

		nyNode.neste = tmp.neste; //Hvis tmp.neste er null saa blir den nye null.
		tmp.neste = nyNode;
		noder++;
		return;

	}
	public void sett(int pos, T x){
		fjern(pos);
		leggTil(pos, x);
	}






}
