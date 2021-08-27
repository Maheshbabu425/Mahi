
public class Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("My name is mahesh babu"); 

		
		int a =3;		// a is variable 	int is data type
		int b=2;
		int sum = a+b;
		System.out.println("Sum");     // it will return only string 
		System.out.println(sum);       // it will return variable
		System.out.println("Sum is" + sum);	// + is an concatenation operator which will add string and variable.

	Child1 m = new Child1();  // Creating object for child class
	//m.ValidateHeader();	// ValidateHeader is the name which is provided in clild1
	
	System.out.println(m.ValidateHeader());
	
	}
}