public class Test{

	public static void main(String[] args){
		 Lenkeliste<Integer> l = new Lenkeliste<>();
		 l.leggTil(0);
		 l.leggTil(2);
		 l.leggTil(1,1);
		 l.leggTil(3,3);
		 System.out.println("exp: 0, 1, 2, 3, error");
		 for(int i = 0; i<4; i++){
		 	System.out.println(l.hent(i));
		 }
		 try{
		 l.leggTil(5,4);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 System.out.println("----------------------");
		 System.out.println("exp: error, 0, 1, 3, 2, error");

		 try{
		 	System.out.println(l.fjern(-1));
		 }catch(Exception e){
		 	System.out.println(e);
		 }

		 System.out.println(l.fjern()); //0
		 System.out.println(l.fjern(0));//1
		 System.out.println(l.fjern(1));//3
		 System.out.println(l.fjern()); //2

		 try{
		 	System.out.println(l.fjern());
		 }catch(Exception e){
		 	System.out.println(e);
		 }


		 l.leggTil(0);
		 l.leggTil(1);
		 l.leggTil(2);
		 l.leggTil(3);
		 l.sett(0, 100);
		 l.sett(1, 99);
		 l.sett(3, 50);

		System.out.println("exp: 100, 99, 2, 50") ;
		 for(int i = 0; i<4; i++){
		 	System.out.println(l.hent(i));
		 }


		 System.out.println("stabel-----------");

		 Stabel<Integer> l2 = new Stabel<>();


		 for(Integer i = 0; i<4; i++){
			 System.out.println("tall: " + i);
		 	l2.leggPaa(i);
			System.out.println("La paa: " + l2.hent(i));
		 }
		System.out.println("Exp: 3, 2, 1, 0");
		 for(int i = 0; i<4; i++){
			 System.out.println("fjerner gang nr " + i);
		 	System.out.println(l2.taAv());
		 }

	}




}
