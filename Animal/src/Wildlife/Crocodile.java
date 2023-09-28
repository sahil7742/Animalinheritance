package Wildlife;

import Wildlife.Reptile;

public class Crocodile extends Reptile {
	

	@Override
	public String toString() {
		return "Crocodile [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + ", toString()=" + super.toString() + ", ShowInfo()=" + ShowInfo() + "]";
	}

	private String hardshelleded;

	public Crocodile() {
		super();
		this.hardshelleded = "hardshelleded";
	}

	
	public String showinfo() {
		return "Crocodile [hardshelleded=" + hardshelleded + "]";
	}
 
	public void main() {
		System.out.println(toString());
	}

}
 

