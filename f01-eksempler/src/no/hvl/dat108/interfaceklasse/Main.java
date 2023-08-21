package no.hvl.dat108.interfaceklasse;


public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Vi foretrekker å la interface-typen (Skapning) være
		 * datatypen til variabelen (fido).
		 */
		Skapning fido = new Hund();
		fido.siHei();
		
		/*
		 * Eksempel på at det er mulig å definere en klasse (Katt)
		 * inni en metode i en annen klasse (Main). Indre klasse.
		 */
		class Katt implements Skapning {
			@Override
			public void siHei() {
				System.out.println("Mieao!");
			}
		}
		Skapning spinn = new Katt();
		spinn.siHei();
		
		/*
		 * Eksempel på at det er mulig å definere en anonym indre
		 * klasse til engangsbruk for å opprette et objekt.
		 * Dette skal vi se mer på i forbeindelse med lambda-uttrykk.
		 */
		Skapning bergenser = new Skapning() {
			@Override
			public void siHei() {
				System.out.println("Hallaien!");
			}
		};
		bergenser.siHei();
	}
}
