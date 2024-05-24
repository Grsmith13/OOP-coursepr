package edu.tntech.csc2310.fa2021;

public class Course{
    private final String subject;
    private final String number;
    private final String title;
    private final String description;
    private final String[] prerequisites;
    private final int credits;


    public  Course(String subject, String number, String title, String description, String[] prerequisites, int credits)
    {
        this.subject = subject;
        this.number = number;
        this.title = title;
        this.description = description;
        this.prerequisites = prerequisites;
        this.credits = credits;
    }

    //public String toStringIO{}

    public String getSubject() {
        return subject;
    }
    public String getNumber() {
        return number;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String[] getPrerequisites() {return prerequisites;}
    public int getCredits(){ return credits;}



}
