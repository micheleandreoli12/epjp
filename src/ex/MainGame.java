package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {

		ArrayList<Person> alive = new ArrayList<Person>();
		ArrayList<Person> jail = new ArrayList<Person>();
		ArrayList<Person> dead = new ArrayList<Person>();
		HashMap<String, Hero> heroes = new HashMap<String, Hero>();
		HashMap<String, Villain> villains = new HashMap<String, Villain>();
		HashMap<String, CommonPerson> commoners = new HashMap<String, CommonPerson>();
		HashMap<String, Person> people = new HashMap<String, Person>();

		System.out.println("Il gioco ha inizio \n ");

		Hero gigi = new Hero("Gigi");
		Hero luke = new Hero("Luke", 80);

		heroes.put("Gigi", gigi);
		heroes.put("Luke", luke);

		Villain zurg = new Villain("Zurg");
		Villain carlo = new Villain("Carlo", 90);

		villains.put("Zurg", zurg);
		villains.put("Carlo", carlo);

		CommonPerson matteo = new CommonPerson("Matteo");
		CommonPerson joao = new CommonPerson("Joao", 105);

		commoners.put("Matteo", matteo);
		commoners.put("Joao", joao);

		people.putAll(commoners);
		people.putAll(heroes);
		people.putAll(villains);

		alive.add(gigi);
		alive.add(luke);
		alive.add(zurg);
		alive.add(carlo);
		alive.add(matteo);
		alive.add(joao);

		System.out.println("I giocatori sono:");

		for (Person alives : alive) {
			System.out.println(alives.getname());
		}

		System.out.println("\nScelgli il giocatore inserendo il nome");

		Scanner scanner = new Scanner(System.in);

//	        double[] array = null;
		String choice = "";
//	        double avg;
//	        double sum=0;
		while (scanner.hasNext()) {
			if (scanner.hasNextLine()) {
				choice = scanner.next();
				Person player = people.get(choice);
				if (player != null) {
//				if (heroes.containsKey(choice) || villains.containsKey(choice) || commoners.containsKey(choice)) {
					System.out.println("Hai scelto " + choice);
				} else {
					System.out.println("Bad input, discarded: " + scanner.next());
				}
//	               break;
			} else {
				System.out.println("Bad input, discarded: " + scanner.next());
			}
			if (people.get(choice) instanceof Hero) {
				System.out.println(choice + " é un " + heroes.get(choice).getclass());
			} else if (people.get(choice) instanceof Villain) {
				System.out.println(choice + " é un " + villains.get(choice).getclass());
			} else {
				System.out.println(choice + " é un " + commoners.get(choice).getclass());
			}
			break;
		}
//	        System.out.println("Inserire i numeri");
//	        
//	        for(int i=0; i<lenght; i++) {
//	        	if (scanner.hasNextDouble()) {
//	        	array[i]=scanner.nextDouble();
//	        	sum += array[i];
//	        	} else {
//	        		 System.out.println("Bad input, discarded: " + scanner.next());
//	        		 i -= 1;
//	        	}
//	        
//	        	}
//	        avg = sum/lenght;
//	        

		scanner.close(); // see try-with-resources

	}

}
