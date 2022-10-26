package automaticWord;

public class Main {

	public static void main(String[] args) {
		String[] wordList1 = {
				"blue","red","yello","green"
		};
		String[] wordList2 = {
				"big","large","small"
		};
		String[] wordList3 = {
			"cat","dog","fox","ant","fish"
		};

		int length1 = wordList1.length;
		int length2 = wordList2.length;
		int length3 = wordList3.length;
		
		int rand1 = (int)(Math.random() * length1);
		int rand2 = (int)(Math.random() * length2);
		int rand3 = (int)(Math.random() * length3);
		
		System.out.println(wordList1[rand1] + " "
		+wordList2[rand2] + " " + wordList3[rand3] + " ");
		
	}

}
