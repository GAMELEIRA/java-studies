package org.gameleira.app;

public class App {

	public static class MathUtils {

		public static int square(int x) {
			return x * x;
		}

		public static int cube(int x) {
			return x * x * x;
		}

		public static int factorial(int x) {
			int result = 1;
			for (int i = 2; i <= x; i++) {
				result *= i;
			}
			return result;
		}

		public static boolean isEven(int x) {
			return x % 2 == 0;
		}
	}

	public static void main(String[] args) {
        System.out.println("5 ao quadrado: " + MathUtils.square(5));
        System.out.println("3 ao cubo: " + MathUtils.cube(3));
        System.out.println("fatorial de 4: " + MathUtils.factorial(4));
        System.out.println("8 é par? " + MathUtils.isEven(8));
	}

}
