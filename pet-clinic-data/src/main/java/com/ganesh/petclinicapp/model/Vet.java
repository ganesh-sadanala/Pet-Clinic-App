package com.ganesh.petclinicapp.model;

public class Vet extends Person{
    private Speciality specialities;

    public Speciality getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Speciality specialities) {
        this.specialities = specialities;
    }
}
