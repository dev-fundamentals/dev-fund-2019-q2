package main.java.RocioEncinas;

public class Cadenas {
	
	public static void printIndexesByWord(String indexes, String words) {
		if(!indexes.isEmpty() && !words.isEmpty()) {
			System.out.println("indices: " + indexes);
			System.out.println("palabra: " + words);
		}
	}

	public static void searchForRepetition(String wordToSearch, int nextIndex, String[] cadenas, String indexes) {
		String word = "";
		int count = nextIndex;
		while(count < cadenas.length) {
			if(wordToSearch.equals(cadenas[count])) {
				indexes += ", " + (count);
				word = cadenas[count];
			}
			count++;
		}
		
		printIndexesByWord(indexes, word);
	}
	
	public static void main(String[] args) {
		String indexes = "";
		String[] cadenas = new String[5];
		cadenas[0] = "HOLA";
		cadenas[1] = new String("HOLA");
		cadenas[2] = "ABC";
		cadenas[3] = "123";
		cadenas[4] = new String("1234");
		
		for(int i = 0; i < cadenas.length; i++) {
			indexes = Integer.toString(i);
			String currentWord =  cadenas[i];
			String next = (i+1 == cadenas.length) ? "" : cadenas[i+1];
			if(!next.isEmpty()) {
				searchForRepetition(currentWord, i+1, cadenas, indexes);
			}
		}
	}
}
