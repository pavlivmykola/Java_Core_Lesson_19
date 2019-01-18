package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	
	public static void serialize(File file, Employee employee) throws IOException {

		OutputStream fOS = new FileOutputStream(file);
		ObjectOutputStream oOS = new ObjectOutputStream(fOS);
		oOS.writeObject(employee);
		oOS.close();
		fOS.close();
		
	
	}
	public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
		
		InputStream fIS = new FileInputStream(file);
		ObjectInputStream oIS = new ObjectInputStream(fIS);
		Serializable employee = (Employee) oIS.readObject();
		oIS.close();
		fIS.close();
		return employee;
		
	}
}
