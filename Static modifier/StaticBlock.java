class StaticBlock
{
	static{
		System.out.println("Static block 1");
	}
	public static void main(String[] args){
		System.out.println("Main block");
	}
	static{
		System.out.println("Static block 3");
	}
	static{
		System.out.println("Static block 2");
	}
}