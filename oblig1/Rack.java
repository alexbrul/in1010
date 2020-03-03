import java.util.ArrayList;
public class Rack{
	int antNoder;
	ArrayList<Node> rack = new ArrayList<>();	
	public Rack(int antNoder){
		this.antNoder = antNoder;
	
	}

	public int storrelse(){
		return rack.size();
	}

	public boolean leggTil(Node n){
		if(rack.size()<antNoder){
			rack.add(n);	
			return true;
		}
		return false;	
	}

	public int minne(){
		int tmp = 0;
		for(Node node : rack){
			tmp = tmp + node.minne;
		}
		return tmp;
	}


	public int prosessorer(){
		int tmp = 0;
		for(Node node : rack){
			tmp = tmp + node.prosessorer;
		}
		return tmp;
	}
	public int nokMinne(int mminne){
		int tmp = 0;
		for(Node node: rack){
			if(node.minne>=mminne){
			tmp = tmp+1;
			}
		}
		return tmp;
	}

}
