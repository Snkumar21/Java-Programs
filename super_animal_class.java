class animal
{
	void display()
	{
		System.out.println("I am in the Animal Class");
	}
}

class dog extends animal
{
    @SuppressWarnings("override")
	void display()
	{
		super.display();
		System.out.println("I am in the Dog Class");
	}
}

@SuppressWarnings("unused")
class super_animal_class
{
	public static void main(String Args[])
	{
		dog d = new dog();

		d.display();
	}
}