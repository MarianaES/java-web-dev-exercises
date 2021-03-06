package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

public class Checkbox extends Question {

    // Class Variables


    // Constructor
    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getAnswer();
        return answer.toLowerCase().equals(actualAnswer.toLowerCase());

    }

}
