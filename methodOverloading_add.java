<<<<<<< HEAD
class methodOverloading_add {
		
		public static void main(String Args[])
		{
			methodOverloading_add mO = new methodOverloading_add();
			mO.add( 5 , 7 );
			mO.add( 10.2 , 15.3 );
		}

		void add(int n1, int n2)
		{
			int sum = n1+n2;
			System.out.println(sum);
		}
			
		void add(double n1, double n2)
		{
			double sum = n1+n2;
			System.out.println(sum);
		}

}
=======
// This is a method overloading for an addition operation.
class methodOverloading_add {
		
		public static void main(String Args[])
		{
			methodOverloading_add mO = new methodOverloading_add();
			mO.add( 5 , 7 );
			mO.add( 10.2 , 15.3 );
		}

		void add(int n1, int n2)
		{
			int sum = n1+n2;
			System.out.println(sum);
		}
			
		void add(double n1, double n2)
		{
			double sum = n1+n2;
			System.out.println(sum);
		}

}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
