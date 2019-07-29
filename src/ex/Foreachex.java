package ex;

public class Foreachex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		int[] array = {5, 2, 6};
		for(int value:array)   {
			value += k;	
		}
		for(int value:array) {
			System.out.println(value);
		}
		
		

	}

}
