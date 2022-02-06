package com.company.Faculty;

public class Test {

    public static void main(String[] args) {

//        Specialty specialty1=new Specialty("Specialty1",100);
//        Specialty specialty2=new Specialty("Specialty2",200);
//        Specialty [] specialties=new Specialty[2];
//        specialties[0]=specialty1;
//        specialties[1]=specialty2;
//
//        specialty1.setApplications(99);
//        specialty2.setApplications(80);
//
//        Faculty faculty=new Faculty();
//       faculty.setSpecialties(specialties);
//
//        System.out.println(faculty.countTotalVacancies());

        Specialty2 specialty1=new Specialty2("Specialty1",100);
        Specialty2 specialty2=new Specialty2("Specialty2",200);
        Specialty2 [] specialties=new Specialty2[2];
        specialties[0]=specialty1;
        specialties[1]=specialty2;

        Enrollee enrollee1=new Enrollee("Sasha",7.5);
        Enrollee enrollee2=new Enrollee("Pasha",8);
        Enrollee[] enrollees1=new Enrollee[2];
        enrollees1[0]=enrollee1;
        enrollees1[1]=enrollee2;
        specialty1.setEnrollees(enrollees1);

        Enrollee enrollee3=new Enrollee("Dasha",9.5);
        Enrollee enrollee4=new Enrollee("Olga",8);
        Enrollee[] enrollees2=new Enrollee[2];
        enrollees2[0]=enrollee3;
        enrollees2[1]=enrollee4;
        specialty2.setEnrollees(enrollees2);

        Faculty2 faculty=new Faculty2();
        faculty.setSpecialties(specialties);

        System.out.println(faculty.countTotalEnrollment());
        System.out.println(faculty.countTotalVacancies());
    }
}
