import java.util.Arrays;

class Ex5_4_re {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));

		for (int i=0; i < numArr.length; i++ ) {
			int n = (int)(Math.random() * 10);  // 0~9 ���� �� ���� ���Ƿ� ��´�.
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr));
		}
	} // main�� ��
}