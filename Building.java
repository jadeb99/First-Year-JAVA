public class Building {
	
	//data attributes
	float size;	//unit in m^2
	String address;
	Boolean residential_use;
	
	//default constructor (no parameters)
	public Building(){
		
		this.size = 0;
		this.address = "Somewhere";
		this.residential_use = true;
		
	}//end default
	
	//another constructor method
	public Building(float b_size) {
		
		this.size = b_size;
		this.address = "Somewhere";
		this.residential_use = true;
		
	}//end Building
	
	//main
	public static void main(String[]args) {
		
		//create object
		Building house = new Building();
		Building your_house = new Building((float)150.5);
		
		//initialize house object
		house.size = (float)175.5;
		house.address = "O'Connell Street";
		house.residential_use = true;
		
		//displaying the data of house
		System.out.println("House1 size is " + house.size);
		System.out.println("House1 address is " + house.address);
		System.out.println("House1 residential status is " + house.residential_use);
		
		System.out.println("House2 size is " + your_house.size);
		System.out.println("House2 address is " + your_house.address);
		System.out.println("House2 residential status is " + your_house.residential_use);
	}//end main
	
}//end class

/*
  - dont have to have a default constructor but its better to put it in
  - can have as many constructors as you like once the parameters differ
  - the order also matters 
  - can overwrite the constructors in the main (lines 34-36)
*/