package edu.training.lesson5.main;

public class Task22 {

	public static void main(String[] args) {
		// Перераспределить значения переменных х и у так, чтобы в х оказалось большее
		// из этих значений, а в y - меньшее.

		int x = 20;
		int y = 10;
		int z = x;

		if (x >= y) {
			System.out.println("Переменные до перераспределения: х = " + x + "; y = " + y);
		} else {
			x = y;
			y = z;
			System.out.println("Переменные после перераспределения: х = " + x + "; y = " + z);
		}
	}

}
