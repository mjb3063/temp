/** MODEL
 * This class holds all words in the English-Spanish dictionary.
 *
 */

import java.util.*;
import java.io.*;

public class Converter {
	public Entry[] dictionary;

	/**
	 * Converter loads the English-Spanish dictionary
	 *
	 * @param filename The filename of the dictionary
	 */
	public Converter(String filename) throws IOException {
		Scanner inFile = new Scanner(new File(filename));
		
		Entry [] dictionary = new Entry[Integer.parseInt(inFile.nextLine())];

		for (int i = 0; i < dictionary.length; i++) {

			String line = inFile.nextLine();
			String [] holdingArray = new String [2];
			holdingArray = line.split("\t");
			String englishWord = holdingArray[0];
			String spanishWord = holdingArray[1];

			Entry word = new Entry (englishWord, spanishWord);
			dictionary[i] = word;

			
			//YOU DO THIS
			//break line into the English section and the Spanish section
			//the two pieces are separated by a "\t" character -- use split or StringTokenizer
			//create a new Entry object with the English and Spanish parts,
			//and store it at spot i in the dictionary array
		}
		inFile.close();
	}

	/**
	 * translate returns the Spanish translation
	 * of english
	 *
	 * @param english The english word to translate
	 * @return The spanish translation, or a message that it couldn't be found
	 */
	public String translate(String english) {
		for (int i = 0; i < dictionary.length; i++) {
			if (english.equals(dictionary[i].getEnglish())) {
				return dictionary[i].getSpanish();
			}
		}

		return "Word not in dictionary";
	}
}