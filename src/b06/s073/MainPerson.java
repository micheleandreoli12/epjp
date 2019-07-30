package b06.s073;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Persons[] = new Person[5];
		
		Persons[0] = new Employee("Giacomo", "Risi", 1800);
		Persons[1] = new Intern("Carlo", "Bianchi", 1000);
		Persons[2] = new Employee("Luca", "Vario", 1200);
		Persons[3] = new Employee("Ciro", "Imbonati", 1700);
		Persons[4] = new Intern("Valerio", "Buonarroti", 800);
		
		for(int i=0; i<5; i++) {
//			if(Persons[i] instanceof Employee) {
//				Employee employee= (Employee) Persons[i];
//				System.out.println(employee.toString());
//				
//			} else {
//				Intern intern= (Intern) Persons[i];
//				System.out.println(intern.toString());
//			}
			System.out.println(Persons[i].toString() );
		}
			for(int j=0; j<5; j++) {
				if(Persons[j] instanceof Employee) {
					Employee employee= (Employee) Persons[j];
					System.out.println(employee.getAnnual());
					
				}
		}
	}

}
