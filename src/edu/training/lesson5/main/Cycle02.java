package edu.training.lesson5.main;

public class Cycle02 {
	public static void main(String[] args) {

		/* Найти сумму квадратов первых ста чисел. */

		int number = 1;
		int sum = 0;

		while (number <= 100) {

			sum += Math.pow(number, 2);
			number++;
		}

		System.out.println("Сумма квадратов первых ста чисел равна " + sum + ".");
		System.out.println();

	
}
}
