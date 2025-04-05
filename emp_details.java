<<<<<<< HEAD

import java.util.Scanner;

class person {
    
	String name;
    int age;
    String address;
	String gender;

    public person(String name, int age, String address, String gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
    }

    public void displayPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Gender: " + gender);
	}
}

class employee extends person 
{
	int employeeNumber;
	double salary;
	String department;

    public employee(String name, int age, String address, String gender, int employeeNumber, double salary, String department) 
	{
		super(name, age, address, gender);
		this.employeeNumber = employeeNumber;
		this.salary = salary;
		this.department = department;
    }

    public void displayEmployeeDetails() 
	{
		System.out.println("Employee Number: " + employeeNumber);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
	}
}

public class emp_details {
    public static void main(String[] args) 
	{
        
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name : ");
		String name = scan.next();

		System.out.println("Enter the age : ");
		int age = scan.nextInt();

		System.out.println("Enter the address : ");
		String address = scan.next();

		System.out.println("Enter the gender : ");
		String gender = scan.next();
		
		System.out.println("Enter the Phone Number : ");
		int employeeNumber = scan.nextInt();

		System.out.println("Enter the Salary : ");
		int salary = scan.nextInt();

		System.out.println("Enter the Employee Department : ");
		String department = scan.next();

		employee emp = new employee();

        emp.displayEmployeeDetails();
    }
}
=======
//This is employee details in java program.
class Person {
    
	String name;
    	int age;
    	String address;
	String gender;

    	public Person(String name, int age, String address, String gender) 
	{
        	this.name = name;
        	this.age = age;
        	this.address = address;
		this.gender = gender;
    	}

    	public void displayPersonDetails() 
	{
        	System.out.println("Name: " + name);
        	System.out.println("Age: " + age);
        	System.out.println("Address: " + address);
		System.ouut.println("Gender: " + gender);
    	}
}

class Employee extends Person 
{
    	int employeeNumber;
    	int salary;
    	String department;

    	public Employee(String name, int age, String address, String gender, int employeeNumber, double salary, String department) 
	{
        	super(name, age, address, gender);
	        this.employeeNumber = employeeNumber;
        	this.salary = salary;
        	this.department = department;
    	}

    	public void displayEmployeeDetails() 
	{
        	System.out.println("Employee Number: " + employeeNumber);
        	System.out.println("Name: " + name);
        	System.out.println("Salary: " + salary);
        	System.out.println("Department: " + department);
    	}
}

public class emp_details {
    	public static void main(String[] args) 
	{
        
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name : ");
		name = scan.next();

		System.out.println("Enter the age : ");
		age = scan.nextInt();

		System.out.println("Enter the address : ");
		address = scan.next();

		System.out.println("Enter the gender : ");
		gender = scan.next();
		
		System.out.println("Enter the Phone Number : ");
		employeeNumber = scan.nextInt();

		System.out.println("Enter the Salary : ");
		salary = scan.nextInt();

		System.out.println("Enter the Employee Department : ");
		department = scan.next();

		Employee emp = new Employee();

        	emp.displayEmployeeDetails();
    	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
