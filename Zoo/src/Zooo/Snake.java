package Zooo;

public class Snake extends Reptile
{
	//Constructor initializing the animalName
	Snake()
	{
		super();
		animalName = "sanke";
	}
	@Override
	void setId(int animalId) 
	{
		id = animalId;
	}
	@Override
	void setAge(double inputAge)
	{
		age = inputAge;
	}
	@Override
	void setWeight(double inputWeight)
	{
		weight = inputWeight;
	}
	@Override
	void setName(String nameInp)
	{
		name = nameInp;
	}
	@Override
	String getName()
	{
		return name;
	}
	@Override
	String getType()
	{
		return type;
	}
	@Override
	String getAnimalName()
	{
		// TODO Auto-generated method stub
		return animalName;
	}
	@Override
	int getId() 
	{
		return id;
	}
	@Override
	String getSound() 
	{
		return "Hiss";
	}
}