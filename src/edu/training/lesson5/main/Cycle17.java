package edu.training.lesson5.main;

public class Cycle17 {

	public static void main(String[] args) {
		// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

		double a = 3.65;
		int n = -1;
		double mult = 1;

		if (n <= 0) {
			System.out.println("Действие не выполняется! Число n должно быть больше 0.");
		} else {

			for (int i = 0; i <= (n - 1); i++) {

				mult *= (a + i);
				System.out.println(mult);
			}

			System.out.println("При действительном числе равном " + a + " и натуральном числе равном " + n
					+ " выражение a(a+1)...(a+n-1) равно " + mult + ".");
		}
	}
}
