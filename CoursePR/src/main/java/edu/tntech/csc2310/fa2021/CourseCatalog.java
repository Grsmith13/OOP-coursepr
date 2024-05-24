package edu.tntech.csc2310.fa2021;

import java.util.ArrayList;

public class CourseCatalog {
    private ArrayList<Course> db;
    private final String subject;
    private final String catalogYear;

    public CourseCatalog( String subject, String catalogYear)
    {
        this.subject = subject;
        this.catalogYear = catalogYear;
    }
    //public Course getCourse(){return number;}

    public String getSubject() {return subject;}

    public String getCatalogYear() {return catalogYear;}
}
