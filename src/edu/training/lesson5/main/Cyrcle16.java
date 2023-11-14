package edu.training.lesson5.main;

public class Cyrcle16 {

	public static void main(String[] args) {
		// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

		int sum = 3;
		long mult = 1L;

		for (int i = 3; i <= 10; i++) {
			sum += +i;
			mult *= sum;
		}
		System.out.println("Произведение чисел = " + mult);
	}

}
