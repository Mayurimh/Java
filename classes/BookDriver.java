class Book
{
	String brand;
	int pages;
	double price;
	int weight;
}
class BookDriver
{
	public static void main(String[] args){
		Book b1 = new Book();
		//print address of reference variable
		System.out.println(b1);
		System.out.println("Brand : "+b1.brand);
		System.out.println("Pages : "+b1.pages);
		System.out.println("Pages : "+b1.weight);
		System.out.println("weight : "+b1.price);
		
		System.out.println("____________________________________");
		
		Book b2 = new Book();
		
		b2.brand = "Classmate";
		b2.pages = 100;
		b2.price = 50.0;
		b2.weight = 100;
		//print address of reference variable
		System.out.println(b2);
		System.out.println("Brand : "+b2.brand);
		System.out.println("Pages : "+b2.pages);
		System.out.println("Pages : "+b2.price);
		System.out.println("weight : "+b2.weight);
		
		
	}
}