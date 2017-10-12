package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random dog = new Random();

	int num = dog.nextInt(51);
	int num1 = dog.nextInt(51)+50;
	int num2 = dog.nextInt(101)+75;
	int num3 = dog.nextInt(176)+65;
	int num4 = dog.nextInt(241)+100;
	JOptionPane.showMessageDialog(null, num);
	JOptionPane.showMessageDialog(null, num1);
	JOptionPane.showMessageDialog(null, num2);
	JOptionPane.showMessageDialog(null, num3);
	JOptionPane.showMessageDialog(null, num4);
	
	
	
	
	
	
	
}
}
