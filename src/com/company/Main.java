package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] stringList;
        Scanner scan = new Scanner(System.in);
        System.out.println("What's on your mind?");
        String userInput= scan.nextLine();
        stringList=userInput.split(" ");
        System.out.println(hedge(stringList));

    }


    public static String hedge(String[] stringList){
        for (int i=0;i<stringList.length;i++) {
            if (stringList[i].equals("me")) {
                stringList[i] = "you";
            }
        }
            String result= "";
        for (String word: stringList){
           result=result+" "+word;
        };

        return result;
    }
}
