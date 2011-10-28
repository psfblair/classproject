package whiterabbit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class QuestionsTest {
	
	@Test
	public void displayQuestion() {
		Question question = new Question("I'm a question?");

		assertEquals("I'm a question?", question.getQuestion());
	}
	
	@Test
	public void shouldShowAnswer(){
		Question question = new Question("New question!");
		question.addAnswer("Whatever", 1);

		assertEquals("Whatever", question.getAnswers().get(0));
	}
	
	@Test
	public void shouldPrintQuestionAndAnswers(){
		Question question = new Question("Question");
		question.addAnswer("Answer", 1);

		assertEquals("Question\nAnswer\n", question.toString());
	}
	
	@Test
	public void shouldShowOneAnswer() {
		Question question = new Question("");
		question.addAnswer("Answer", 1);
		
		assertEquals("Answer", question.getAnswers().get(0));
	}
	
	@Test 
	public void shouldShowThreeAnswers(){
		Question question = new Question("");
		question.addAnswer("Answer1", 1);
		question.addAnswer("Answer2", 1);
		question.addAnswer("Answer3", 1);
		
		assertEquals("Answer1", question.getAnswers().get(0));
		assertEquals("Answer2", question.getAnswers().get(1));
		assertEquals("Answer3", question.getAnswers().get(2));
	}

    @Test
    public void returnTheScoreAssociatedWithUsersResponse() {
        Question question = new Question("Do you haz cheeseburger?");
        question.addAnswer("A) yes", 25);
        question.addAnswer("B) yes", 2);
        
        
        assertEquals(25, question.score("A"));
        assertEquals(2, question.score("B"));
    }
}
