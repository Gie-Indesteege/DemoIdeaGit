package be.abis.git.demo.test;

import be.abis.git.demo.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSession {
    Session s1;

    @Before
    public void setUp() throws Exception {
        s1 = new Session(125, LocalDate.of(2020, 1, 12));
    }

    @After
    public void tearDown() throws Exception {
        s1 = null;
    }

    @Test
    public void testSessionDate() {
        assertEquals( LocalDate.of (2011,1,31), s1.getSessionDate(), "error in date");
    }
}
