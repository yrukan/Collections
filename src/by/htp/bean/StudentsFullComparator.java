package by.htp.bean;

import java.util.Comparator;

public class StudentsFullComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().compareTo(o2.getName()) == 0)
		  if(o1.getSurname().compareTo(o2.getSurname()) == 0)
			  if((o1.getAge() - o2.getAge()) == 0)
				  return 0;
			  else return o1.getAge() - o2.getAge();
		  else return o1.getSurname().compareTo(o2.getSurname());
		else return o1.getName().compareTo(o2.getName());
		
	}
	
}
