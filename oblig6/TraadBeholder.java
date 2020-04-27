import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class TraadBeholder implements Runnable{
	ArrayList<Rute> naboer;
	ArrayList<Rute> sti;
	static int count = 0;
	private int id;
	private final Lock lock = new ReentrantLock();

	private ArrayList<ArrayList<Rute>> utveier = new ArrayList<>();

	public TraadBeholder(ArrayList<Rute> naboer, ArrayList<Rute> sti){
		this.naboer = naboer; this.sti = sti;
	}

	public void run(){
		//System.out.println("id:" + id + rute.toString());	
		this.remove2().gaa(sti);
	}


	public Rute remove2() {
		Rute r;
		lock.lock();
		try{
			r = naboer.remove(0);
		} finally{
			lock.unlock();
		}
		return r;

	}


}
