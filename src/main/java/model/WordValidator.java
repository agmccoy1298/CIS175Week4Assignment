package model;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Feb 6, 2023
 */
public class WordValidator {
	//properties
	private String guessedWord;
	private String servletPath;
	private boolean isCorrect;
	final public String firstWord = "microsoft";
	final public String secondWord = "macintosh";
	
	//constructors
	public WordValidator() {
		super();
	}
	//non-default
	public WordValidator(String _guessedWord, String _servletPath) {
		super();
		this.guessedWord = _guessedWord;
		this.servletPath = _servletPath;
		DetermineIfIsCorrect();
	}
	
	//getters and setters (don't really need these tbh except the bool one)
	public String getGuessedWord() {
		return guessedWord;
	}
	public void setGuessedWord(String guessedWord) {
		this.guessedWord = guessedWord;
	}
	public String getServletPath() {
		return servletPath;
	}
	public void setServletPath(String servletPath) {		
		this.servletPath = servletPath;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
		
	//helper methods
	public void DetermineIfIsCorrect() {
		String tempGuessedWord = getGuessedWord();
		if(getServletPath().toLowerCase() == "first") {
			if(tempGuessedWord.equalsIgnoreCase(firstWord)) {
				setCorrect(true);
			}else {
				setCorrect(false);
			}
		}else{
			if(tempGuessedWord.equalsIgnoreCase(secondWord)) {
				setCorrect(true);
			}else {
				setCorrect(false);
			}			
		}
	}
	
	@Override
	public String toString() {
		if(isCorrect) {
			return "Correct! the word was: " + getGuessedWord();
		}else {
			return "That's incorrect! Try again!";
		}
	}
}
