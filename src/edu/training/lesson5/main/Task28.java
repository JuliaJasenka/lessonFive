package edu.training.lesson5.main;

public class Task28 {

	public static void main(String[] args) {
		/*
		 * Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		 * равно d, то найти max(d — a, d — b, d — c).
		 */
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 8;
		int max = d - a;

		if (a == d) {
			System.out.println("Число а равно числу d и равно " + d);
		}
		if (b == d) {
			System.out.println("Число b равно числу d и равно " + d);
		}
		if (c == d) {
			System.out.println("Число c равно числу d и равно " + d);
		} else if (a != d && b != d && c != d) {
			if (max < d - b) {
				max = d - b;
			}
			if (max < d - c) {
				max = d - c;
			}
			System.out.println("max = " + max);
		}

	}

}
