package org.launchcode.java.studios.funwithquizzes.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.funwithquizzes.QuestionTypes.Checkbox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckboxTest {

    Checkbox myCheckboxQuestion;

    @Before
    public void setUpTests() {
        this.myCheckboxQuestion = new Checkbox("A test question", "A test answer");
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myCheckboxQuestion.getQuestion());
        assertEquals("A test answer", this.myCheckboxQuestion.getAnswer());
    }

    @Test
    public void checkAnswerReturnsTrue() {
        boolean actualAnswer = myCheckboxQuestion.checkAnswer("A test answer");
        assertTrue(actualAnswer);
    }
}
