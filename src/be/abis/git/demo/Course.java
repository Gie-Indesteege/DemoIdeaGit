package be.abis.git.demo;

import java.util.LinkedList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseShortTitle;
    private String courseLongTitle;
    private int courseDur;
    private double coursePrice;
    private List<Session> listOfSessions;

    public Course() {
    }

    public Course(int courseId, String courseShortTitle, String courseLongTitle, int courseDur, double coursePrice) {
        this(courseId);
        this.courseShortTitle = courseShortTitle;
        this.courseLongTitle = courseLongTitle;
        this.courseDur = courseDur;
        this.coursePrice = coursePrice;

    }

    public Course(int courseId) {
        this.courseId = courseId;
        listOfSessions = new LinkedList<>();
    }

    public void addSession(Session sess) {
        listOfSessions.add(sess);
        sess.setSessionCid(this.getCourseId());
    }

    public void removeSession(Session sess) {
        listOfSessions.remove(sess);
        sess.setSessionCid(0);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseShortTitle() {
        return courseShortTitle;
    }

    public void setCourseShortTitle(String courseShortTitle) {
        this.courseShortTitle = courseShortTitle;
    }

    public int getCourseDur() {
        return courseDur;
    }

    public void setCourseDur(int courseDur) {
        this.courseDur = courseDur;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseLongTitle() {
        return courseLongTitle;
    }

    public void setCourseLongTitle(String courseLongTitle) {
        this.courseLongTitle = courseLongTitle;
    }

    public List<Session> getListOfSessions() {
        return listOfSessions;
    }
}
