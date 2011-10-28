package whiterabbit;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class Question {

	String question;
	List<String> answers;
    HashMap<String, Integer> answers_with_scores;
	
	
	public List<String> getAnswers(){
		return answers;
		}
	
	public Question(String questionText) {
		question = questionText;
		answers = new ArrayList<String>();
		answers_with_scores = new HashMap<String, Integer>();
	}
	

	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}


    public void addAnswer(String answerText, int value) {
        answers.add(answerText);
        answers_with_scores.put(answerText.substring(0,1), value);
    }

    public int score(String answer) {
        return answers_with_scores.get(answer);
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
