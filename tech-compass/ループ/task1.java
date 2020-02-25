import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください。");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int plus = 0;

		for (int i = 0; i <= num; i++) {
			plus += i;
		}

		System.out.println(1 + "～" + num + "までの合計: " + plus);
		scan.close();
	}

}
