package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private Room currentRoom;
    private Room playerStand;
    private boolean running = true;
    private Item currentItem;
    private ArrayList<Item> PlayerInventory = new ArrayList<>();
    private Item itemLocation;

    //constructor for Player
    public Player(Room currentRoom, Item currentItem) {
        this.currentRoom = currentRoom;
        this.playerStand = null;
        this.currentItem = currentItem;
        this.itemLocation = null;
    }

    //Method that starts the game itself
    public void startGame(){
    Room room = null;
    Item item = null;
    Scanner input = new Scanner(System.in); //Scanner is constructed
        //running is initialized to true, so the while-loop run, until the condition is false
        while (running) {
            System.out.println("What direction do you wanna go?");
            System.out.println("Remember you can also type \"help\",\"look\",\"exit\",\"take\" or \"drop\"");

            //Switch case
            //TODO find ud om det kan laves om til equalsIgnore halløj
            String Answer = input.next();
            switch (Answer) {
                case "go north", "GO NORTH", "n", "north","North" -> room = currentRoom.getNorth();
                case "go south", "GO SOUTH", "s", "south","South" -> room = currentRoom.getSouth();
                case "go east", "GO EAST", "e", "east","East" -> room = currentRoom.getEast();
                case "go west", "GO WEST", "w", "west","West" -> room = currentRoom.getWest();
                case "inventory","inv","invent" -> System.out.println("Test");
                case "take", "Take", "TAKE" -> takeItem(item.ItemName);
                case "drop","Drop","DROP" -> System.out.println("test3");
                case "EXIT", "exit", "Exit" -> Exit();
                case "HELP", "help", "Help" -> Help();
                case "LOOK", "look", "Look" -> Look();
                }
                //If statement where if the room equals null, it will print the string statement.
                 if (room == null){
                     System.out.println("You can't go this way");
                 }
                 //TODO find ud hvad det her gør
                 //if the room is not null, it will then display the name of the new room and its description
                 else {
                     currentRoom.setRoomHasSeen(true);
                     currentRoom = room;
                     itemLocation = item;

                     if(!currentRoom.getRoomHasSeen()) {
                         System.out.println(currentRoom+"\n"+PlayerInventory);
                         System.out.println(itemLocation);
                     }
                 }
            System.out.println();
            System.out.println();
            }
    }

    //private void takeItem(String item) {
    //}

    public void takeItem(String ItemName) {


    }

    public void dropItem(){

    }

    //Method for "look", that tells you what room you're in and the room's description
    public void Look(){
        System.out.println(currentRoom);
        System.out.println("?");
    }
    //Method for "help", that tells you what directions you can go, but not necessarily for the room you're standing in
    public void Help() {
        String help = "You have the option to go either North, South, East or West, which you type in the console\n" +
                "But not all rooms has the ability to go all four ways\n" +
                "You can also take or drop item";
        System.out.println(help);

      }
    //Method for "exit", that exits the game
    public void Exit (){
        System.out.println("Goodbye! See you soon");
        System.exit(0);
      }


      //Methods for directions BUT IS NOT USED
      /*
 public void goNorth() {
     currentRoom = currentRoom.getNorth();
         if (currentRoom == null) {
             System.out.println("You can't go this way");
         } else {
             currentRoom = requestRoom;
             System.out.println("You are standing in: " + currentRoom.toString());
             System.out.println("What direction do you wanna go in?");

         }
     }


public void goSouth() {
    currentRoom = currentRoom.getSouth();
    if (currentRoom == null) {
        System.out.println("You can't go this way");
    } else {
        currentRoom = requestRoom;
        System.out.println("You are standing in: " + currentRoom.toString());
        System.out.println("What direction do you wanna go in?");

    }
}
 public void goEast() {
     currentRoom = currentRoom.getEast();
     if (currentRoom == null) {
         System.out.println("You can't go this way");
     } else {
         currentRoom = requestRoom;
         System.out.println("You are standing in: " + currentRoom.toString());
         System.out.println("What direction do you wanna go in?");

     }
 }
 public void goWest() {
     currentRoom = currentRoom.getWest();
     if (currentRoom == null) {
         System.out.println("You can't go this way");
     } else {
         currentRoom = requestRoom;
         System.out.println("You are standing in: " + currentRoom.toString());
         System.out.println("What direction do you wanna go in?");

     }
 }*/

    //Getters and setters for currentRoom
    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }


    //Getters and setters for the arraylist PlayerInventory
    public ArrayList<Item> getPlayerInventory() {
        return PlayerInventory;
    }
    public void setPlayerInventory(ArrayList<Item> inventory) {
        this.PlayerInventory = PlayerInventory;
    }
}



