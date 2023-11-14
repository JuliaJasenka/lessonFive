package edu.training.lesson5.main;

public class Tasdk33 {

	public static void main(String[] args) {
		/*
		 * Написать программу, которая по паролю будет определять уровень доступа
		 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
		 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
		 */

		int password = 1747;

		switch (password) {
		case 9583:
		case 1747:
			System.out.println("Доступны модули баз А, В, С.");
			break;
		case 3331:
		case 7922:
			System.out.println("Доступны модули баз В, С.");
			break;
		case 9455:
		case 8997:
			System.out.println("Доступны модули баз С.");
			break;
		default:
			System.out.println("Нет доступа к модулям баз.");
		}

	}

}
