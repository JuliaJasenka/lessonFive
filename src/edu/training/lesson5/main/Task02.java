package edu.training.lesson5.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
				// девочка? Введи Д или М». В
				// зависимости от ответа на экране должен появиться текст «Мне нравятся
				// девочки!» или «Мне нравятся мальчики!».

				Scanner answer;
				String howAreYou;
				String girl = "Д";
				String boy = "М";

				answer = new Scanner(System.in);

				System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
				System.out.print("> ");
				howAreYou = answer.nextLine();
				  
				
				if (howAreYou == girl) {
					System.out.println("Мне нравятся мальчики!");
					if (howAreYou == boy) {
						System.out.println("Мне нравятся девочки!");
					}
					else {
						System.out.println("Ввели неверную букву!");
					}
				}
	
	}

}
