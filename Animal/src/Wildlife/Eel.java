package Wildlife;

import Wildlife.Fish;

public class Eel extends Fish {
	

	@Override
	public String toString() {
		return "Eel [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + ", toString()=" + super.toString()  + showinfo() + "]";
	}

	private String releaseelectric;

	public Eel() {
		super();
	}

	public Eel(String releaseelectric) {
		super();
		this.releaseelectric = releaseelectric;
	}

	public void main() {
		System.out.println(toString());
	}

}
