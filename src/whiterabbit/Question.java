package whiterabbit;

import java.util.ArrayList;
import java.util.List;

public class Question {

	String question;
	List<String> answers;
	
	
	public List<String> getAnswers(){
		return answers;
		}
	
	public Question(String questionText) {
		question = questionText;
		answers = new ArrayList<String>();
	}
	

	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}


	public void addAnswer(String answerText) {
		// TODO Auto-generated method stub
		answers.add(answerText);
	}
	
	@Override
	public String toString(){
		String display = question + "\n";
		for(String answer: answers){
			
			display += answer;
			display += "\n";
		}
	
		return display;
		
	}


}
