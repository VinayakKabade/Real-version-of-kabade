package java_Collection;

import java.util.*;

public class PriorityQueueSamples {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("roopa");
		queue.add("rama");
		queue.add("roopesh");
		System.out.println("head " + queue.element());
		System.out.println("head " + queue.peek());
		System.out.println("iterating queue elements ");
		Iterator itr = queue.iterator();

		while (itr.hasNext()) // checks weather queue array has any element if true prints (itr.next)
		{
			System.out.println(itr.next());
		}

		// for(String itr1:queue)
		// System.out.println(itr1);

		//queue.remove();
		//queue.poll();
		queue.poll();     //if queue is empty return null.
		queue.remove();
		queue.remove();   // both remove and poll does same work i.e removing of element
		queue.remove();   //if queue is empty return exception:-Exception in thread "main" java.util.NoSuchElementException
		System.out.println("removing elements from queue ");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}