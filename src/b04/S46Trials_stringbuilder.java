package b04;

public class S46Trials_stringbuilder {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Asdrubale");
		StringBuilder s1 = new StringBuilder("Asdrubalea");
		StringBuilder s2 = new StringBuilder(102);
		StringBuilder q = new StringBuilder("Carlo");
		StringBuilder r = new StringBuilder("");

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s.append("jk"));
		System.out.println(s2.append("jk"));
		System.out.println(r.append("jk"));
		System.out.println(s.length());
		System.out.println(s2.length());
		System.out.println(r.length());
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.delete(2, 6));
		
		System.out.println(s1.indexOf("bale"));
		
		System.out.println(s1.insert(2, "scimmia"));
		System.out.println(s1.insert(5, "scimmia"));
		
		System.out.println(s1.replace(7,15,"si può fare "));
		
		System.out.println(q.reverse());
		
		q.setCharAt(2, 'C');
		System.out.println(q);
		
		q.setLength(2);
		System.out.println(q);


	}

}
