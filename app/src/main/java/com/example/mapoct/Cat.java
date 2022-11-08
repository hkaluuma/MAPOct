package com.example.mapoct;

public class Cat {
    //our variables/ attributes/ state/ properties/ characteristics

    //Declaring variables
    String Cat_name;
    private String habitat;
    public String physical_appearance;
    private int weight;
    protected String diet;
    public String chase_animal = "running";

    //operations/ methods/ behaviour
    //method huntprey
    public String huntPrey(){
       chase_animal = "Cat chasing animal ....";
       return chase_animal;
    }

    //method make sound
    public void make_sound(){
        this.Cat_name = "Lion";
    }

    //method cat walk
    private int cat_walk(){
        weight = 24;
        return weight;
    }




}
