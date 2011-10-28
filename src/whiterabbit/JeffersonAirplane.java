package whiterabbit;

import java.util.Scanner;

public class JeffersonAirplane {
    public static final String WELCOME = "\n\n" +
            "Welcome.  My name is Hume.  I am an educational computer simulation. \n" +
            "I'm your guide to the Agile world.\n\n" +
            "In order the determine if Agile is right for you, I need to know how you'll \n" +
            "deal with the following scenarios. These are real-life experiences from Agile \n" +
            "projects. How you choose to deal with these will tell me if you're truly \n" +
            "ready to be on an Agile team.\n\n";

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
        String test1 = "How sure are you that you want to be doing Agile development?";
        Question question = new Question(test1);
        question.addAnswer("A) very sure.", 10);
        question.addAnswer("B) kind of sure.", 5);
        question.addAnswer("C) Not very sure at all.", 0);
        printer.print(question.toString());

        String answer = reado.get();
        
        int response = question.score(answer);
        printer.print("You got a " + response);
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
