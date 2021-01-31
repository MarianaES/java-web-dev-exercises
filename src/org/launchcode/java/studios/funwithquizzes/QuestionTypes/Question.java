package org.launchcode.java.studios.funwithquizzes.QuestionTypes;

public abstract class Question {
    // Protected modifier allows access from class and package
    // Final so it can never change
    protected final String question;
    protected final String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public abstract  boolean checkAnswer(String answer);

}
