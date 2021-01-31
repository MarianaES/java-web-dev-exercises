package org.launchcode.java.studios.funwithquizzes.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.funwithquizzes.QuestionTypes.Checkbox;
import org.launchcode.java.studios.funwithquizzes.Quiz;

import static org.junit.Assert.assertEquals;

public class QuizTest {

    Quiz myQuiz;

    @Before
    public void setUpTests() {
        this.myQuiz = new Quiz();
    }

    @Test
    public void addQuestionMethodAddsQuestion() {
        Checkbox testQuestion = new Checkbox("A test question", "A test answer");
        this.myQuiz.addQuestion(testQuestion);
        assertEquals(1, this.myQuiz.getQuestions().size());
    }
}
