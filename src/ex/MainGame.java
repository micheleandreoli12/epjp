package ex;

import java.util.ArrayList;

public class MainGame {
	public static void main(String[] args) {
		ArrayList<Person> alive= new ArrayList<Person>();
		ArrayList<Person> jail= new ArrayList<Person>();
		ArrayList<Person> dead= new ArrayList<Person>();
		
		
		System.out.println("Il gioco ha inizio");
		
		Hero gigi= new Hero("Gigi");
		Hero luke= new Hero("Luke", 80);
		
		Villain zurg= new Villain("Zurg");
		Villain carlo= new Villain("Carlo", 90);
		
		CommonPerson matteo= new CommonPerson("Matteo");
		CommonPerson joao= new CommonPerson("Joao", 105);
		
		alive.add(gigi);
		alive.add(luke);
		alive.add(zurg);
		alive.add(carlo);
		alive.add(joao);
		
		System.out.println("I giocatori sono:");
		
		for(Person alives: alive) {
			System.out.println(alives.getname);
		}
		
		
		
		
		
		
	}

}
