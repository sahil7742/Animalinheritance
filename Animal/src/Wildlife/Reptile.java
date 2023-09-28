package Wildlife;

import Wildlife.Animal;

public class Reptile extends Animal {
	

	@Override
	public String toString() {
		return "Reptile [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "" + ShowInfo() + "]";
	}

	private String drySkin;
	private String backbone;
	private String softshelledegg;

	public Reptile() {
		super();
		this.drySkin = "dry skin";
		this.backbone = "bakbone";
		this.softshelledegg = "shelled egg";
	}

	public String ShowInfo() {
		return "Reptile [drySkin=" + drySkin + ", backbone=" + backbone + ", softshelledegg=" + softshelledegg + "]";
	}

	public void main() {
		Crocodile crocodile = new Crocodile();
		System.out.println(toString());
		crocodile.main();
		
	}
}
