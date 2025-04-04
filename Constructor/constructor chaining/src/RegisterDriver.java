class RegisterDriver
{
	public static void main(String[] args){
		Register r1 = new Register();
		r1.displayData();
		
		System.out.println("_______________________________");
		
		Register r2 = new Register("Mayuri", 4567837471l, 'F', "mayuri@gmail.com", 457666676, "B+","15.09.2003");
		r2.displayData();
	}
}