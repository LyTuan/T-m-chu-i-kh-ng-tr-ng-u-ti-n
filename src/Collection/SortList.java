package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SortList {
	public static void main(String avgs[]){
		ArrayList <String> list = new ArrayList<>();
		list.add("Viru");
		list.add("saruka");
		list.add("Murked");
		list.add("Talher");
		Collections.sort(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//Sort with wrapper
		ArrayList list1 = new ArrayList();
		list1.add(Integer.valueOf(201));
		list1.add(Integer.valueOf(204));
		list1.add(Integer.valueOf(2004));
		Collections.sort(list1);
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}
