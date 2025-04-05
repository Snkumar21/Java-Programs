<<<<<<< HEAD
import java.util.Scanner;

class calc{
	public static void main(String Args[]){

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a number 1: ");
				int n1 = scan.nextInt();
			System.out.println("Enter a number 2: ");
				int n2 = scan.nextInt();
			
			calc cal = new calc();

			cal.add(n1,n2);
			cal.sub(n2, n2);
			cal.mul(n1, n2);
			cal.div(n2, n2);
		}
	}
	
	void add(int a, int b){

		int add1 = a+b;
		System.out.println(add1);

	}

	void sub(int a, int b){

		int sub1 = a-b;
		System.out.println(sub1);

	}

	void mul(int a, int b){
		
		int mul1 = a*b;
		System.out.println(mul1);

	}

	void div(int a, int b){

		int div1 = a/b;
		System.out.println(div1);

	}
=======
import java.util.Scanner;

class calc{

	int n1,n2;

	public static void main(String Args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number 1: ");
        	int n1 = scan.nextInt();
		System.out.println("Enter a number 2: ");
        	int n2 = scan.nextInt();
		
		calc cal = new calc();

		cal.add(n1,n2);
	}
	
	void add(int a, int b){

		int add1 = a+b;
		System.out.println(add1);

	}

	void sub(int a, int b){

		int sub1 = a-b;
		System.out.println(sub1);

	}

	void mul(int a, int b){
		
		int mul1 = a*b;
		System.out.println(mul1);

	}

	void div(int a, int b){

		int div1 = a/b;
		System.out.println(div1);

	}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
}