package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee("Petro", 74, 10.76);
		File file = new File("serializeOS");
		Methods.serialize(file,employee);
		System.out.println(Methods.deserealize(file));
		System.out.println();
		System.out.println("Collection");
		
		File fileCollection = new File("serializeCollection");
		ArrayList<Employee> employeeCollection = new ArrayList<Employee>();
		employeeCollection.add(new Employee("Alex", 25, 7.84));
		employeeCollection.add(new Employee("Ivan", 28, 10.98));
		employeeCollection.add(new Employee("Taras", 34, 8.88));
		employeeCollection.add(new Employee("Andrue", 31, 11.05));
		employeeCollection.add(new Employee("Serg", 19, 5.87));
		
		Iterator iterator = employeeCollection.iterator();
		while (iterator.hasNext()) {
			Employee next = (Employee) iterator.next();
			Methods.serialize(fileCollection,next);
			System.out.println(Methods.deserealize(fileCollection));
		}
		
	}

}
