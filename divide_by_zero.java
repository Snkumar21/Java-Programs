<<<<<<< HEAD
class divide_by_zero {
    
    	int divide(int x, int y)
	{
        	/*int res=x/y;
        	return res;*/
        	
		try
		{
            		int res=x/y;
            		return (res);
        	}
	        catch(ArithmeticException e)
		{
	            	System.out.println("Arithmatic Exception:cannot divide by zero!! ");
            		return -1;
        	}
    	}

    	public static void main(String[] args) 
	{
        	divide_by_zero d= new divide_by_zero();
        	int result=d.divide(25,0);
        	
		//Exception occurs as y=0
        	if(result!= -1)
		{
	 	       	System.out.println("Result= "+result);
        	}
    	}
}
=======
//Arithemtic Exception in Java Program
class divide_by_zero {
    
    	int divide(int x, int y)
	{
		try
		{
            		int res = x / y; //Conditon
            		return (res); //Return the value
        	}
	        catch(ArithmeticException e)
		{
	            	System.out.println("Arithmatic Exception:cannot divide by zero!! ");
            		return -1;
        	}
    	}

    	public static void main(String[] args) 
	{
        	DividebyZero d= new DividebyZero();
        	int result=d.divide(25,0);
        	
        	if(result!= -1)
		{
	 	       	System.out.println("Result= "+result);
        	}
    	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
