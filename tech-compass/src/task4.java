public class task4 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;

		while (num1 < 9) {
			num1++;
			while (num2 < 10) {
				System.out.print((num1 * num2) + " ");
				num2++;
			}
			System.out.print("\n");
			num2 = 1;
		}

	}

}
