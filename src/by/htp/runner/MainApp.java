package by.htp.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import by.htp.bean.Student;
import by.htp.bean.StudentAgeComparator;
import by.htp.bean.StudentNameComparator;
import by.htp.bean.StudentSurnameComparator;
import by.htp.bean.StudentsFullComparator;

import java.util.Comparator;

public class MainApp {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Brest");
		set.add("Vitebsk");
		set.add("Grodno");
		set.add("Gomel");
		set.add("Minsk");
		set.add("Mogilev");
		set.add("Pinsk");
		set.add("Borisov");
		set.add("Minsk");
		set.add("Minsk");
		set.add("Minsk");

		for (String s : set) {
			System.out.println(s);
		}

		System.out.println();
		Set<String> linkedSet = new LinkedHashSet<>();

		linkedSet.add("Brest");
		linkedSet.add("Vitebsk");
		linkedSet.add("Grodno");
		linkedSet.add("Gomel");
		linkedSet.add("Minsk");
		linkedSet.add("Mogilev");
		linkedSet.add("Pinsk");
		linkedSet.add("Borisov");
		linkedSet.add("Brest");
		linkedSet.add("Brest");
		linkedSet.add("Brest");

		for (String s : linkedSet) {
			System.out.println(s);
		}
		
		System.out.println();
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		treeSet.add("Six");
		treeSet.add("Seven");
		
		for (String s : treeSet) {
			System.out.println(s);
		}
		
		System.out.println("\nFull comparator #1:");		
		Comparator<Student> stComp1 = new StudentNameComparator().thenComparing(new StudentSurnameComparator().thenComparing(new StudentAgeComparator()));
		TreeSet<Student> treeSet1 = new TreeSet<>(stComp1);
		
		treeSet1.add(new Student("Alla", "Ivanov", 17));
		treeSet1.add(new Student("Alla", "Petrova", 18));
		treeSet1.add(new Student("Ivan", "Sidorov", 21));
		treeSet1.add(new Student("Alex", "Ivanov", 20));
		treeSet1.add(new Student("Olga", "Petrova", 16));
		treeSet1.add(new Student("Oleg", "Sidirov", 22));
		
		for (Student s : treeSet1) {
			System.out.println(s.toString());
		}
		
		System.out.println("\nFull comparator #2:");
		Comparator<Student> stComp2 = new StudentsFullComparator();
		TreeSet<Student> treeSet2 = new TreeSet<>(stComp2);
		
		treeSet2.add(new Student("Alla", "Ivanov", 17));
		treeSet2.add(new Student("Alla", "Petrova", 18));
		treeSet2.add(new Student("Ivan", "Sidorov", 21));
		treeSet2.add(new Student("Alex", "Ivanov", 20));
		treeSet2.add(new Student("Olga", "Petrova", 16));
		treeSet2.add(new Student("Oleg", "Sidirov", 22));
		
		for (Student s : treeSet2) {
			System.out.println(s.toString());
		}
	/*	Set<Student> treeSet2 = new TreeSet<>(new Comparator<Student>(){
			
			@Override
			public int compare(Student st1, Student st2){
				return st1.getName().compareTo(st2.getName());
			}
		});*/ 
	}
	
}
