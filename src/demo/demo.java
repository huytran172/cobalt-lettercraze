package demo;

public class demo {
	int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] newNum = new int[9];

	boolean ascending = true;
	public void customPrint() {
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				ascending = false;
			}

			if (ascending) {

			}
		}
	}


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
