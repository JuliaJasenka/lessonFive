package edu.training.lesson5.main;

public class Task30 {

	public static void main(String[] args) {
		/*
		 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		 * заменить их абсолютными значениями, если это не так.
		 */

		double a = 5;
		double b = 4.3;
		double c = 3.6;

		if (a > b && b > c) {
			a = Math.pow(a, 2);
			b = Math.pow(b, 2);
			c = Math.pow(c, 2);

			System.out.println("При a > b > c число a принимает значение равное " + a + " , число b значение равное "
					+ b + " , число c значение равное " + c + ".");
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);

			System.out.println("Число a равно " + a + " , число b равно " + b + " , число c равно " + c + ".");
		}

	}

}
