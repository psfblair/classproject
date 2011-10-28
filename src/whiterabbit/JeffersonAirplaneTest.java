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
        JeffersonAirplane.Printer printer = new JeffersonAirplane.Printer() {
            public void print(String toPrint) {
                printed.add(toPrint);
            }
        };

        JeffersonAirplane.ReadoDude reado = new JeffersonAirplane.ReadoDude(printer) {
            public String get() {
                return "";
            }
        };

        application = new JeffersonAirplane(printer, reado);
    }

    ArrayList<String> printed = new ArrayList<String>();

    @Test
    public void printerIsAskedToPrintAGreeting() {
        application.run();
        assertTrue("should have greeted me", printed.contains(JeffersonAirplane.WELCOME));
    }
}
