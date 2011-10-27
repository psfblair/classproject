package whiterabbit;

public class JeffersonAirplane {
     
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test1 = "How sure are you that you want to be doing Agile developement?";
		Question question = new Question(test1);
		question.addAnswer("A) very sure.");
		question.addAnswer("B) kind of sure.");
		question.addAnswer("C) Not very sure at all.");
		
		
		System.out.println(question.toString());
	}

}
