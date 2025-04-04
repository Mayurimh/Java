class Form
{
	String name;
	long phone;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;
	
	
	Form(){}
	
	Form(String name, long phone, char gen, String email){
		this.name = name;
		this.phone = phone;
		this.gen = gen;
		this.email= email;
	}
	
	Form(String name, long phone, char gen, String email, long tel){
		this.name = name;
		this.phone = phone;
		this.gen = gen;
		this.email= email;
		this.tel = tel;
	}
	Form(String name, long phone, char gen, String email, long tel, String blood){
		this.name = name;
		this.phone = phone;
		this.gen = gen;
		this.email= email;
		this.tel = tel;
		this.blood = blood;
	}
	Form(String name, long phone, char gen, String email, long tel, String blood,String dob){
		this.name = name;
		this.phone = phone;
		this.gen = gen;
		this.email= email;
		this.tel = tel;
		this.blood = blood;
		this.dob = dob;
	}
	
	public void displayData(){
		System.out.println("Name : "+name);
		System.out.println("Phone : "+phone);
		System.out.println("gender : "+gen);
		System.out.println("email : "+email);
		System.out.println("telephone number : "+tel);
		System.out.println("blood : "+blood);
		System.out.println("DOB : "+dob);
	}
}