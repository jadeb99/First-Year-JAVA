/*program to input data
from standard input
*/

import java.util.Scanner;

public class Demo {
	public static void main (String[]args){
		
		int num;
		
		//enter data from standard input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		num = scan.nextInt();
		
		//close the scanner once finished
		scan.close();
		
		System.out.println("you entered " + num);
	}//end main
}//end Demo