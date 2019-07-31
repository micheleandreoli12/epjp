package b08;

import java.util.Scanner;

import b06.s069.Mammal;

public class ScannerAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Di quanti numeri vuoi fare la media");

	        Scanner scanner = new Scanner(System.in);
	      
	        double[] array = null;
	        int lenght=0;
	        double avg;
	        double sum=0;
	        while (scanner.hasNext()) {
	            if (scanner.hasNextInt()) {
	               lenght = scanner.nextInt();
	               array= new double[lenght];  
	               break;
	            } else {
	                System.out.println("Bad input, discarded: " + scanner.next());
	            }
	        }
	        System.out.println("Inserire i numeri");
	        
	        for(int i=0; i<lenght; i++) {
	        	if (scanner.hasNextDouble()) {
	        	array[i]=scanner.nextDouble();
	        	sum += array[i];
	        	} else {
	        		 System.out.println("Bad input, discarded: " + scanner.next());
	        		 i -= 1;
	        	}
	        
	        	}
	        avg = sum/lenght;
	        
	            
	            
	        scanner.close(); // see try-with-resources
	        System.out.println("La media è " + avg);
	    }
	}
