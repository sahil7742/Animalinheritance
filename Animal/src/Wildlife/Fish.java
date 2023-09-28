package Wildlife;

import Wildlife.Animal;

public class Fish extends Animal {
	

	@Override
	public String toString() {
		return "Fish [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType  + showinfo() + "]";
	}

	private String liveinwater;
	private String gill;

	public Fish() {
		super();
		this.liveinwater = "under water";
		this.gill = "gills";
	}

	public String showinfo() {
		return "Fish [liveinwater=" + liveinwater + ", gill=" + gill   + ShowInfo() + "]";
	}

	public void main() {
		Eel eel = new Eel();
		System.out.println(toString());
		eel.main();
		
	}

}
