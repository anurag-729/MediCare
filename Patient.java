package hospitalManagementSystem;

import java.sql.Connection;
import java.util.Scanner;

public class Patient {
	
	private Connection connection;
	private Scanner scanner;
	
	public Patient(Connection connection,
			Scanner scanner) {
		this.connection= connection;
		this.scanner=scanner;
	}
	
	public void addPatient() {
		System.out.println("Enter patient name: ");
		String name = scanner.next();
		
		System.out.println("Enter patient age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter patient gender: ");
		String gender = scanner.next();
	}
	
	

}
