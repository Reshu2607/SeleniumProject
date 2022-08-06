package TestPackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractices {
	
public static void main (String args[]) {
	Queue<String>priorityQueue=new PriorityQueue<>();
	priorityQueue.add("Sachin");
	priorityQueue.add("Nitin");
	priorityQueue.add("Nitin");
	// priorityQueue.poll();
	System.out.println(priorityQueue.contains("Sachin"));
	
	Iterator<String> it = priorityQueue.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println(priorityQueue.isEmpty());
}
}
