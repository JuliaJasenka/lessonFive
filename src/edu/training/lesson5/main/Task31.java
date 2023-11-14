package edu.training.lesson5.main;

public class Task31 {

	public static void main(String[] args) {

		/*
		 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		 * Определить, пройдет ли кирпич через отверстие.
		 */

		int A = 3;
		int B = 5;
		int x = 2;
		int y = 2;
		int z = 4;

		if (A == x && B == y || A == y && B == x || A == x && B == z || A == z && B == x || A == y && B == z
				|| A == z && B == y) {
			System.out.println("Кирпич пройдет в отверстие!");
		}

		else {
			System.out.println("Кирпич не пройдет в отверстие!");
		}
	}
}
