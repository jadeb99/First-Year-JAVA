public class Puppy {
	
	//define attributes
	String name;
	int age;
	
	//default constructor
	public Puppy() {
		
	}
	
	//constructor function (builds the object)
	//you can comment out this boy and re-add in the line with myPuppy.name 
	public Puppy(String pname) {
		
		this.name = pname;
	}
	
	//our main() function
	public static void main(String[] args) {
		
		
		//create puppy object
		//no two objects can haev the same name
		Puppy myPuppy = new Puppy("Patch");
		Puppy yourPuppy = new Puppy();
		
		
		//give data to both objects
		//myPuppy.name = "Patch";
		myPuppy.age = 1;
		
		
		yourPuppy.name = "Tom";
		yourPuppy.age = 2;
		
		System.out.println("First puppy name is " +myPuppy.name +" and the age is " +myPuppy.age);
		System.out.println("Second puppy name is " +yourPuppy.name +" and the age is " +yourPuppy.age);
		
	}//end main
	
	
}//end class