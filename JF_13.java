import java.util.Arrays;


public class JF_13 {

	public static void main(String[] args) {
		int[] nums={6,7,-2,-3,0,1,2,3,4};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);

	}

}
