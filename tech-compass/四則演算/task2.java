public class task2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 12;
		int num3 = 13;

		int total = (num1 + num2 + num3);
		int average = total / 3;
		double average2 = total / 3.0;


		//正しい回答
		System.out.println( "合計: " +  total);
		System.out.println("平均(3で割った時): " + average);
		System.out.println("平均(3.0で割った時): " +  average2);
	}
}
