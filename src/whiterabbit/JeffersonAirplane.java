package whiterabbit;
import java.util.Scanner;

import whiterabbit.JeffersonAirplane.Printer;

public class JeffersonAirplane {
				
    private static final String ANSWER1C = 

"C) Team Room Orange - located on the 2nd floor in building D (same building\n" +
"as Charlie) and is the nicest team space.  However, it will take the\n" +
"developers three days to move, Tom will need hour every morning and\n" +
"evening for travel, and Bob will need 30 min notice to get there and\n" +
"can spend 3-4 hours a day.\n";

	private static final String ANSWER1B = 
"B) Conference Room A - located in building K.  This room is an old conference\n" +
"room \"with potential\".  Charles can be there three times a week.  Developers\n" +
"need two days to set up.  and Tom needs 30 min of travel time every morning\n" +
"and evening.  There is an old conference table and chairs and it will take\n" +
"two weeks for new furniture.\n";

	private static final String ANSWER1A = 
"A) Team Room 231 - located on the 3rd floor in building F (your building).\n" +
"The developers can move in right away because it's already wired.  However,\n" +
"Charlie the Customer can only be in the building on Tuesdays from 9:00-11:30\n" +
"and Tom will need 45 min every morning and evening for travel.\n";

	public static final String WELCOME = 
"\n\nWelcome.  My name is Hume.  I am an educational computer simulation. \n" +
"I'm your guide to the Agile world.  In order the determine if Agile is right\n" +
"for you, I need to know how you'll  deal with the following scenarios.\n" +
"These are real-life experiences from Agile  projects. How you choose to\n" +
"deal with these will tell me if you're truly  ready to be on an Agile team.\n";

    String test1 = 
"You've just been name project manager on the new ASTRO project that is\n" +
"slated to start next week. On your team is Tom the Tester, David, Daniel,\n" +
"and Debbie the Developers, Bob the Business Analyst, and Uma the UX\n" +
"Designer. A great group of highly experienced people and some of the\n" +
"best in the company.\n\n"+

"However...turns out Tom is currently located in building C down the road,\n" +
"David and Daniel and Debbie are together but one floor down, Bob's cube\n" +
"is right next to you in  building F, and Uma has a floating desk and can\n" +
"move anywhere. And Charlie the Customer is  located on the 6th floor of\n" +
"building D.  Below are the available space/configuration options. It's\n" +
"up to you to choose the best working set up for your team.\n";
  
private final Printer printer;
    private ReadoDude reado;


    public JeffersonAirplane() {
        printer = new Printer();
        reado = new ReadoDude(printer);
    }

    public JeffersonAirplane(Printer printer, ReadoDude reado) {
        this.printer = printer;
        this.reado = reado;
    }

    public static void main(String[] args) {
        new JeffersonAirplane().run();
	}

    void run() {
        printer.print(WELCOME);
        paginate();
        Question question = new Question(test1);
        question.addAnswer(ANSWER1A, 10);
        question.addAnswer(ANSWER1B, 5);
        question.addAnswer(ANSWER1C, 0);
        printer.print(question.toString());

        String answer = reado.get();
        
        int response = question.score(answer);
        printer.print("You got a " + response);
    }

	private void paginate() {
		printer.print("Please hit RETURN to continue...");
        new Scanner(System.in).nextLine();
	}


    static class Printer {
        public void print(String toPrint){
            System.out.println(toPrint);
        }
    }

    static class ReadoDude {
        private Printer printer;

        public ReadoDude(Printer printer) {
            this.printer = printer;
        }

        public String get() {
            printer.print(">");
            String s = new Scanner(System.in).nextLine();
            printer.print("Thank you!");
            return s;
        }
    }
}
