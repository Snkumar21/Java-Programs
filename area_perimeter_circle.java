import java.util.Scanner;

class area_perimeter_circle{
	
	@SuppressWarnings("resource")
	public static void main(String Args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		double r = scan.nextDouble();

		double pi = 3.14;

		double area = pi * r * r;

		double circle =  2 * pi * r;

		System.out.println("Area of Circle = " + area);
		System.out.println("Perimeter of Circle = " + circle);
	}
}