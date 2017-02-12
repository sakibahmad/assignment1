/* addition without + operator*/
package assignment1;
import java.util.Scanner;
public class add {

	public static void main(String[] args) {
		int no1,no2,addition;
		Scanner obj =new Scanner(System.in);
			System.out.println("enter the first no1");
			no1=obj.nextInt();
			System.out.println("enter the second no2");
			no2=obj.nextInt();
			addition=no1-(-no2);
			System.out.println("addition is "  + addition);
			
			

	}
	

}
