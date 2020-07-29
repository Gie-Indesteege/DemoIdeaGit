package be.abis.git.demo;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class AppCourse {
    public static void main(String[] args) {
        System.out.println("Welcome to the course application demo");

        Course c1 = new Course(1769, "Java tooling", "Tooling for Java CI/CD", 3 ,1200.0);
        Session s1 = new Session(125, LocalDate.of(2020,9,14));
        Session s2 = new Session(126, LocalDate.of(2020,9,29));
        c1.addSession(s1);
        c1.addSession(s2);
        System.out.println("Planned courses");
        System.out.println("Course " + c1.getCourseLongTitle() + " is planned in the following sessions:");
        for(Session s : c1.getListOfSessions())
            System.out.println("Session " + s.getSessionNr() + "on : " + s.getSessionDate());

    }
}
