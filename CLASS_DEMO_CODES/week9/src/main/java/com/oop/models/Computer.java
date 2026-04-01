package com.oop.models;

public class  Computer{

    public void boot(){
        System.out.println("Computer's booting up...");
    }
    
    @Override
    public String toString(){
        return "Computer";
    }

    public void sleep(){
        System.out.println("Zzzzzzzzzzzz....");
    }

}