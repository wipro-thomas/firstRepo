public class Q6 {
	public static void main(String[] args) {
		int[] input = {1,2,3,1,0,1,5,6,7,8,9};
		longestIncreasingSeq(input.length, input);
	}
	
	public static void longestIncreasingSeq(int input1, int[] input2) {
		int currCount = 0;
		int finalCount = 0;
		int highest = 0;
		for(int i = 0;i < input1;i++) {
			if(highest == 0) {
				highest = input2[i];
				currCount++;
			}
			else if(input2[i] > highest) {
				highest = input2[i];
				currCount++;
			}
			else if(input2[i] < highest) {
				highest = input2[i];
				if(finalCount < currCount) {
					finalCount = currCount;
				}
				
				currCount = 1;
			}			
		}
		System.out.println(finalCount);
	}
}
