package zadacha03;

public class PC {
	
	public int memorija;
	public String tipNaMemorija;
	public int ssd;
	public String golemina = "GB";
	
	public PC () {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.ssd =256;
	}
	
	public void metod (int zgolemenaMemorija, int zgolemenSsd) {
		System.out.println("Memorijata beshe " + this.memorija + golemina + ", " + "sega iznesuva " + zgolemenaMemorija + golemina + ".");
		System.out.println("Tipot na memorija e " + this.tipNaMemorija + ".");
		System.out.println("SSD ima golemina od " + zgolemenSsd + golemina + "." + "Predhodno iznesuvashe " + this.ssd  + golemina + ".");
		
		
		
	}
	
}