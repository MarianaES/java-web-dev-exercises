package org.launchcode.java.studios.funwithquizzes.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.funwithquizzes.QuestionTypes.LinearScale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinearScaleTest {

    LinearScale myLinearScaleQuestion;

    @Before
    public void setUpTests() {
        this.myLinearScaleQuestion = new LinearScale("A test question", 1, 10);
    }

    @Test
    public void constructorSetProperties() {
        assertEquals("A test question", this.myLinearScaleQuestion.getQuestion());
        assertEquals(1, this.myLinearScaleQuestion.getLowValue());
        assertEquals(10, this.myLinearScaleQuestion.getHighValue());
    }

    @Test
    public void checksLinearAnswerAndReturnsTrue() {
        boolean actualAnswer = this.myLinearScaleQuestion.checkAnswer("5");
        assertTrue(actualAnswer);
    }
}
