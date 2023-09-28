package Wildlife;

public class Animal {
	protected double height;
	protected int weight;
	protected String animalType;
	protected String bloodType;

	public Animal() {

		this.height = 10.5;
		this.weight = 100;
		this.animalType = "reptile";
		this.bloodType = "cold blood";

	}

	public String ShowInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

	public Animal(double height, int weight, String animalType, String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

}
