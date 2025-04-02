class Student
{
	String name;
	String collegeName;
	int rollNo;
	
	//user defined no-paramerised constructor
	
	public Student(){
		System.out.println("Constructor");
		System.out.println(this);

	}
	public void displayData(){
		String name = "Mayu";
		System.out.println("Name : "+name);
		System.out.println("Name : "+this.name);
		System.out.println("college name : "+collegeName);		
		System.out.println("roll number : "+rollNo);
	}
}