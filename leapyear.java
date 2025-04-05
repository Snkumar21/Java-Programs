<<<<<<< HEAD
import java.util.Scanner;

class leapyear{
	@SuppressWarnings("resource")
	public static void main(String Args[]){
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = obj.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap Year");
		}
				
	}
}
=======
// This is a leap year code using user defined structure in java.
import java.util.Scanner;

class leapyear {
	public static void main(String Args[]) {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = obj.nextInt();
		
		if(year % 400 == 0)
		{
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap Year");
		}
				
	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
