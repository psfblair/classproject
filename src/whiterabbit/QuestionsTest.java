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
		question.addAnswer("Whatever");

		assertEquals("Whatever", question.getAnswers().get(0));
	}
	
	@Test
	public void shouldPrintQuestionAndAnswers(){
		Question question = new Question("Question");
		question.addAnswer("Answer");

		assertEquals("Question\nAnswer\n", question.toString());
	}
	
	@Test
	public void shouldShowOneAnswer() {
		Question question = new Question("");
		question.addAnswer("Answer");
		
		assertEquals("Answer", question.getAnswers().get(0));
	}
	
	@Test 
	public void shouldShowThreeAnswers(){
		Question question = new Question("");
		question.addAnswer("Answer1");
		question.addAnswer("Answer2");
		question.addAnswer("Answer3");
		
		assertEquals("Answer1", question.getAnswers().get(0));
		assertEquals("Answer2", question.getAnswers().get(1));
		assertEquals("Answer3", question.getAnswers().get(2));
	}
}
