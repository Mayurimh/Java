class FormDriver
{
	public static void main(String[] args){
		Form f1 = new Form();
		f1.displayData();
		System.out.println("______________________________");
		
		Form f2 = new Form("Mayuri", 7654321890l, 'F', "mayuri@gmail.com");
		f2.displayData();
		System.out.println("______________________________");
		
		Form f3 = new Form("chetan", 7654321890l, 'M', "chetan@gmail.com", 9932345614l, "O+", "15/09/2002");
		f3.displayData();
		System.out.println("______________________________");
	}
}