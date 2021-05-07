class Dog
{
	//instance variable
	String name;
	int age;
	
	//constructor decleration of class
	public Dog(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	public void getAge()
	{
		System.out.println(age);
	}
public static void main(String a[])
{
	Dog tuffy1 = new Dog("Tuffy1", 5);
	Dog tuffy2 = new Dog("Tuffy2", 10);
	Dog tuffy3 = new Dog("Tuffy3", 15);
	tuffy1.getName();
	tuffy1.getAge();
	tuffy2.getName();
	tuffy2.getAge();
	tuffy3.getName();
	tuffy3.getAge();	
}
}
