package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean prime = true;
		String numberStr = JOptionPane.showInputDialog("Enter Number:");
		int number = Integer.parseInt(numberStr);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "Is it Prime?  " + prime);

	}

}
