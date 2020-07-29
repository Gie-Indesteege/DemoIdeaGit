package be.abis.git.demo.test;

import be.abis.git.demo.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCourse {

    @Test
    public void testCoursename() {
        Course c1 = new Course(1769, "Eclipse", "Java tool: Eclipse", 1, 400);
        assertEquals("Oclipse", c1.getCourseShortTitle() , "error in short name");
    }
    @Test
    public void testCourseDuration() {
        Course c2 = new Course(1769, "Java SE", "Java SE programming", 4, 1600);
        assertEquals( 5, c2.getCourseDur(), "error in duration");
    }
}
