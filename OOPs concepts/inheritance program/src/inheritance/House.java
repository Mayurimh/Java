package inheritance;

public class House extends Building {
	int bedr;
	House(String type, int bedr){
		super(type);
		this.bedr=bedr;
	}
}
