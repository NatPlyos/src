package com.company.Faculty;

import java.util.Arrays;

public class Faculty {
    Specialty[] specialties;



    public Specialty[] getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Specialty[] specialties) {
        this.specialties = specialties;
    }

    public int countTotalEnrollment() {
        int count = 0;
        for (int i = 0; i < specialties.length; i++) {
            count = count + specialties[i].getEnrollment();
        }
        return count;
    }

    public int countTotalApplications() {
        int count = 0;
        for (int i = 0; i < specialties.length; i++) {
            count = count + specialties[i].getApplications();
        }
        return count;
    }

    public int countTotalVacancies() {
        int totalEnrollment = this.countTotalEnrollment();
        int totalApplications = this.countTotalApplications();
        return totalEnrollment < totalApplications ? 0 : totalEnrollment - totalApplications;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "specialties=" + Arrays.toString(specialties) +
                '}';
    }
}
