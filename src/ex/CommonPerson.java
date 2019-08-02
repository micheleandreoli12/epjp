package ex;

public class CommonPerson extends Person {

	CommonPerson(String name) {
		super(name);
	}
	
	CommonPerson(String name, int energy) {
		super(name,energy);
	}
	
	public String getclass() {
		return "comune cittadinio eroe di tutti i giorni";
	}

}
