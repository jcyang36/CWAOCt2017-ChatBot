package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] stringList;
        Scanner scan = new Scanner(System.in);
        System.out.println("Good day.  What is your problem?  Enter your response here or Q to quit: ");
        String userInput= scan.nextLine();
        while (!userInput.equalsIgnoreCase("Q")) {
            stringList = userInput.split(" ");
            System.out.println(respondDeeper(stringList));
            System.out.println("Enter your response here or Q to quit: ");
            userInput= scan.nextLine();
        }
    }

    public static String focusOnMe(){
        Random random = new Random();
        int intStatement=random.nextInt(3);
        String[] statementArray = new String[3];
        statementArray[0]="Please tell me more ";
        statementArray[1]="Many of my patients tell me the same thing ";
        statementArray[2]="It is getting late, maybe we had better quit ";
        return statementArray[intStatement];
    }

    public static String respondDeeper(String[] stringList){
        for (int i=0;i<stringList.length;i++) {
            if (stringList[i].equalsIgnoreCase("I")) {
                stringList[i] = "you";
            }
            if (stringList[i].equals("me")) {
                stringList[i] = "you";
            }
            if (stringList[i].equals("my")) {
                stringList[i] = "your";
            }
            if (stringList[i].equals("am")) {
                stringList[i] = "are";
            }
        }
         Random random = new Random();
        int intAnswer=random.nextInt(3);
        String[] answerArray = new String[3];
        answerArray[0]= "You seem to think that ";
        answerArray[1]="Why do you say that";
        answerArray[2]="So, you are concerned that";
        String result= "";

        result=result+answerArray[intAnswer];
        for (String word: stringList){
           result=result+" "+word;
        };

        return result;


    }
}
