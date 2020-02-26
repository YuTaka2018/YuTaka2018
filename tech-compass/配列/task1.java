public class task1 {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2 };

		//配列を順番に格納する
		System.out.print("配列: [");
		for (int i = 0; i < array.length; i++) {
			if (i < (array.length - 1)) {
				System.out.print(array[i] + ",");
			} else {
				System.out.print(array[i] + "]");
			}
		}

		//合計を算出する
		int total = 0;
		System.out.print("\n");
		System.out.print("合計: ");

		for (int ary : array) {
			total += ary;
		}
		System.out.print(total);
	}

}
