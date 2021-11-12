package assignments;

public class NestedLoopsAssign {

	// Create Loops with For Loops - 4
	// While Loop-5
	// Do- While --4
	public static void main(String[] args) {

		int i = 0;
		int Count = 0;
		while (i < 5) {

			

			for (int j = 0; j < 4; j++) {
				int k = 0;

				do {
					System.out.println("While Loop-->" + i + "    For Loop-->    " + j + "    Do-While Loop--->  " + k);
					k++;
					Count++;

				} while (k < 4);

				

			}i++;

		}System.out.println(" Total Count is : " + Count);

	}

}
