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
        String test1 = "How sure are you that you want to be doing Agile development?";
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
