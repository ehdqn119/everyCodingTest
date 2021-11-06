package greedyalgorithm;

public class DevideNumber {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		System.out.println(beforeTime);
		int n = 25;
		int k = 3;
		int count = 0;
		for(;;) {
			if(n ==1) break;
			if(n % k ==0) {
				n= n/k;
				count++;

			}
			else {
				n = n-1;
				count++;
			}
		}
		System.out.println("최소 횟수는 : " + count);
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		System.out.println(afterTime);
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		
	}
}
