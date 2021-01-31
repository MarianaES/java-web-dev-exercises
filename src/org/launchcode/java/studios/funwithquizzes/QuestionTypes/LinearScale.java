package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

public class LinearScale extends Question {
    // Class Variables
    private int lowValue;
    private int highValue;

    // Constructor
    public LinearScale(String question, int lowValue, int highValue) {
        super(question, null);
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    // Methods

    public int getLowValue() { return this.lowValue; }

    public int getHighValue() { return this.highValue; }

    @Override
    public boolean checkAnswer(String answer) {

        int answerAsAnInt = Integer.parseInt(answer);
        return (answerAsAnInt >= lowValue && answerAsAnInt <= highValue);

    }
}
