package com.company;

public class perfectRandom {
    public String Name;
    public int luckyNumber;
    public perfectRandom(String name){
        Name = name;
        luckyNumber = (int)Math.pow(((int)Math.random()*100),2);
    }
}
