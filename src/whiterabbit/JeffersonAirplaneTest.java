package whiterabbit;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JeffersonAirplaneTest {
    JeffersonAirplane application;

    @Before
    public void setUp() throws Exception {
        application = new JeffersonAirplane(new JeffersonAirplane.Printer() {
            public void print(String toPrint) {
                printed.add(toPrint);
            }
        });

    }

    ArrayList<String>printed = new ArrayList<String>();

    @Test
    public void printerIsAskedToPrintTheQuestion() {
        application.run();
        assertTrue("should have printed the question", printed.contains("I am the first question?"));
    }

    @Test
    public void printerIsAskedToPrintAGreeting() {
        application.run();
        assertTrue("should have greeted me", printed.contains("Greetings, Earthling!"));
    }
}
