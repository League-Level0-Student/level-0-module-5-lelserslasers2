package _06_for_loop_gauntlet;

public class ForlOOopChallegnhge {

	public static void main(String[] args) {
		//loop 0-100 display
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		System.out.println("END");
		//loop 100-0
		for (int i = 100; i >=0; i--) {
			System.out.println(i);
		}
		System.out.println("END");
		//loop 2-100 even
		for (int i = 2; i < 102; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("END");
		//1-99 odd
		for (int i = 1; i < 101; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("END");
		//1-500 odd/even print
		for (int i = 1; i < 501; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println(" is even");
			}
			else {
				System.out.println(" is odd");
			}
		}
		System.out.println("END");
		//0-777 multi 7
		for (int i = 0; i < 778; i = i + 7) {
			System.out.println(i);
		}
		System.out.println("END");
		int j = 0;
		for (int i = 2005; i < 2019; i++) {
			System.out.println("In " + i + " i was " + j + " years old");
			j = j + 1;
		}
		System.out.println("END");
		for (int i = 0 ; i < 3; i++) {
			for (int l = 0; l < 3; l++) {
				System.out.println(i + " " + l);
			}
		}
		System.out.println("END");
		
		for (int i = 1; i < 10; i = i + 1) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.println("");
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int l = (i*3)+1; l < (i*3)+4; l++) {
				System.out.print(l);
			}
			System.out.println("");
		}
		System.out.println("END");
		for (int i = 0; i < 10; i++) {
			for (int l = (i*10)+1; l < (i*10)+11; l++) {
				System.out.print(l + ", ");
			}
			System.out.println("");
		}
		System.out.println("END");
		
		for (int i = 1; i < 7; i++) {
			for (int l = 0; l < i; l++ ) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("END");
		
		for(int i = 0; i < 101; i++) {
			System.out.println(100 - i);
		}


	}

}
