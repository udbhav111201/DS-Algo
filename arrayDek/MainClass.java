package arrayDek;

public class MainClass {

	public static void main(String[] args) {
		MyDeque<Integer> md = new MyDeque<>();
		 md.addFirst(24);
		 md.addFirst(36);
		System.out.println( md.removeLast());
		

	}

}
