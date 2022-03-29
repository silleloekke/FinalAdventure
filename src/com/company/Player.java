package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private Room currentRoom;

    private ArrayList<Item> inventory;


    //constructor for Player
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        inventory = new ArrayList<>();
    }

    //Getters and setters for currentRoom
    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void takeItem(String itemName) {
        Item item = currentRoom.itemRemove(itemName);

    }

    public void dropItem(String itemName){

    }

    public void goNorth() {
        Room room = currentRoom.getNorth();
        goToRoom(room);
    }

    public void goSouth() {
        Room room = currentRoom.getSouth();
        goToRoom(room);
    }

    public void goEast() {
        Room room = currentRoom.getEast();
        goToRoom(room);
    }

    public void goWest() {
        Room room = currentRoom.getWest();
        goToRoom(room);
    }

    public void goToRoom(Room room) {
        if (room == null){
            System.out.println("You can't go this way");
        } else {
            currentRoom.setRoomHasSeen(true);
            currentRoom = room;

            if(!currentRoom.getRoomHasSeen()) {
                System.out.println(currentRoom+"\n"+currentRoom.getRoomInventory());
            }
        }
    }

}



