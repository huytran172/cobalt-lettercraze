package demo;

public class demo {
	public static void main(String[] args){
		int[] nums = new int[10];
		boolean isOdd = true;
		for (int i = 1; i <= 9; i++) {
			if (i % 3 == 1 && i != 1) {
				if (isOdd) isOdd = false;
				else isOdd = true;
			}

			if (isOdd) {
				nums[i] = i;
			}
			
			if (! isOdd) {
				
			}
			
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
