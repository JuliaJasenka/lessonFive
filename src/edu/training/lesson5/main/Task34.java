package edu.training.lesson5.main;

public class Task34 {

	public static void main(String[] args) {
		/*
		 * Составить программу, реализующую эпизод применения компьютера в книжном
		 * магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
		 * покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
		 * денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
		 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
		 * и указывает размер недостающей суммы
		 */

		double booksPrice = 9.63;
		double buyersMoney = 7.00;
		double change = buyersMoney-booksPrice;
		double requiredMoney = booksPrice - buyersMoney;
		
		if (booksPrice == buyersMoney) {
			System.out.println("Спасибо!");
		} else if (booksPrice < buyersMoney) {
			System.out.println("Возьмите сдачу! " + String.format("%.2f",change) + " руб.");
		} else if (booksPrice > buyersMoney) {
			System.out.println(
					"Денег не достаточно! Необходимо доплатить " + String.format("%.2f",requiredMoney) + " руб.");
		}
	}

}
