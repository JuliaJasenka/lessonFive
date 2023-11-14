package edu.training.lesson5.main;

public class CW02 {

	public static void main(String[] args) {
		// С помощью оператора while напишите программу определения суммы всех нечетных
		// чисел в диапазоне от 1 до 99 включительно.

		int x = 1;
		double count = 0;

		while (x <= 99) {
			
			count += x;
			x = x + 2;
		}
		System.out.println(count);

	}

}
