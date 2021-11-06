package greedyalgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Guild {

	public static void main(String[] args) {
		// 오름차순 정렬
		int array[] = {2,3,1,2,2};
		int group = 0;
		int i =0;
		Arrays.sort(array);
		// {1 2 2 2 3 };

		int temp = 0;

		for(int z=0; z <array.length; z++) {
			temp += 1;
			if(temp >= array[z]) {
				group++;
				temp = 0;
			}
		}
		System.out.println(group);


		System.out.println("오름차순 끝 ");
		/*// 내림차순 정렬 (프리미티브 타입)
		Integer arr[] = {2,3,1,2,2};
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i : arr) {
			System.out.println(i);
		}
*/

	}
}
