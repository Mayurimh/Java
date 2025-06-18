package inheritance;

public class Villa extends House{
	boolean hasgarden;
	Villa(String type, int bedr, boolean hasgarden){
		super(type,bedr);
		this.hasgarden = hasgarden;
	}
	Villa(String type, boolean hasgarden){
		this("vill",2, hasgarden);
	}
	public static void main(String[]args) {
		Villa v1 = new Villa("vii",true);
	}
}
