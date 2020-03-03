import java.util.ArrayList;
public class Dataklynge{
	int antNoder;	
	ArrayList<Rack> klynge = new ArrayList<>();

	public Dataklynge(int antNoder){
		this.antNoder = antNoder;
	}

	public void nyNode(Node n){
		for(Rack rack: klynge){
			if(rack.leggTil(n)) return ;
		}
		//Hvis den kommer hit saa maa jeg lage et nytt rack
		Rack tmprack = new Rack(antNoder);
		tmprack.leggTil(n);
		klynge.add(tmprack);
	}

	public int antProsessorer(){
		int tmp = 0;
		for(Rack rack: klynge){
			tmp = tmp + rack.prosessorer();
		}
		return tmp;
	}

	public int antMinne(){
		int tmp = 0;
		for(Rack rack: klynge){
			tmp = tmp + rack.minne();
		}
		return tmp;
	}

	public int noderMedNokMinne(int mminne){
		int count = 0;
		for(Rack rack: klynge){
			count = count + rack.nokMinne(mminne);
		}
		return count;
	}
	


}
