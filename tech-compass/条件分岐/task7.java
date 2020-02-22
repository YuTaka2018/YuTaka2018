import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {

		System.out.println("病院に行く曜日を入力してください。");
		System.out.println("【 日曜, 月曜, 火曜, 水曜, 木曜, 金曜, 土曜 】");
		Scanner scan = new Scanner(System.in);

		String week = scan.nextLine();
		System.out.println(week);

		switch (week) {
		case "月曜":
		case "火曜":
		case "水曜":
		case "木曜":
		case "金曜":
			System.out.println("午前診療と午後診療があります");
			break;
		case "土曜":
			System.out.println("土曜は午前診療のみです");
			break;
		case "日曜":
			System.out.println("日曜は休診です");
			break;
		default:
			System.out.println("入力を確認してください");
			break;
		}
		scan.close();
	}
}
