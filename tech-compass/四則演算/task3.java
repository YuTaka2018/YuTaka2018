import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {

	System.out.println( "数字を3回入力してください。");
	Scanner scan = new Scanner(System.in);

	int str1 = scan.nextInt();

	int str2 = scan.nextInt();

	int str3 = scan.nextInt();

	int total = (str1 + str2 + str3);
	int average = total / 3;
	double average2 = total / 3.0;

	scan.close();

	//正しい回答
	System.out.println( "合計: " +  total);
	System.out.println("平均(3で割った時): " + average);
	System.out.println("平均(3.0で割った時): " +  average2);

	}
}
