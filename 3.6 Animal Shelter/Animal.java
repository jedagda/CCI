
public class Animal {
	private String species;
	private Animal next;

	public Animal() {
		this(null, null);
	}

	public Animal(String species) {
		this.species = species;
		this.next = null;
	}
	
	public Animal(String species, Animal n) {
		this.species = species;
		this.next = n;
	}
	
	public String getSpecies(){
		return species;
	}

	
	public Animal getNext(){
		return next;
	}
	
	public void setNext(Animal n){
		next = n;
	}
	
	
	
	

}
