package edu.training.lesson5.main;

public class Cycle15 {

	public static void main(String[] args) {
		// Вычислить : 1+2+4+8+...+ 2 в 10 степени.

		int number = 2;
		int sum = 0;

		for (int i = 0; i <= 10; i++) {

			sum += Math.pow(number, i);
		}
		System.out.println("Сумма равна " + sum);
	}

}
