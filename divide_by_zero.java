//Arithmetic Exception in Java Program
class divide_by_zero {
    
    int divide(int x, int y) {
		try {
				int res = x / y; //Condition
				return (res); //Return the value
        } catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception:cannot divide by zero!! ");
			return -1;
        }
    }

    public static void main(String[] args) {
        DividebyZero d= new DividebyZero();
		int result=d.divide(25,0);

		if(result!= -1) {
			System.out.println("Result= "+result);
        }
    }
}