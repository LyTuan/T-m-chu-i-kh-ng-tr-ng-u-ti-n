package Collector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	public static void main(String avgs[]){
		ArrayList <Student> arr  = new ArrayList <>();
		arr.add(new Student("Ngoan",19));
		arr.add(new Student ("Minh",18));
		arr.add(new Student ("Tuan",14));
		arr.add(new Student ("Duc",14));
		System.out.println("After sort by age:");
		Collections.sort(arr,new AgeComparator() );
		Iterator itr = arr.iterator();
		while(itr.hasNext()){
			Student st = (Student) itr.next();
			System.out.println(st.getName()+" "+st.getAge());
		}
		System.out.println("After sort by name:");
		Collections.sort(arr,new NameComparator());
		Iterator itr1 = arr.iterator();
		while(itr1.hasNext()){
			Student st = (Student) itr1.next();
			System.out.println(st.getName()+" "+st.getAge());
		}
	}
}
