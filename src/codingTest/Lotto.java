package codingTest;

public class Lotto {
	// 배열로 만들어보자!

	private int[] lotto() {
		int[] array = new int[6];
		// 로또추첨기를 만든다.
		for (int i = 0; i < array.length; i++) {
			int randomNumber = (int) (Math.random() * 45) + 1;
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if (array[j] == randomNumber) {
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				array[i] = randomNumber;
			} else {
				i--;
			}
		}
		// 오름차순정리
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}

			}

		}
		return array;

	}

	// 로또 출력
	private void getLotto() {
		int[] lotto = lotto();
		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}
	
	//몇장사는데?
	public void buyLotto(int number) {
		int count = 0;
		
		System.out.printf("\tLOTTO: %d장, 금액: %,d%n", number, number*1000);
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		while(count < number) {
			count++;
			getLotto();
			System.out.println();
			System.out.println("------------------------------------------");
			
		}
	}

}
