package whiterabbit;

import whiterabbit.JeffersonAirplane.Printer;

public class JeffersonAirplane {
    private final Printer printer;

	public static final String WELCOME = "Greetings, Earthling!";


    String test1 = "You’ve just been name project manager on the new \n" +
"ASTRO project that is slated to start next week.\n"+
            "On your team is Tom the Tester, \n" +
"David, Daniel,and Debbie the Developers,\n"+
            "Bob the Business Analyst, and Uma the UX Designer.\n"+
"A great group of highly experienced people\n"+
            "and some of the best in the company.\n"+

"However...turns out Tom is currently located in building\n"+
"C down the road, David and Daniel and Debbie are together \n"+
"but one floor down, Bob’s cube is right next to you in \n"+
"building F, and Uma has a floating desk and care move anywhere.\n"+
"And Charlie the Customer is located on the 6th floor of \n"+
"building D.  Below are the available space/configuration options.\n"+
"It’s up to you to choose the best working set up for your team.";


    public JeffersonAirplane() {
        printer = new Printer();
    }

    
    
    
    public JeffersonAirplane(Printer printer) {
		this.printer = printer;
	}


	public static void main(String[] args) {
        new JeffersonAirplane().run();
	}

    void run() {
        printer.print(WELCOME);
        Question question = new Question(test1);
        question.addAnswer("A) very sure.");
        question.addAnswer("B) kind of sure.");
        question.addAnswer("C) Not very sure at all.");
        printer.print(question.toString());
    }

    static  class Printer {
        public void print(String toPrint){
            System.out.println(toPrint);
        }
    }
}
