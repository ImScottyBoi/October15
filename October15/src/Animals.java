/*
 * Scott Weeden
 * Date: 10.17.18
 * Purpose: Allow for people to get random score's for animals.
 */

//attributes
public class Animals {
	private String height;
	private String legs;
	private String weight;
	private String name;
	private double random;
	//constructor
	public Animals(String name, String height, String legs, String weight) {
		this.height = height;
		this.legs = legs;
		this.weight = weight;
		this.name = name;
	}
	//score method
	public void score() {
		random = Math. random() * 9 + 1;
	}
	
	public String animalStats(String animalScore) {
		return name + " has a overall Score of " + random + "/10";
		
	}

	@Override
	public String toString() {
		return "Animals [Height=" + height + ", Legs=" + legs + ", Weight=" + weight + ", Name=" + name + "]";
	}
	
}
