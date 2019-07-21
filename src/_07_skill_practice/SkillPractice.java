package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("Hoq many dime do u have?");



// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "u have " + Integer.parseInt(dimes) *10 + " cents");



// Ask the user how tall they are (inches)
int inches = Integer.parseInt( JOptionPane.showInputDialog("how many inches tall are u?"));



// If they are shorter than 36 inches, tell them to eat their Wheaties
if (inches < 36) {
	JOptionPane.showMessageDialog(null, "EAT your Wheaties!!!");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
	System.out.println("START");
	for (int i = 1; i < 30; i = i + 3) {
		System.out.println(i);
	}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random rand = new Random();
int hs = rand.nextInt(20);
System.out.println(hs);


// Get another random number that is less than 10 and print it to the console 
int hk = rand.nextInt(10);
System.out.println(hk);
int sk = hs-hk;

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, "the difference is: " + sk);


}

void skill4() { // In a pop-up, ask the user for the city they live in 
System.out.println("START");
String city = JOptionPane.showInputDialog("Where do u live ? whioch city?");

// If they answered "San Diego", tell them they live in America's Finest City 
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "U live in the finist city in america");
}


// Otherwise, tell them to move to San Diego 
else {
	JOptionPane.showMessageDialog(null, "not S.D.? well then move there!!!");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 3;


// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
JOptionPane.showMessageDialog(null, 12);


}

void skill5() { // In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("Where do u go to school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " Is a great school!");


}
}
