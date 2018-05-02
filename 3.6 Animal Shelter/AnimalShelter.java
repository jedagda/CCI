
public class AnimalShelter {
	Animal front, rear;
	
	public AnimalShelter(){
		this.front = this.rear = null;
	}
	
	// If Animal is empty, then new node is front and rear both
	public void enqueue(String species){
		Animal temp = new Animal(species);
		if(this.rear == null){
			this.front = this.rear = temp;
			return;
		}
		// Add the new Animal at the end of queue and change rear
		this.rear.setNext(temp);
		this.rear = temp;
	}
	
	public Animal dequeueAny(){
		if(this.front == null)
			return null;
		Animal temp = this.front;
		this.front = this.front.getNext();
		
		if(this.front == null)
			this.rear = null;
		return temp;
	}
	
	public Animal dequeueDog(){
		if(this.front == null)
			return null;
		else if(this.front.getSpecies() != "dog")
			for(Animal j = this.front; j != null; j=j.getNext())
				if(j.getSpecies() == "dog"){
					Animal temp = j;
					j.setNext(j.getNext());
					return temp;
				}
		Animal temp = this.front;
		this.front = this.front.getNext();
		if(this.front == null)
			this.rear = null;
		return temp;

	}
	
	public Animal dequeueCat(){
		if(this.front == null)
			return null;
		else if(this.front.getSpecies() != "cat")
			for(Animal j = this.front; j != null; j=j.getNext())
				if(j.getSpecies() == "cat"){
					Animal temp = j;
					j.setNext(j.getNext());
					return temp;
				}
		Animal temp = this.front;
		this.front = this.front.getNext();
		if(this.front == null)
			this.rear = null;
		return temp;

	}
	
	
}
