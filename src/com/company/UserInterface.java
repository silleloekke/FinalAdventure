package com.company;

import java.util.Scanner;

public class UserInterface {
    public void PreGameIntroduction(){
        Scanner input = new Scanner(System.in);
        System.out.println("               *************************************************************************************************************");
        System.out.println("               |                                                                                                             |");
        System.out.println("               |                                     Welcome to my adventure game!                                           |");
        System.out.println("               |                                                                                                             |");
        System.out.println("               *************************************************************************************************************\n");

       /*System.out.println("Do you wanna play? Yes or no?" );
        String answerYN = input.nextLine();
        if (answerYN.equalsIgnoreCase("YES")) {
            System.out.println();
            //System.out.println();
            System.out.println("Alright then let's go! ");
            System.out.println("But first, enter your age!");
            int ageAnswer = input.nextInt();
            if (ageAnswer >= 18) {
                System.out.println("Enter your gender: M for male, F for female or P for prefer no to say");
                String genderAnswer = input.next();
                if (genderAnswer.equalsIgnoreCase("M")) {
                    System.out.println('\n'+"My lord, you're now ready to play!");

                } else if (genderAnswer.equalsIgnoreCase("F")) {
                    System.out.println('\n'+"My lady, you're now ready to play!");

                }
                if (genderAnswer.equalsIgnoreCase("P")) {
                    System.out.println('\n'+"My liege, you're now ready to play!");

                }
            } else {
                System.out.println("Sorry dude, you have to be 18 or older to play this game ;(");
                System.exit(0);
            }

        } else if (answerYN.equalsIgnoreCase("NO")) {
            System.out.println("Goodbye! See you next time");
            System.exit(0);
        } else {
            System.out.println("Error! Start the game again");
            System.exit(0);
        }*/
    }

    public void introduction() {
        String intro = "You start in one room where you will have the option to go either North, South, East or West, which you type in the console.\n" +
                "But beware! Not all rooms has the ability to go all four ways.\n" +
                "There are also items in the different rooms, that you have the ability to take with you and/or you\n" +
                "you can drop the items as well\n\n" +
                "\tEnter \"Help\" to get the instructions and possible commandos\n" +
                "\tEnter \"Look\" to get a description of the room that you are in \n" +
                "\tEnter \"Exit\" to exit the game\n" +
                "\tEnter \"Take\" + the item you wanna pick up\n" +
                "\tEnter \"Drop\" + the item you wanna pick up\n";
        System.out.println(intro);
    }
}


