package Stacks;

public class CheckBrackets {

	public static void validatePatenthesis(String input) {
		
		final int length =input.length();
		Stack stack = new Stack(length);
		for(int i=0; i< length; i++) {
			
			if(input.charAt(i) == '(') {
				stack.push(input.charAt(i));
				continue;
			}else if(input.charAt(i) == ')') {
				
				if(stack.isEmpty()) {
					
					System.out.println("invalid");
					return;
				}else {
					
					stack.pop();
				}
			}
		}
		
		if(stack.isEmpty()) {
			
			System.out.println("Valid Expression");
		}else {
			System.out.println("invalid Expression");
		}
	}

}
