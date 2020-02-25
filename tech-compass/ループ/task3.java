import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力してください。: ");
		long num = scan.nextInt();

		int val = 0;

		while (num > 0) {
			num = num / 10;
			val++;
		}
		System.out.print("桁数: " + val);
		scan.close();
	}
}
