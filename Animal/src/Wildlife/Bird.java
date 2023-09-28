package Wildlife;

import Wildlife.Animal;

public class Bird extends Animal {
	
	

	@Override
	public String toString() {
		return "Bird [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType  + showinfo() + "]";
	}

	private String feather;
	private String fly;

	public Bird() {
		super();
		this.feather = "feather";
		this.fly = "can fly";
	}

	public String showinfo() {
		return "Bird [feather=" + feather + ", fly=" + fly + "]";
	}

	public void main() {
		Eagle eagle = new Eagle();
		System.out.println(toString());
		eagle.main();
	}
}
