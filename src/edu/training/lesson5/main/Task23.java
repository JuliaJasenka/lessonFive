package edu.training.lesson5.main;

public class Task23 {

	public static void main(String[] args) {
		/*
		 * Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		 * месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
		 */

		int month = 2;
		int day = 28;
		int year = 1997;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
				|| month == 12 && day > 0 && day <= 31) {

			System.out.println("Дата введена правильно.");
		} else if (month == 4 || month == 6 || month == 9 || month == 10 && day > 0 && day <= 30) {
			System.out.println("Дата введена правильно.");
		} else if (year % 4 == 0 && month == 2 && day > 0 && day <= 29) {
			System.out.println("Дата введена правильно.");
		} else if (month == 2 && day > 0 && day <= 28) {
			System.out.println("Дата введена правильно.");
		} else {
			System.out.println("Дата введена не правильно.");
		}
	}
}
