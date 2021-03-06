/*
 * Shad M Khan
 * Strategy-Pattern implementation in Java
 * January 5th 2017
*/
//Animal SuperClass
abstract class Animal {
	protected int noOfLegs;
	protected String name;
	protected String gender;
	protected boolean canFly;
	
	// iLayEggs is an interface than can be set to any of the classes that implement it
	// This is the basis of stategy design pattern
	protected iLayEggs laysEggs;
	
	abstract public void eat();
	abstract public void move();
	abstract public void reproduce();
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return(this.name);
	}

}
