import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		int pcPrice = 89800;
		System.out.println( "ノートPCの値段: " + pcPrice + "円");

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str2);

		scan.close();
	}

}
