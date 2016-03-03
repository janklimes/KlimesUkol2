package kolo;

public class main {

	public static void main(String[] args) {
		kruznice mojeKruznice=new kruznice(5);
		System.out.println("mojeKruznice.obsah() " + mojeKruznice.obsah());
		System.out.println(kruznice.obsahKruznice(5));
		System.out.println (mojeKruznice.getPolomer());
		mojeKruznice.setPolomer(10);
		System.out.println(mojeKruznice.obsah());

		kruznice mojeKruznice2=new kruznice(10);
		System.out.println(mojeKruznice2.obsah());
		System.out.println(kruznice.obsahKruznice(7));

		
//		kruznice mojeKruznice = new kruznice();
//		mojeKruznice.polomer=1;
//		double obsah = mojeKruznice.obsah();
//		System.out.println(obsah);
		// TODO Auto-generated method stub

	}

}
