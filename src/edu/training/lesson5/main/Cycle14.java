package edu.training.lesson5.main;

public class Cycle14 {

	public static void main(String[] args) {
		// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

		int n = 7;

		double sum = 0;

		for (double i = 1; i <= n; i++) {

			sum += 1 / i;
		}

		System.out.println("При n равном " + n + " сумма равна " + sum);
	}

}
