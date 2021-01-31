package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

public class TrueOrFalse extends Question{

    // Class Variables


    // Constructor
    public TrueOrFalse(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {

        return answer.toLowerCase().equals(this.getAnswer().toLowerCase());

    }
}
