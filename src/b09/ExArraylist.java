package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExArraylist {

	public static ArrayList<Integer> join(ArrayList<Integer> arraya, ArrayList<Integer> arrayb) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		ArrayList<Integer> arrayc = new ArrayList<Integer>();
//		ArrayList<Integer> arraya = aList1();
//		ArrayList<Integer> arrayb = aList1();
		for (int i = 0; i < arrayb.size() + arraya.size(); i++) {
			if (a >= arraya.size()) {
				arrayc.add(i, arrayb.get(b));
				b += 1;
			} else if (b >= arrayb.size()) {
				arrayc.add(i, arraya.get(a));
				a += 1;
			} else if (arraya.get(a) > arrayb.get(b)) {
				arrayc.add(i, arrayb.get(b));
				b += 1;
			} else if (arraya.get(a) < arrayb.get(b)) {
				arrayc.add(i, arraya.get(a));
				a += 1;
			}
		}
		return arrayc;
	}
		
		public static ArrayList<Integer> join2(ArrayList<Integer> arraya, ArrayList<Integer> arrayb) {
			// TODO Auto-generated method stub
			int a = 0;
			int b = 0;
			int i = 0;
			ArrayList<Integer> arrayc = new ArrayList<Integer>();
//			ArrayList<Integer> arraya = aList1();
//			ArrayList<Integer> arrayb = aList1();
			while (arraya.size()>=0 && arrayb.size()>=0) {
				if (arraya.size()==0 && arrayb.size()==0) {
					break;
				} else if (arraya.size()==0) {
					arrayc.add(i,arrayb.get(0));
					arrayb.remove(0);
					i++;
				} else if (arrayb.size()==0) {
					arrayc.add(i, arraya.get(0));
					arraya.remove(0);
					i++;
				} else if (arraya.get(0) > arrayb.get(0)) {
					arrayc.add(i,arrayb.get(0));
					arrayb.remove(0);
					i++;
				} else if (arraya.get(0) < arrayb.get(0)) {
					arrayc.add(i, arraya.get(a));
					arraya.remove(0);
					i++;
				}
			}
			
			return arrayc;

	}

//	private static ArrayList<Integer> aList1() {
//		return new ArrayList<Integer>(Arrays.asList(3,7,12));
//	}
//	private static ArrayList<Integer> aList2() {
//		return new ArrayList<Integer>(Arrays.asList(1,5,6));
//	}
}