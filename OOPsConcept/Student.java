package OOPsConcept;

public class Student {
	
	
	int rn;
	int marks;
	String name;
	
	public Student()
	{
		System.out.println("Argument constructor calling..");
	}
	public Student(int rn,int marks,String name)
	{
		this.rn=rn;
		this.marks=marks;
		this.name=name;
		System.out.println("Parametrized constructor calling..");
	}
	

}
