package Array;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"somu",48);
		Student s2=new Student(2,"gomu",75);
		Student s3=new Student(3,"somya",35);
		Student s4=new Student(4,"gomya",45);
	
	
	Student[]s= {s1,s2,s3,s4};
	
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i].id+" "+s[i].name+" "+s[i].marks);
	}
	}

}
