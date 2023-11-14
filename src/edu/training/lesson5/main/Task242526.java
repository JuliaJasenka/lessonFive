package edu.training.lesson5.main;

public class Task242526 {

	public static void main(String[] args) {
		/*
		 * Составить программу, определяющую результат гадания на ромашке — «любит—не
		 * любит», взяв за исходное данное количество лепестков п.
		 */

		int n = 23;

		if (n % 2 == 0) {
			System.out.println("Не любит!");
		} else {
			System.out.println("Любит!");
		}

		System.out.println("");

		/*
		 * Написать программу — модель анализа пожарного датчика в помещении, которая
		 * выводит сообщение «Пожароопасная ситуация », если температура в комнате
		 * превысила 60° С.
		 */

		int t = 0;

		if (t > 60) {
			System.out.println("Пожароопасная ситуация!");
		} else {
			System.out.println("Температура в норме!");
		}

		System.out.println("");

		/*
		 * Написать программу нахождения суммы большего и меньшего из трех чисел
		 */

		int a = 6;
		int b = 4;
		int c = 11;
		int max;
		int min;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		if (c < min) {
			min = c;
		}

System.out.println("Сумма большего и меньшего чисел из трех равна " + (max+min));
	}

}
