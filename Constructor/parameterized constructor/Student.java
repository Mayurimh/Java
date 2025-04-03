class Student
{
	String name;
	String collegeName;
	int rollNo;
	
	//user defined no-paramerised constructor
	
	public Student(){
		System.out.println("Constructor");
		System.out.println("reference of object : "+this);

	}
	
	//parameterized constructor
	Student(String name, String collegeName, int rollNo){
		this.name = name;
		this.collegeName = collegeName;
		this.rollNo = rollNo;
	}
	
	public void displayData(){
		System.out.println("Name : "+name);
		System.out.println("college name : "+collegeName);		
		System.out.println("roll number : "+rollNo);
	}
}