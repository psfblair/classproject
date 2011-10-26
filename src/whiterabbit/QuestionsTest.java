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
}
