package org.example;

public class Main {
    static public FrontEnd frontEnd;
    static public BackEnd backEnd;

    public static void main(String [] args) {
        frontEnd = new FrontEnd();;
        backEnd = new BackEnd();
        frontEnd.initialize();
        backEnd.addActionListeners();
    }

}



