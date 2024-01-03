package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.Any;

//collections framework provide many built in data structures and its corresponding operations
//making it easier to work with them, saving efforts of scratch implementation

//List
//dynamic sized ordered collection of data like an array but without static predifined size. no fixed datatype like in array

//Set
//dynamic list of elements where duplicate elements are not allowed. if an element is already there it ignores its add

//Map
//set of key value pairs. use keys to access the corresponding values. keys are unique.

class Student implements Comparable<Student>{
	int roll_number;
	String name;
	
	public Student(int num, String name) {
		this.roll_number = num;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
	
		if(roll_number > o.roll_number) return 1;
		else if(roll_number < o.roll_number) return -1;
		else return 0;
	}
	
	
}




public class CollectionPractice {

	public static void main(String[] args) {
	
		List myList = new ArrayList();
		
		myList.add("Arun");
		myList.add("Shubham");
		myList.add("Chirag");
		myList.add(1);
		
		//iterator used to traverse the list
		Iterator itr = myList.iterator() ;
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		myList.remove(1);
		System.out.println(myList.size()); 
		
		
		//Set implementation
		System.out.println("Set implementation below");
		
		Set<String> mySet = new TreeSet<String>(); //linked hashet maintains insertion order
		//treehashset ascending order sorts and HashSet no ordering
		
		mySet.add("Chirag");
		mySet.add("Arun");
		
		
		//iterator used to traverse the list
		Iterator itr2 = mySet.iterator() ;
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		//Map implementation
		System.out.println("Map implementation below");
		
		Map myMap = new HashMap<Integer, String>();
		
		myMap.put(1, "Arun");
		myMap.put(2, "Chirag");
		// map has to be converted to set to iterate
		Iterator mapitr = myMap.entrySet().iterator();
		
		while(mapitr.hasNext()) {
			System.out.println(mapitr.next());
		}
		
		
		//comparators
		//Comparable and Comparator both are used to sort custom objects. 
		//we create custom comparator and sort based on Any specific property of the object
		Student std1 = new Student(72, "Arun"); 
		Student std2 = new Student(12, "Shubham");
		
		List studentsList = new ArrayList<Student>();
		studentsList.add(std1);
		studentsList.add(std2);
		
		Iterator studItr = studentsList.iterator();
		System.out.println("before sort using custom comparator");
		
		while (studItr.hasNext()) {
			Student object = (Student)studItr.next();
			System.out.println(object.name + " " + object.roll_number);
		}
		
		System.out.println("after sort using custom comparator");
		Collections.sort(studentsList);

		Iterator studItr2 = studentsList.iterator();
		while (studItr2.hasNext()) {
			Student object = (Student)studItr2.next();
			System.out.println(object.name + " " + object.roll_number);
		}
	}

}
