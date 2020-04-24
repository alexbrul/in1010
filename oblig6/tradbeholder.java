import java.util.ArrayList;


class Traadbeholder implements Runnable{
	Rute rute;
	ArrayList<Rute> sti;
	static int a = 0;
	private int id;

	public Traadbeholder(Rute rute, ArrayList<Rute> sti){
		this.rute = rute; this.sti = sti;
		id = a;
		a++;

	
	
	}

	public void run(){
		//System.out.println("id:" + id + rute.toString());	
		rute.gaa(sti);
	}

}
