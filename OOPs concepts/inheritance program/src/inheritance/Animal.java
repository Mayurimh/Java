package inheritance;

public class Animal {
	String sound;
	 Animal(String sound){
		 this.sound = sound;
	 }
	 void make() {
		 System.out.println("animal : "+sound);
	 }
}
