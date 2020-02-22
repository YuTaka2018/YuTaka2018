import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		System.out.println("数字を入力してください。");
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		System.out.println("numA: " + num1);

		int num2 = scan.nextInt();
		System.out.println("numB: " + num2);

		if (num2 == 0) {
			System.out.println("正の整数を入力してください");
		}

		if (num1 % num2 == 0) {
			System.out.println("numBはnumAの約数です。");
		} else {
			System.out.println("numBはnumAの約数ではありません。");
		}

		scan.close();

	}

}
