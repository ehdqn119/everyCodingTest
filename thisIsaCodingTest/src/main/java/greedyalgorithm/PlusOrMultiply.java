package greedyalgorithm;

public class PlusOrMultiply {

	public static void main(String[] args) {
		int[] numberType = {0,2,9,8,4};
		int result = numberType[0];
		for(int i=0; i <numberType.length; i++) {
			if(numberType.length-1 == i) {
				break;
			}
			if(numberType[i] != 0 && numberType[i] != 0) {
				result = result * numberType[i+1];
			} else {
				result = result + numberType[i+1];
			}
		}
		System.out.println(result);
	}



}
