// This is a Hierarchical Class of a Vehicle using pre-defined value in java.
class vehicle
{	
    void display(){
		System.out.println("Driving a vehicle");		
    }
}

class car extends vehicle
{
	void says(){
		super.display();
		System.out.println("displays driving a car");		
	}
}

class bike extends vehicle
{
	void says(){
		super.display();
		System.out.println("driving a bike");
	}
}

public class hierarchical_vehicle {
    public static void main(String[] args) 
	{
        car c = new car();
        bike b = new bike();
		c.says();
		b.says();
	}
}