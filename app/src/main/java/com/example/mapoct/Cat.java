package com.example.mapoct;

public class Cat {
    String Cat_name;
    private String habitat;
    public String physical_appearance;
    private int weight;
    protected String diet;
    public String chase_animal = "running";

    public String huntPrey(){
       chase_animal = "Cat chasing animal ....";
       return chase_animal;
    }
    public void make_sound(){
        this.Cat_name = "Lion";
    }

    private int cat_walk(){
        this.weight = 24;
        return weight;
    }
}
