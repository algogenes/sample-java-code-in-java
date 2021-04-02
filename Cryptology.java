public class Cryptology{

static String encrypt(String sentence, int key){

	int A = 1, B = 2, C = 3, D = 4, E = 5, F= 6, G = 7, H = 8, I = 9, J = 10;
	int K = 11, L = 12, M = 13, N = 14, O = 15, P = 16, Q = 17;
	int R = 18, S = 19, T = 20, U = 21, V = 22, W = 23, X = 24, Y = 25, Z = 26;

	int howLong;

	String newSentence;

	sentence = sentence.toUpperCase();

	howLong = sentence.length();

	int counte = 0;

	char[] counter = new char[howLong];

	int[] cont = new int[howLong];

	System.out.println("word sent is: " + sentence);

	System.out.println("word sent is of length: " + howLong);

	//char[] counter = sentence.toCharArray();

	//for(int counte = 0; counte < howLong; ++counte){  // loop to swap xters with numbers

	System.out.println("counter[counte] is: " + counter[0]);

	if (counter[counte] == 'A'){
		System.out.println("counter[counte] is: " + counter[counte]);
	cont[counte] = 1 + key;
	System.out.println("cont[counte]: " + cont[counte]);
	}
	/*
	else if(char[counter] == 'B'){
	char[counter] = 2 + key;
	}
	else if(char[counter] == 'C'){
	char[counter] = 3 + key;
	}
	else if(char[counter] == 'D'){
	char[counter] = 4 + key;
	}
	else if(char[counter] == 'E'){
	char[counter] = 5 + key;
	}
	else if(char[counter] == 'F'){
	char[counter] = 6 + key;
	}
	else if(char[counter] == 'G'){
	char[counter] = 7 + key;
	}
	else if(char[counter] == 'H'){
	char[counter] = 8 + key;
	}
	else if(char[counter] == 'I'){
	char[counter] = 9 + key;
	}
	else if(char[counter] == 'J'){
	char[counter] = 10 + key;
	}
	else if(char[counter] == 'K'){
	char[counter] = 11 + key;
	}
	else if(char[counter] == 'L'){
	char[counter] = 12 + key;
	}
	else if(char[counter] == 'M'){
	char[counter] = 13 + key;
	}
	else if(char[counter] == 'N'){
	char[counter] = 14 + key;
	}
	else if(char[counter] == 'O'){
	char[counter] = 15 + key;
	}
	else if(char[counter] == 'P'){
	char[counter] = 16 + key;
	}
	else if(char[counter] == 'Q'){
	char[counter] = (17 + key);
	}
	else if(char[counter] == 'R'){
	char[counter] = 18 + key;
	}
	else if(char[counter] == 'S'){
	char[counter] = 19 + key;
	}
	else if(char[counter] == 'T'){
	char[counter] = 20 + key;
	}
	else if(char[counter] == 'U'){
	char[counter] = 21 + key;
	}
	else if(char[counter] == 'V'){
	char[counter] = 22 + key;
	}
	else if(char[counter] == 'W'){
	char[counter] = 23 + key;
	}
	else if(char[counter] == 'X'){
	char[counter] = 24 + key;
	}
	else if(char[counter] == 'Y'){
	char[counter] = 25 + key;
	}
	else(char[counter] == 'Z'){
	char[counter] = 26 + key;

	if(char[counter] > 26){
		char[counter] = key - ((key/26)*26);
	}*/


	//}

	newSentence = String.valueOf(cont[0]);

	return("Values of cont are " + newSentence);


	}
	

	public static void main(String[] args){

		String word = "aaaaa";

		word = encrypt(word, 3);

		System.out.println(word);
	}
}