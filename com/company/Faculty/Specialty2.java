package com.company.Faculty;

public class Specialty2 {

    Enrollee[] enrollees;
    private String name;
    private int enrollment;


    public Specialty2(String name, int enrollment) {
        this.name = name;
        this.enrollment = enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public Enrollee[] getEnrollees() {
        return enrollees;
    }

    public void setEnrollees(Enrollee[] enrollees) {
        this.enrollees = enrollees;
    }


}
