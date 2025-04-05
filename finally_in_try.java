//This is a finally code using try-catch block in java.
public class finally_in_try
{
    public static void main(String[] args) 
	{
        int i=0;
        
		String greetings[] = {"Java Programming", "Python", "Angular"};
        
		while(i<4)
		{
            try{
                System.out.println(greetings[i++]);
            }catch(Exception e){
                System.out.println(e.toString());
            }
            finally{
            	System.out.println("You should quit and reset index value < 3");
            }
        }
    }
}
