package zadacha02;

public class Fakultet {

	public String nazivNaFakultet;
	public int brojNaSmerovi;
	public int brojNaStudenti;
	public String dekan;
	public String sedishte;
	
	public void prvMetod () {
		
		System.out.println("Zgolemuvanje na brojot na studenti za: " + (this.brojNaStudenti + (50)));
	}
	
	public int vtorMetod (int namali) {
		int namalenaVrednost = this.brojNaStudenti - namali;
		return namalenaVrednost;
	}
	
	public void tretMetod () {
		System.out.println("Naziv na fakultet: " + this.nazivNaFakultet + " So sedishte vo: " + this.sedishte);
	}
}
