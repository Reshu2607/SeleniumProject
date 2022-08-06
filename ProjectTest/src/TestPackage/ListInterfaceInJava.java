package TestPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListInterfaceInJava {
	
	public static void main(String args[]) {
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("fromArrayList");
		arrayList.add("second element From ArrayList");
		LinkedList<String> list= new LinkedList<>();
		list.add("AS");
		list.add("Abc");
		list.add("Abc");
		list.add("Abcd");
		list.add("Ab");
		System.out.println(list.containsAll(arrayList));
		list.addAll(arrayList);
		System.out.println(list.contains("fromArrayList"));
		System.out.println(list.contains("fromarrayList"));
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.containsAll(arrayList));
		list.remove();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {

	    System.out.println(it.next());
		}
		//arrayList.removeAll(arrayList);
		arrayList.clear();
		System.out.println("##################################");
		Iterator<String> it1= arrayList.iterator();
		while(it1.hasNext()){
		System.out.println(it1.next());	
		}
		
}
}
