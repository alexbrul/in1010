public class SortertLenkeliste<T extends Comparable<T>> extends Lenkeliste<T>{


//https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html





	class Node<T> implements Comparable<T> {
		public T verdi;
		Node<T> neste = null;

		protected Node(T t){
			this.verdi = t; 
		}
/*
		public int compareTo(Node<T> t2){
			if(verdi == t2.verdi){
				return 0;
			}else if(verdi > t2.verdi){
			return 1;
			}
		
		}*/
		public int compareTo(T v){
			T tmp = verdi;
			T tmp2= v; 
			if(tmp>verdi) return true; 
			return verdi.compareTo(v);
		
		}
		public T hentVerdi(){
			return verdi;
		}
	}


	public void leggTil(T t){

		Node<T> nyNode = new Node<>(t);

		if(noder==0){
			super.leggTil(t);
			return;
		}

		int teller = 0;
		//while(nyNode.compareTo(hent(teller)) > 0 && (teller<noder-1)){
		while(nyNode.compareTo(hent(teller)) > 0 && (teller<noder-1)){
			System.out.println("test:nyverdi " + nyNode.verdi + ", compareto: " + hent(teller) + ", er lik: " + nyNode.compareTo(hent(teller)));
			teller++;
		}
		super.leggTil(teller, t);
	}

	public void sleggTil(int pos, T t){
		throw new UnsupportedOperationException();
	}
	//@Override
	public T fjern(){
		System.out.println("fjerner en, noder: " + noder);
		return super.fjern(noder-1);
	}
	//@Override
	public void ssett(int pos, T t){
		throw new UnsupportedOperationException();
	}
	//Sorterer med de storste forst saa jeg kan burke lenkelisten sin fjern






	




}



