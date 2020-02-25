import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力してください。: ");
		int num = scan.nextInt();

		int plus = 1;
		System.out.print(1);

		for (int i = 2; i <= num; i++) {
			plus += i;
			System.out.print("+" + i);
		}

		System.out.print("=" + plus);
		scan.close();
	}
}
