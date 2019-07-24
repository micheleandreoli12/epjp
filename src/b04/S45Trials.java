package b04;

public class S45Trials {

	public static void main(String[] args) {
		String s = new String("Asdrubale");
		String s1 = new String("Asdrubalea");
		String s2 = new String("Asdrubale ");
		String q = new String("Carlo");
		String r = new String("");

//		System.out.println(s.charAt(5));
//		System.out.println(q.charAt(3));

//		System.out.println(s.compareTo(q));

//		System.out.println(s.concat(s.concat(q)));

//	 System.out.println(s.contains("dr"));

		System.out.println(s.equals("Asdrub"));

		System.out.println(q.indexOf(67));
		System.out.println(q.indexOf(97));

		System.out.println(s.indexOf("dru"));

		System.out.println(r.isEmpty());

		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.lastIndexOf(97));

		System.out.println(s1.length());

		String t[] = s.split("r");
		System.out.println(t[0]);
		System.out.println(t[0].length());
		System.out.println(t[1].length());

		System.out.println(q.substring(2));
		System.out.println(s.substring(5));
		System.out.println(s.substring(2, 5));

		System.out.println(s1.replace("a", "h"));

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		System.out.println(s2.trim());
		System.out.println(s.length());
		System.out.println(s2.length());
		
		System.out.println(String.join("-",s, q));
		
		System.out.println(String.valueOf("Asd"));
		
		
 
	}

}
