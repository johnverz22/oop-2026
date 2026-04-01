package com.oop;

import java.util.Scanner;

import com.oop.models.*;

public class Main {
    public static void main(String[] args) {
        Computer l = new Laptop();
        //ref type -> Computer -> compile time -> supertype -> declared type
        //object type -> Laptop -> run time -> subtype -> actual type

        Computer c = new Computer();
        l.boot();
        //l.shutdown();
        l.sleep();
        
        
        repair(c);
        repair(l);
        repair(new Scanner(System.in));
        Laptop[] ls = new Laptop[5];
        ls[0] = new Laptop();
        ls[1] = new Laptop();
        repair(ls);

        String[] hellos = {"Hi Kai", "Hi Aaron", "Hi Jelee"};
        someMethod(hellos);
        someMethod("hello", "hello", "hi");
    }

    public static void repair(Object... device){
        System.out.println(device.length);
    }

    public static void someMethod(String... words){
        for(String word: words){
            System.out.println(word);
        }
    }
}