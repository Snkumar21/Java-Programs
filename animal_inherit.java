<<<<<<< HEAD
class animals {
    void displayProperties() {
		System.out.println("All are domestic animals and all have four legs and one tail.");
	}
}

class dog extends animals 
{
    void displaySound() {
		System.out.println("Dog says: Bark");
	}
}

class cat extends animals 
{
	void displaySound() {
		System.out.println("Cat says: Meow");
	}
}

class goat extends animals 
{
	void displaySound() {
		System.out.println("Goat says: Mee");
    }
}

class animal_inherit 
{
    	public static void main(String[] args) 
	{
        	dog d = new dog();
        	cat c = new cat();
        	goat g = new goat();
        	animals a = new animals();

        	a.displayProperties();
	        d.displaySound();
        	c.displaySound();
        	g.displaySound();
    	}
}
=======
//This is a inheritance example of Java Langauge.
//Animals is the parent class.
//Dog and Cat are the child classes.

class animals {
    void displayProperties() {
		System.out.println("All are domestic animals and all have four legs and one tail.");
	}
}

class dog extends animals 
{
    void displaySound() {
		System.out.println("Dog says: Bark");
	}
}

class cat extends animals 
{
	void displaySound() {
		System.out.println("Cat says: Meow");
	}
}

class goat extends animals 
{
	void displaySound() {
		System.out.println("Goat says: Mee");
    }
}

class animal_inherit 
{
    	public static void main(String[] args) 
	{
        	dog d = new dog();
        	cat c = new cat();
        	goat g = new goat();
        	animals a = new animals();

        	a.displayProperties();
	        d.displaySound();
        	c.displaySound();
        	g.displaySound();
    	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
