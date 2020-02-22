import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		System.out.println("1から5までの数字を入力してください。");
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		System.out.println(num1);

		String setnum;

		if (num1 == 1) {
			setnum = "Ⅰ";
		} else if (num1 == 2) {
			setnum = "Ⅱ";
		} else if (num1 == 3) {
			setnum = "Ⅲ";
		} else if (num1 == 4) {
			setnum = "Ⅳ";
		} else if (num1 == 5) {
			setnum = "Ⅴ";
		} else {
			setnum = "unknown";
		}
		System.out.println(num1 + " -> " + setnum);
		scan.close();
	}

}
