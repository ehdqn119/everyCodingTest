package greedyalgorithm;

/***
 * <h1> 거스름돈 문제 풀이입니다. </h1>
 * <h4> 문제는 노션을 참고해주세요. </h4>
 * @version 1.0.0
 * @author Lee Sang Min
 */
public class Change {
	public static void main(String[] args) {
		/*// 정석풀이
		*//**
		 * n = 초기 거스름돈 값
		 *//*
		int n = 1260;
		*//**
		 * cnt = 동전의 수
		 *//*
		int cnt = 0;
		*//**
		 * coinTypes = 거스름돈 동전의 종류 입니다.
		 *//*
		int [] coinTypes = {500, 100, 50, 10};
		int result = 0;
		for(int i=0; i<coinTypes.length; i++) {
			cnt = n / coinTypes[i];
			n = n % coinTypes[i];
			System.out.println(coinTypes[i] + "원 동전의 수는 : " + cnt);
			System.out.println("거스름돈의 잔액은 : " + n);
			result += cnt;
			System.out.println("총 갯수는 : " + result);
		}*/


		// 내가 생각한 풀이
		int m = 1260;
		int mCnt = 0;
		int [] mCoinTypes = {500, 100, 50, 10};
		int mResult = 0;
		int countValue = 0;

		for(;;) {
			if(m == 0) {
				break;
			}
			mCnt = m / mCoinTypes[countValue];
			m = m % mCoinTypes[countValue];
			System.out.println(mCoinTypes[countValue] + "원 동전의 수는 : " + mCnt);
			System.out.println("거스름돈의 잔액은 : " + m);
			mResult += mCnt;
			System.out.println("총 갯수는 : " + mResult);
			countValue++;
		}
		System.out.println("총 동전의 개수는" + mResult);

	}
}


