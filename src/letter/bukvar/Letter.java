package letter.bukvar;

import java.util.HashMap;

public class Letter {

	HashMap<Character, String> letters = new HashMap();
	private char letter;
	private String word;

	/**
	 * @author Georgy User this method if you would like to add a new Word
	 */
	public void setLetter(char letter, String word) {
		this.letter = letter;
		this.word = word;
		letters.put(letter, word);
	}

	/**
	 * Below is the database of letters and words
	 *
	 */

	public void setMap() {
		
		letters.put('a', "Ананас");
		letters.put('b', "Бреза");
		letters.put('w', "Везна");
		letters.put('g', "Градина");
		letters.put('d', "Диван");
		letters.put('e', "Еделвайс");
		letters.put('v', "Жена");
		letters.put('z', "Зебра");
		letters.put('i', "Игра");
		letters.put('j', "Йордан");
		letters.put('k', "Килим");
		letters.put('l', "Лъв");
		letters.put('m', "Маргаритка");
		letters.put('n', "Несебър");
		letters.put('o', "Охлюв");
		letters.put('p', "Перо");
		letters.put('s', "Салата");
		letters.put('t', "Тиква");
		letters.put('u', "Ухо");
		letters.put('f', "Фенер");
		letters.put('h', "Хляб");
		letters.put('c', "Цар");
		letters.put('`', "Чай"); // ch
		letters.put('[', "Шампион"); // sh
		letters.put(']', "Щраус"); // st
		letters.put('y', "Ъгъл");
		letters.put('x', "Миньор");
		letters.put('0', "Юрган");
		letters.put('q', "Ябълка");

	}

}
