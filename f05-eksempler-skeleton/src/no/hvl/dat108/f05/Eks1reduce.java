package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks1reduce {
	
	public static void main(String[] args) {
		
		/* Summen av aldre av personer i people-listen */
		
		// Summen av aldre med vanlig +
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (sum, alder) -> sum + alder);
		
		// Alternativt med Integer.sum
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (akk, alder) -> Integer.sum(akk, alder));
		
		// Med metodereferanse
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, Integer::sum);
		
		// Alternativt med IntStream (Stream av int)
		int sumAlder = people.stream()
				.mapToInt(p -> p.getAge())
				.sum();
		
		System.out.println(sumAlder);
		
		
		/* En streng med alle initialene, "CD LC TC CB MA" */

		// Samle opp med reduce og +
		String initialer = people.stream()
				.map(p -> "" + p.getFirstName().charAt(0))
				.reduce("", (res, fi) -> res + " " + fi).trim();


		// Alternativt med collect og Collectors.joining
//		String initialer = TODO

		System.out.println("|" + initialer + "|");
		
	}	

}










