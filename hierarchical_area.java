<<<<<<< HEAD
import java.util.Scanner;

class shape
{
    void cal_area(){
		System.out.println("This is the calculated area ");		
    }
}

class rectangle extends shape
{	
	Scanner scan = new Scanner(System.in);
	void says(){
		System.out.println("Enter the Length :");
		int l = scan.nextInt();

		System.out.println("Enter the Width :");
		int w = scan.nextInt();
			
		int rectangle = l * w;
		super.cal_area();
		System.out.println("of rectangle = " + rectangle);		
	}
}

class triangle extends shape
{
	Scanner scan = new Scanner(System.in);
	void says(){
		System.out.println("Enter the Base :");
		double b = scan.nextDouble();

		System.out.println("Enter the Height :");
		double h = scan.nextDouble();

		double triangle = b * h * 0.5;
		super.cal_area();
		System.out.println("of triangle = " + triangle);
	}
}

class hierarchical_area
{
    public static void main(String[] args) 
	{
        rectangle c1 = new rectangle();
        triangle c2 = new triangle();
	
	c1.says();
    c2.says();
	}
}
=======
//This is a hierarchical class program for calculating the Areas of Rectangle and Triangle using Java.
import java.util.Scanner;

class shape
{
    void cal_area(){
		System.out.println("This is the calculated area ");		
    }
}

class rectangle extends shape
{	
	Scanner scan = new Scanner(System.in);
	void says(){
		System.out.println("Enter the Length :");
		int l = scan.nextInt();

		System.out.println("Enter the Width :");
		int w = scan.nextInt();
			
		int rectangle = l * w;
		super.cal_area();
		System.out.println("of rectangle = " + rectangle);		
	}
}

class triangle extends shape
{
	Scanner scan = new Scanner(System.in);
	void says(){
		System.out.println("Enter the Base :");
		double b = scan.nextDouble();

		System.out.println("Enter the Height :");
		double h = scan.nextDouble();

		double triangle = b * h * 0.5;
		super.cal_area();
		System.out.println("of triangle = " + triangle);
	}
}

class hierarchical_area
{
    public static void main(String[] args) 
	{
        rectangle c1 = new rectangle();
        triangle c2 = new triangle();
	
	c1.says();
    c2.says();
	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
