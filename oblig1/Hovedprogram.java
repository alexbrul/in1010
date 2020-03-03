import java.io.File;
import java.util.Scanner;

public class Hovedprogram{

	public static void main(String[] args){

		lesFraFil("regneklynge2.txt");

	}

	public static void lesFraFil(String filnavn){
		Dataklynge abel;
		try{
			Scanner sc = new Scanner(new File(filnavn));
			abel = new Dataklynge(sc.nextInt());
			while(sc.hasNextLine()){
				int antn = sc.nextInt();
				int mpn = sc.nextInt();
				int antPro = sc.nextInt();

				for(int i = 0; i<antn; i++){
					abel.nyNode(new Node(mpn, antPro));	
				}
			}
			
		//print
		int[] a = {32, 64, 128};
		for(int i: a){
			int noder = abel.noderMedNokMinne(i);
			System.out.println("Noder med minst " + i  +" GB:" + noder);
		}
		int antp =abel.antProsessorer(); 
		int antRack = abel.klynge.size();
		System.out.println("Ant prosessorer: " + antp);
		System.out.println("Ant rack: " + antRack);


		}catch(Exception E){
			System.out.println(E);
		}
		
	
	}

}
