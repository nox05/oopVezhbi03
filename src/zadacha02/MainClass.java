package zadacha02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fakultet fakultet1 = new Fakultet ();
		fakultet1.nazivNaFakultet = "FIKT";
		fakultet1.brojNaSmerovi = 5;
		fakultet1.brojNaStudenti = 250;
		fakultet1.dekan = "Pece Mitrevski";
		fakultet1.sedishte = "Bitola";
		
		fakultet1.prvMetod();
		System.out.println("Namalen broj na studenti: " + fakultet1.vtorMetod(50));
		fakultet1.tretMetod();
		
		Fakultet fakultet2 = new Fakultet ();
		fakultet2.nazivNaFakultet = "TFB";
		fakultet2.brojNaSmerovi = 4;
		fakultet2.brojNaStudenti = 400;
		fakultet2.dekan = "Stojanche Nushev";
		fakultet2.sedishte = "Bitola";
		
		fakultet2.prvMetod();
		System.out.println("Namalen broj na studenti: " + fakultet2.vtorMetod(50));
		fakultet2.tretMetod();
	}

}
