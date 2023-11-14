package edu.training.lesson5.main;

public class Task32 {

	public static void main(String[] args) {
		/*
		 * Написать программу, которая по заданным трем числам определяет, является ли
		 * сумма каких-либо двух из них положительной.
		 */

		int number1 = -5;
		int number2 = 4;
		int number3 = 3;

		
		if (number1 + number2 > 0 || number1 + number3 > 0 || number2 + number3 > 0) {
			System.out.println("Сумма двух чисел из трех положительна.");
		} else {
			System.out.println("Сумма любых двух чисел из трех отрицательна.");
		}
		 

		/* ИЛИ
		
		   if (number1 + number2 > 0) {
			System.out.println("Сумма чисел " + number1 + " и " + number2 + " положительна.");
		} else if (number1 + number3 > 0) {
			System.out.println("Сумма чисел " + number1 + " и " + number3 + " положительна.");
		} else if (number2 + number3 > 0) {
			System.out.println("Сумма чисел " + number2 + " и " + number3 + " положительна.");
		} else {
			System.out.println("Сумма любых двух чисел из трех отрицательна.");
		}*/
	}

}
