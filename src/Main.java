import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt(21);
		
		if (value % 2 ==0) {
			System.out.println("This number is even!"+  value);
		}else {
			System.out.println("this number is odd!" + value);
		}		

	}

}
