package b04;

public class S44main {

	public static void main(String[] args) {
		String s= "Giustina";
		
		S44Chicken c = new S44Chicken(s);
		S44Chicken c2 = new S44Chicken();
		S44Chicken c3 = new S44Chicken("Clara",497.12);
		S44Chicken c4 = new S44Chicken("Tom",218.12, false);
		S44Chicken c5 = null;
		
		System.out.println(String.valueOf(c5));
		
		System.out.println(c4.toString() + "\n" + c3);
	}

}
