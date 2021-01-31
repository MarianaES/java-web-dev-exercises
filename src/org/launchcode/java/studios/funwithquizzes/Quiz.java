package org.launchcode.java.studios.funwithquizzes;

import org.launchcode.java.studios.funwithquizzes.QuestionTypes.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {

    }

    public ArrayList<Question> getQuestions() { return this.questions; }

    //   Add Questions To Quiz
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    //   Run the Quiz
    public void runQuiz() {

        for (Question question : questions) {
            System.out.println(question.getQuestion());

            String usersAnswer = this.getUsersAnswers();

            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);

            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        //   Grade the Quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");

    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
