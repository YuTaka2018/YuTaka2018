import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		System.out.println( "10以上の数字を入力してください。");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		if(num > 9) System.out.println("値: " + num);
		if(num <= 9) System.out.println("値: " + 10);

		scan.close();
	}

}
