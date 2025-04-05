<<<<<<< HEAD
import java.util.Scanner;

class array_code{
	@SuppressWarnings("resource")
	public static void main(String Args[]){

		Scanner input = new Scanner(System.in);

		int num[]= new int[10];
        
		for(int i=0; i<10; i++) {
			System.out.println("Enter numbers " + (i+1) + ": ");
			num[i] = input.nextInt();
		}

		for(int i=0; i<10; i++) {
			System.out.println(num[i] + " ");
		}

	}
}
=======
//Array Code of Java
import java.util.Scanner;

class array_code{
	public static void main(String Args[]){

		Scanner input = new Scanner(System.in);

		int num[]= new int[10];
        
		for(int i=0; i<10; i++)
		{
		       	System.out.println("Enter numbers " + (i+1) + ": ");
        		num[i] = input.nextInt();
		}

		for(int i=0; i<10; i++)
		{
			System.out.println(num[i] + " ");
		}

	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
