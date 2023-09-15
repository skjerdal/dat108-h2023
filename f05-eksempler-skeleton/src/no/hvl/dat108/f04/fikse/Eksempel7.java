package no.hvl.dat108.f04.fikse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Eksempel7 / Gjøre sammen i timen
 * 
 * Øve oss litt på litt flere grunnleggende 
 *  - source		IntStream.range(), Stream.iterate(), Stream.of()
 *  - intermediate	filter(), map(), limit(), distinct(), sorted()
 *  - terminal 		forEach(), collect(), toList()
 *  
 * operations på streams.
 */

public class Eksempel7 {
	
	public static void main(String[] args) {
		
		// ... Har fjernet de tingene vi gjorde sist gang ...
		
		//For en stream av strenger, samle dem opp i en ny string, sortert
		//og uten duplikater. Skriv deretter ut resultatet.
		System.out.println("\n");
		System.out.println("Sorterte strenger uten duplikater");
		//TODO
		String s = Stream.of("Per", "Knut", "Anne", "Per")
			.distinct()
			.sorted()
			.collect(Collectors.joining(" "));
		System.out.println(s);
		
		//For en stream av strenger, samle dem sortert på stringlengde, 
		//uten duplikater i en ny liste. Skriv deretter ut listen.
		System.out.println();
		System.out.println("Sorterte strenger uten duplikater");
		//TODO
		List<String> ls =Stream.of("Per", "Knuto", "Anne", "Per")
				.distinct()
				.sorted((s1,s2) -> s1.length() - s2.length())
				.toList();
		System.out.println(ls);

		
	}
}





