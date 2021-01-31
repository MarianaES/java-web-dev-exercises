package org.launchcode.java.studios.funwithquizzes;

import org.launchcode.java.studios.funwithquizzes.QuestionTypes.*;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice myMultipleChoiceQuestion = new MultipleChoice("What sound does a dog make?\nA: Bark\nB: Quak\nPlease just type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        Checkbox myCheckboxQuestion = new Checkbox("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "B, C");
        myQuiz.addQuestion(myCheckboxQuestion);

        TrueOrFalse myTrueOrFalseQuestion = new TrueOrFalse("Dogs are omnivores?\nTrue or False?", "True");
        myQuiz.addQuestion(myTrueOrFalseQuestion);

        ShortAnswer myShortQuestion = new ShortAnswer("Kangaroos are from which country?", "Australia");
        myQuiz.addQuestion(myShortQuestion);

        LinearScale myLinearScaleQuestion = new LinearScale("On a scale from 1-10 how cute are penguins?", 8, 10);
        myQuiz.addQuestion(myLinearScaleQuestion);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why animals are cool?", "Because they are.");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();
    }
}
