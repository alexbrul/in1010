import java.io.File;
class Main{

	public static void main(String[] args){
		Labyrint a = Labyrint.lesFraFil(new File("labyrinter/1.in"));
		a.printLab();
		a.finnUtvei(1, 1);
	
	}
}
