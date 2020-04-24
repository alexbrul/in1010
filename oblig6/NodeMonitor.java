import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;

class NodeMonitor {
	private final Lock lock = new ReentrantLock();
	private ArrayList<ArrayList<Rute>> utveier = new ArrayList<>();

	public void add(ArrayList<Rute> r) {
		lock.lock();
		try{
			utveier.add(r);
			System.out.println("adder utvei til liste: " + r);	
		} finally{
			lock.unlock();
		}

	}

	public ArrayList<ArrayList<Rute>> hentListe(){
		return utveier;
	}
}


