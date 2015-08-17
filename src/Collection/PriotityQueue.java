package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriotityQueue {
	public static void main(String avgs[]){
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Arris");
		queue.add("Demo");
		queue.add("java");
		queue.add("Arris");
		queue.add("Tuan");
		System.out.println("First:"+queue.element());
		System.out.println("First:"+queue.peek());
		Iterator itr = queue.iterator();
		System.out.println("The elements of queue are:");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Last"+queue.remove());
		System.out.println("Last:"+queue.poll());
	}
}
