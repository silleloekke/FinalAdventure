package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.setup();
        game.startGame();
    }

}







     /*boolean running = true;
        while (true) {
            System.out.println("What direction do wanna go?");
            System.out.println("Remember you can also type \"help\",\"look\" or \"exit\"");
            String Answer = input.next();
            switch (Answer) {

                case "go north", "GO NORTH", "n" -> player.goNorth();
                case "go south", "GO SOUTH", "s" -> player.goSouth();
                case "go east", "GO EAST", "e" -> player.goEast();
                case "go west", "GO WEST", "w" -> player.goWest();
                case "EXIT", "exit", "Exit" -> {userInterface.Exit();
                    running = false;
                }
                case "HELP", "help", "Help" -> userInterface.Help();
                case "LOOK", "look", "Look" -> player.Look();
                //default -> System.out.println("Sorry try again");
            }
        }*/
