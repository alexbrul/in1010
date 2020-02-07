public class Spesialist extends Lege implements Godkjenningsfritak{

	public int id; 
	static int idteller = 0;

	public Spesialist(String navn){
		super(navn);
		id = idteller++;
	
	}

	public int hentKontrollID(){
		return id;
	}



}
