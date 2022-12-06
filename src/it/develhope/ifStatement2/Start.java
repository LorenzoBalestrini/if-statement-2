package it.develhope.ifStatement2;

public class Start {
    public static void main(String[] args) {
        String mySurname = "Balestrini";

        String result = mySurname.contains("ni") ? "Your surname contains the sequence of letters 'ni'" : "Your surname doesn't contain the sequence of letters 'ni'";

        System.out.println(result);
    }


    }