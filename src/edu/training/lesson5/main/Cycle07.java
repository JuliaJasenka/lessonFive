package edu.training.lesson5.main;

public class Cycle07 {

	public static void main(String[] args) {
		// Вычислить значения функции на отрезке [а,b] c шагом h:

		int a = -9;
		int b = 9;
		int h = 2;
		int x;
		int y;

		for (x = a; x <= b; x += h) {

			if (x > 2) {
				y = x;
			} else {
				y = x * (-1);

			}
			System.out.println("При х = "+x + " y равен "+y+".");
		}

	}

}
