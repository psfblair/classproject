package whiterabbit;

import com.sun.codemodel.internal.JAnnotationArrayMember;

public class JeffersonAirplane {
    public static final String WELCOME = "Greetings, Earthling!";
    private final Printer printer;

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
        Question question = new Question("I am the first question?");
        printer.print(question.getQuestion());
    }

    static  class Printer {
        public void print(String toPrint){
            System.out.println(toPrint);
        }
    }
}
