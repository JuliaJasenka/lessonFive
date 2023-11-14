package edu.training.lesson5.main;

public class Task29 {

	public static void main(String[] args) {
		/*
		 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		 * расположены на одной прямой.
		 * 
		 * (x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)=0
		 */
		int x1 = 3;
		int x2 = 4;
		int x3 = 5;
		int y1 = 2;
		int y2 = 3;
		int y3 = 2;

		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println("Точки лежат на одной прямой.");
		} else {
			System.out.println("Точки не лежат на одной прямой.");
		}

	}

}
