package edu.training.lesson5.main;

import java.util.Scanner;

public class CW01 {

	public static void main(String[] args) {
		Scanner sc;
		String month;
		int monthNumber;
		
		
		sc = new Scanner(System.in);

		System.out.println("Введите название месяца ");
		System.out.print("> ");
		month = sc.nextLine();
		
		System.out.println("month = " + month);
		
switch(month){
	case "январь":
		monthNumber=1;
		System.out.println("январь это 1 месяц в году");
		break;
	case "февраль":
		monthNumber=2;
		System.out.println("февраль это 2 месяц в году");
		break;
	case "март":
		monthNumber=3;
		break;
	case "апрель":
		monthNumber=4;
		break;
	case "май":
		monthNumber=5;
		break;
	case "июнь":
		monthNumber=6;
		break;
	case "июль":
		monthNumber=7;
		break;
	case "август":
		monthNumber=8;
		break;
	case "сентябрь":
		monthNumber=9;
		break;
	case "октябрь":
		monthNumber=10;
		break;
	case "ноябрь":
		monthNumber=11;
		break;
	case "декабрь":
		monthNumber=12;
		break;
		default:
			System.out.println ("Вы ввели не название месяца.");
}
	}

}
