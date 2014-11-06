import javax.swing.*;
import java.util.*;



public class IO_GUI {
		private Scanner s;
	
	public IO_GUI() {
		s = new Scanner(System.in);
	} // closes constructor

	/**
	 * getWord prompts the user for an English word
	 *
	 * @return The English word entered by the user
	 */
	public String getWord() {
			String word = JOptionPane.showInputDialog("Enter an English word (press enter to quit): ");
			return word;
	}

	/**
	 * printTranslation prints an English word and its Spanish translation
	 *
	 * @param english The English word
	 * @param spanish The Spanish word
	 */
	public void printTranslation(String english, String spanish) {
		JOptionPane.showMessageDialog(null, english + ": " + spanish + "\n");
	}
}

