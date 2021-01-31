package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

import java.util.Locale;

public class MultipleChoice extends Question {

    // Class Variables


    // Constructor
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getAnswer();
        return answer.toLowerCase().equals(actualAnswer.toLowerCase());

    }
}
