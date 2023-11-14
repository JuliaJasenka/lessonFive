package edu.training.lesson5.main;

public class Task27 {

	public static void main(String[] args) {
		// Найти max{min(a, b), min(c, d)}.

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int max;
		int minAB;
		int minCD;

		if (a > b) {
			minAB = b;
		} else {
			minAB = a;
		}
		if (c > d) {
			minCD = d;
		} else {
			minCD = c;
		}
		if (minAB > minCD) {
			max = minAB;
		} else {
			max = minCD;
		}
		System.out.println("Максимальное из двух минимальных значений = " + max);
	}

}
