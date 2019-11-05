/*program to initialize the name and date
of two holidays and then display them to 
standard output
*/

public class Holiday {
	public String name;
	public int day;
	public String month;
	
	public Holiday(){
		this.name = "Christmas";
		this.day = 25;
		this.month = "December";
	}//end default
	
	public Holiday(int date){
		this.name = "Paddys";
		this.day = date;
		this.month = "March";
	}//end constructor
	
	public static void main(String[]args){
		Holiday christmas = new Holiday();
		Holiday paddy = new Holiday((int)17);
		
		System.out.println(christmas.name + " is on the " + christmas.day + "th of " + christmas.month);
		System.out.println(paddy.name + " is on the " + paddy.day + "th of " + paddy.month);
	}//end main
}//end class