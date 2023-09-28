package Wildlife;

import Wildlife.Bird;

public class Eagle extends Bird {
	

	@Override
	public String toString() {
		return "Eagle [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + ", toString()=" + super.toString()  + ShowInfo() + "]";
	}

	private String canfly;

	public Eagle() {
		super();
		this.canfly = "canfly";

	}

	public String showinfo() {
		return "Eagle [canfly=" + canfly + "]";
	}

	public void main() {

		System.out.println(toString());

	}
}
