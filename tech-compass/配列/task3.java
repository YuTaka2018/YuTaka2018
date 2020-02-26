import java.util.Random;

public class task3 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[6];

		//ランダムに数を出し、配列に格納する
		for(int i = 0; i < 6; i++) {
		int ranNum = random.nextInt(10);
		array[i] = ranNum;
		}

		//配列を出力する
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i < (array.length - 1)) {
				System.out.print(array[i] + ",");
			} else {
				System.out.println(array[i] + "]");
			}
		}

		//最大値と最小値を出力する
		int maxNum = array[1];
		int minNum = array[1];

		for (int i = 0; i < array.length; i++) {

			int a = array[i];
			if (a > maxNum) {
				maxNum = a;
			}
			if(a < minNum){
				minNum = a;
			}
		}
		System.out.println("最大値: " + maxNum);
		System.out.print("最小値: " + minNum);
	}
}
