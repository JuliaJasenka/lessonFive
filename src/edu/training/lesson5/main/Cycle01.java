package edu.training.lesson5.main;

public class Cycle01 {

	public static void main(String[] args) {
		/*
		 * С помощью оператора while напишите программу вывода всех четных чисел в
		 * диапазоне от 2 до 100 включительно.
		 * 
		 */

		int a = 2;

		while (a < 101) {
			System.out.print(a + " ");
			a += 2;
		}

		System.out.println();

		/*
		 * С помощью оператора while напишите программу определения суммы всех нечетных
		 * чисел в диапазоне от 1 до 99 включительно.
		 */

		int b = 1;
		int sum = 0;

		while (b < 100) {
			sum += b;
			b += 2;
		}

		System.out.println("Сумма нечетных чисел в диапазоне от 1 до 99 включительно равна " + sum + ".");
		System.out.println();

		/*
		 * Напишите программу, где пользователь вводит любое целое положительное число.
		 * А программа суммирует все числа от 1 до введенного пользователем числа.
		 */

		int number = 5;
		int sum1 = 0;

		for (int i = 1; i <= number; i++) {

			sum1 += i;
		}

		System.out.println("Сумма чисел в диапазоне от 1 до " + number + " равна " + sum1 + ".");
		System.out.println();
		
	}

}
