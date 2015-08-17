package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	public static void main(String avgs[]){
		ArrayList<Students> student = new ArrayList<>();
		student.add(new Students("adi",10));
		student.add(new Students("bubu",12));
		student.add(new Students("bee",13));
		Collections.sort(student);
		Iterator itr = student.iterator();
		while(itr.hasNext()){
			Students st =(Students) itr.next();
			System.out.println(st.getName()+ " "+ st.getAge());
		}
	}
	
	

}
