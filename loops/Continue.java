package loops;

public class Continue {

	public static void main(String[] args) {
		for (int i = 1;i<= 20; i++) {
			int result = i;
		for (int j=1;j<=10;j++) {
				if (j<=6&&j>=3)continue;
				result = i*j;
				System.out.print(result +" ");}
		System.out.println();
				
			}

	}

}
