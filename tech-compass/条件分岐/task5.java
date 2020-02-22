import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		System.out.println("数字を入力してください。");
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		System.out.println("numA: " + num1);

		int num2 = scan.nextInt();
		System.out.println("numB: " + num2);

		int num3 = scan.nextInt();
		System.out.println("numC: " + num3);

		if (num1 > num2 && num1 > num3) {
			System.out.println("最大値: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("最大値: " + num2);
		} else {
			System.out.println("最大値: " + num3);
		}

		scan.close();
	}

}
