package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

public class ShortAnswer extends Question {

    // Class Variables


    // Constructor
    public ShortAnswer(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {

        if (answer.length() > 80) {
            System.out.println("Answer was longer than 80 characters!");
            return false;
        }

        String actualAnswer = this.getAnswer();
        return answer.toLowerCase().equals(actualAnswer.toLowerCase());

    }
}
