package zadacha04;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brojNaFrlanja;
		
		Brojach brNaPismo = new Brojach();
		Brojach brNaGlava = new Brojach();
	
		Scanner skener = new Scanner (System.in);
		System.out.println("Vnesete broj na frlanja na parichkata: ");
		brojNaFrlanja = skener.nextInt();
		
		while (brojNaFrlanja > 0) {
			brNaPismo.reset();
			brNaGlava.reset();
			
			for(int i=0; i<brojNaFrlanja; i++)
			{
				if(Math.random() < 0.5)
					brNaPismo.zgolemi();
				else
					brNaGlava.zgolemi();
			}
		System.out.println("Vo " + brojNaFrlanja + " frlanja");
		System.out.println("Padnaa: " + brNaPismo.brojach + " pisma");
		System.out.println("Padnaa: " + brNaGlava.brojach + " glavi");
		
		System.out.println("Dokolku sakate povtorno frlanje, vnesete broj na frlanja: ");
		brojNaFrlanja = skener.nextInt();
		
		}
		skener.close();
	}
}


