class StaticVar2
{
	static String str;
	public static void main(String[] args){
		System.out.println(str); //null
		test();
		String str = "mayuri";
		System.out.println(str); // mayuri
		System.out.println(StaticVar2.str); //mhavale
	}
	public static void test(){
		str = "Mhavale";
		System.out.println(str);
	}
}