/*Program to display data
in an array
*/

public class Array {
	public static void main (String[]args){
		int [] my_array = new int [5];
		int i;
		
		
		//fill the array
		for(i=0; i<my_array.length; i++)
		{
			my_array[i] = i;
		}//end for
		
		//display the array
		for(i=0; i<my_array.length; i++)
		{
			System.out.println(my_array[i]);
		}//end for
	}
}