package Stacks;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object
	Stack thestack =new Stack(10);
		
		thestack.push('S');
		thestack.push('T');
		thestack.push('A');
		thestack.push('C');
		thestack.push('K');
		
		//Print peek statement
		System.out.println("The peek value of Stack :" +thestack.peek() );
		
		while(!thestack.isEmpty()) {
			
			char ch2 = thestack.pop();
			System.out.println("top:" + ch2);
			
		}
		
		CheckBrackets.validatePatenthesis("3 + (( 6  * 2) - 3)");
		CheckBrackets.validatePatenthesis("5 * 6 + (2 - 5");
		CheckBrackets.validatePatenthesis("5 * 6 + (2 - 5))");
	}

}
