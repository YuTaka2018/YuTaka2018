import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {

		System.out.println("数字を入力してください。");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("入力された数字は正の数です。 ");
		} else if (num < 0) {
			System.out.println("入力された数字は負の数です。 ");
		} else {
			System.out.println("入力された数字は0です。 ");
		}

		scan.close();

	}
}
