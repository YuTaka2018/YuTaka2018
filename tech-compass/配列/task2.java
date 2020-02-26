public class task2 {

	public static void main(String[] args) {
		int[] array = new int[] { 7, 6, 5, 4, 3, 2, 1 };

		//配列を順番に出す
		for (int i = 0; i < array.length; i++) {
			if (i < (array.length - 1)) {
				System.out.print(array[i] + ",");
			} else {
				System.out.println(array[i]);
			}
		}

		//配列を逆順に出す
		for (int j = 6; 0 < array.length; j--) {
			if (j >= 1) {
				System.out.print(array[j] + ",");
			} else {
				System.out.print(array[j]);
				break;
			}
		}
	}
}
