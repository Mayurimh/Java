public class PublicClass
{
}
class A
{
	public static void main(String[] args){
		System.out.println("Hello world!");
	}
}

//if we declare public class to A and our file name is PublicClass.java then we get CTC as 
// class A is public, should be declared in a file named A.java
//and we declare public class to PublicClass then our compilation done successfully but we get run time error 
//Error: Main method not found in class PublicClass, please define the main method as:
   //public static void main(String[] args)