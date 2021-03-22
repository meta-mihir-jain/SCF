package Zooo;

public class Crane extends Mammal {
	
	//Constructor initializing the animalName
	Crane(){
		super();
		animalName = "lion";
	}
	//***********setters******************
	@Override
	void setId(int animalId) {
		id = animalId;
	}
		
	
	@Override
	void setName(String nameInp) {
		name = nameInp;
		
	}
	@Override
	void setAge(double inputAge){
		age = inputAge;
	}
	@Override
	void setWeight(double inputWeight){
		weight = inputWeight;
	}
	
	//**************getters****************
	@Override
	String getName(){
		return name;
	}
	@Override
	String getType(){
		return type;
	}
	@Override
	String getAnimalName() {
		return animalName;
	}
	@Override
	int getId() {
		return id;
	}
	@Override
	String getSound() {
		return "Roar";
	}
}
