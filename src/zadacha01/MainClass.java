package zadacha01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avtomobil automobil = new Avtomobil ("Volkswagen", "Golf", "crna", 50.000, 2007, "PP-6385-GA");
		automobil.prvMetod();
		System.out.println(automobil.vtorMetod());
	}

}
