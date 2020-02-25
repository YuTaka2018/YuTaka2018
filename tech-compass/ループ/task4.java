import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("正の整数を入力してください。: ");

		int num = scan.nextInt();
		int demit = 0;

		System.out.print(num + "の約数: ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0 && i < num) {
				demit = i;
				System.out.print(demit + ",");
			}
			if (i == num) {
				demit = i;
				System.out.print(demit);
			}
		}

		scan.close();

	}

}
