package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

public class ParagraphQuestion extends Question {

    // Class Variables


    // Constructor
    public ParagraphQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {

        if (answer.length() > 500) {
            System.out.println("Answer was longer than 500 characters!");
            return false;
        }

        String actualAnswer = this.getAnswer();
        return answer.toLowerCase().equals(actualAnswer.toLowerCase());

    }
}
