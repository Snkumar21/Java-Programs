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