package com.company.Faculty;

public class Specialty {
    private String name;
    private int enrollment;
    private int applications;

    public Specialty(String name, int enrollment) {
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

    public int getApplications() {
        return applications;
    }

    public void setApplications(int applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "name='" + name + '\'' +
                ", enrollment=" + enrollment +
                ", applications=" + applications +
                '}';
    }
}
