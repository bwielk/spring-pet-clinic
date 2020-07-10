package com.petclinic.petclinic.model;

public enum PetType {

    CAT("cat"),
    DOG("dog");

    private String type;

    PetType(String petType){
        this.type = petType;
    }

    public String getType() {
        return type;
    }
}
