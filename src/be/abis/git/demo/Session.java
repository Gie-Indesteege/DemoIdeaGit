package be.abis.git.demo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Session {
    private int SessionNr;
    private LocalDate sessionDate;
    private String sessionKind;
    private String sessionCancel;
    private int sessionCid;

    private ArrayList<Person> listOfEnrollees = new ArrayList<>();

    public Session(int sessionNr, LocalDate sessionDate) {
        SessionNr = sessionNr;
        this.sessionDate = sessionDate;
    }

    public Session(LocalDate aDate) {
        sessionDate = aDate;
    }

    public void addEnrolment(Person p) {
        listOfEnrollees.add(p);
    }

    public void removeEnrolment(Person p) {
        listOfEnrollees.remove(p);
    }

    public int getSessionNr() {
        return SessionNr;
    }

    public void setSessionNr(int sessionNr) {
        SessionNr = sessionNr;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public int getSessionCourse() {
        return sessionCid;
    }

    public void setSessionCid(int sessionCid) {
        this.sessionCid = sessionCid;
    }

    public String getSessionKind() {
        return sessionKind;
    }

    public void setSessionKind(String sessionKind) {
        this.sessionKind = sessionKind;
    }

    public String getSessionCancel() {
        return sessionCancel;
    }

    public void setSessionCancel(String sessionCancel) {
        this.sessionCancel = sessionCancel;
    }

    public ArrayList<Person> getListOfEnrollees() {
        return listOfEnrollees;
    }

    public void setListOfEnrollees(ArrayList<Person> listOfEnrollees) {
        this.listOfEnrollees = listOfEnrollees;
    }
}
