package vectors;




public class Vectors {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> stack = new MyStack<>();
		stack.push(49);
		stack.push(52);                 
		stack.push(63);
		stack.pop();
		
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
