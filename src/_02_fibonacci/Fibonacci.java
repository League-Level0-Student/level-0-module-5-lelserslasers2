package _02_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		int lowNum = 0;
		int highNum = 1;
		System.out.println("0");
		System.out.println("1");
		int thridNum = lowNum + highNum;
		for (int i = 0; i < 12; i++) {
			thridNum = lowNum + highNum;
			lowNum = highNum;
			highNum = thridNum;
			System.out.println(thridNum);
			
		}

	}

}
