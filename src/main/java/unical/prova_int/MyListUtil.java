package unical.prova_int;


import java.util.List;

public class MyListUtil {
	
	public MyListUtil() {
		
	}
	
	public List<Integer> sort (List<Integer> list, int order){
		
		if (order==0) {
			for (int i=0; i<list.size(); i++) {
				for (int j=i; j<list.size(); j++) {
					if (list.get(i) > list.get(j)) {
						Integer tmp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, tmp);
					}
				}
			}
		} else {
			for (int i=0; i<list.size(); i++) {
				for (int j=i; j<list.size(); j++) {
					if (list.get(i) < list.get(j)) {
						Integer tmp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, tmp);
					}
				}
			}
		}
		
		
		return list;
	}

}
